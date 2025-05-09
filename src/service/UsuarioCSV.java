package service;

import model.Usuario;
import java.io.*;
import java.util.*;

public class UsuarioCSV {
    public static void salvarClientes(List<Usuario> clientes, String caminhoArquivo) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo));

        writer.write("id;nomeCompleto;email;cpf");
        writer.newLine();

        for (Usuario cliente : clientes) {
            writer.write(cliente.toCSV());
            writer.newLine();
        }

        writer.close();
    }
}
