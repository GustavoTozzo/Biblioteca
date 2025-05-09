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
}
