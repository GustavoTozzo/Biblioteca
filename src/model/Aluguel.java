package model;

import java.time.LocalDate;

public class Aluguel {
    private int id;
    private Usuario usuario;
    private Livro livro;
    private LocalDate dataInicio;
    private LocalDate dataFim;

    public Aluguel(int id, Usuario usuario, Livro livro, LocalDate dataInicio, LocalDate dataFim) {
        this.id = id;
        this.usuario = usuario;
        this.livro = livro;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public String toCSV() {
        return id + ";" + usuario.toCSV() + ";" + livro.toCSV() + ";" + dataInicio + ";" + dataFim;
    }
}
