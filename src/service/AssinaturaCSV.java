package service;

import model.Assinatura;
import java.io.*;
import java.util.*;

public class AssinaturaCSV {
    public static void salvarAssinaturas(List<Assinatura> assinaturas, String caminhoArquivo) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo));
        writer.write("id;idUsuario;nomeCompleto;email;cpf;dataInicio;dataFim");
        writer.newLine();
        for (Assinatura a : assinaturas) {
            writer.write(a.toCSV());
            writer.newLine();
        }
        writer.close();
    }

    public static List<Assinatura> carregarAssinaturas(String caminhoArquivo) throws IOException {
        List<Assinatura> assinaturas = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(caminhoArquivo));
        String linha;
        boolean primeiraLinha = true;
        while ((linha = reader.readLine()) != null) {
            if (primeiraLinha) {
                primeiraLinha = false;
                continue;
            }
            assinaturas.add(Assinatura.fromCSV(linha));
        }
        reader.close();
        return assinaturas;
    }
}
