package service;

import model.Aluguel;
import java.io.*;
import java.util.*;

public class AluguelCSV {
    public static void salvarAlugueis(List<Aluguel> alugueis, String caminhoArquivo) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo));
        writer.write("id;idUsuario;nomeCompleto;email;cpf;idLivro;titulo;autor;descricao;categoria;imagemCapa;dataInicio;dataFim");
        writer.newLine();
        for (Aluguel a : alugueis) {
            writer.write(a.toCSV());
            writer.newLine();
        }
        writer.close();
    }
}
