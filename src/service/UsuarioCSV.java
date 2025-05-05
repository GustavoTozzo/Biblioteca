package service;

import model.Usuario;
import java.io.*;
import java.util.*;

public class UsuarioCSV {
    public static void salvarClientes(List<Usuario> clientes, String caminhoArquivo) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo));

        // Escrevendo o cabeçalho
        writer.write("id;nomeCompleto;email;cpf");
        writer.newLine();

        // Escrevendo os dados
        for (Usuario cliente : clientes) {
            writer.write(cliente.toCSV());
            writer.newLine();
        }

        writer.close();
    }

    public static List<Usuario> carregarClientes(String caminhoArquivo) throws IOException {
        List<Usuario> clientes = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(caminhoArquivo));

        String linha;
        boolean primeiraLinha = true;

        while ((linha = reader.readLine()) != null) {
            if (primeiraLinha) {
                primeiraLinha = false; // Ignora o cabeçalho
                continue;
            }
            clientes.add(Usuario.fromCSV(linha));
        }

        reader.close();
        return clientes;
    }
}
