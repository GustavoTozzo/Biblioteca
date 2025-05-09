package service;

import model.Livro;
import java.io.*;
import java.util.*;

public class LivroCSV {
    public static void salvarLivros(List<Livro> livros, String caminhoArquivo) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo));
        writer.write("id;titulo;autor;descricao;categoria;imagemCapa");
        writer.newLine();
        for (Livro l : livros) {
            writer.write(l.toCSV());
            writer.newLine();
        }
        writer.close();
    }
}
