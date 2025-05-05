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

    public static List<Livro> carregarLivros(String caminhoArquivo) throws IOException {
        List<Livro> livros = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(caminhoArquivo));
        String linha;
        boolean primeiraLinha = true;
        while ((linha = reader.readLine()) != null) {
            if (primeiraLinha) {
                primeiraLinha = false;
                continue;
            }
            livros.add(Livro.fromCSV(linha));
        }
        reader.close();
        return livros;
    }
}
