package model;

public class Livro {
    private int id;
    private String titulo;
    private String autor;
    private String descricao;
    private String categoria;
    private String imagemCapa;

    public Livro(int id, String titulo, String autor, String descricao, String categoria, String imagemCapa) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.descricao = descricao;
        this.categoria = categoria;
        this.imagemCapa = imagemCapa;
    }

    public String toCSV() {
        return id + ";" + titulo + ";" + autor + ";" + descricao + ";" + categoria + ";" + imagemCapa;
    }

    public static Livro fromCSV(String csv) {
        String[] parts = csv.split(";");
        return new Livro(
                Integer.parseInt(parts[0]),
                parts[1],
                parts[2],
                parts[3],
                parts[4],
                parts[5]
        );
    }
}
