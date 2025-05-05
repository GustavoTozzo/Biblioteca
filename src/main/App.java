package main;

import model.*;
import service.*;

import java.io.IOException;
import java.time.LocalDate;
import java.util.*;

public class App {
    public static void main(String[] args) {
        try {
            Usuario u1 = new Usuario(1, "Gustavo", "gustavo@gmail.com", "12345678900");
            Usuario u2 = new Usuario(2, "Julia", "julia@gmail.com", "98765432100");
            Usuario u3 = new Usuario(3, "Sara", "sara@gmail.com", "125248242455");


            Livro l1 = new Livro(1, "O Senhor dos Anéis", "J.R.R. Tolkien", "Fantasia épica com elfos, anões e um grande anel", "Fantasia", "capa1.jpg");
            Livro l2 = new Livro(2, "Dom Quixote", "Miguel de Cervantes", "A história de um cavaleiro enlouquecido pela leitura", "Clássico", "capa2.jpg");
            Livro l3 = new Livro(3, "1984", "George Orwell", "Uma distopia sobre um regime totalitário", "Ficção científica", "capa3.jpg");
            Livro l4 = new Livro(4, "Harry Potter e a Pedra Filosofal", "J.K. Rowling", "A magia começa com o jovem Harry Potter e seus amigos", "Fantasia", "capa4.jpg");
            Livro l5 = new Livro(5, "O Hobbit", "J.R.R. Tolkien", "A jornada de Bilbo Bolseiro em busca de um tesouro", "Fantasia", "capa5.jpg");


            List<Assinatura> assinaturas = Arrays.asList(
                    new Assinatura(1, u3, LocalDate.of(2024, 12, 25), LocalDate.of(2025, 2, 21))
            );

            List<Livro> livros = Arrays.asList(l1);

            List<Aluguel> alugueis = Arrays.asList(
                    new Aluguel(1, u2, l1, LocalDate.of(2025, 5, 8), LocalDate.of(2025, 5, 15)),
                    new Aluguel(2, u1, l4, LocalDate.of(2025, 4, 12), LocalDate.of(2025, 5, 15)),
                    new Aluguel(3, u1, l2, LocalDate.of(2025, 8, 12), LocalDate.of(2025, 5, 15))
            );

            UsuarioCSV.salvarClientes(Arrays.asList(u1, u2, u3), "extracao/usuarios.csv");

            AssinaturaCSV.salvarAssinaturas(assinaturas, "extracao/assinaturas.csv");
            LivroCSV.salvarLivros(livros, "extracao/livros.csv");
            AluguelCSV.salvarAlugueis(alugueis, "extracao/alugueis.csv");

            System.out.println("Dados salvos com sucesso!");

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
