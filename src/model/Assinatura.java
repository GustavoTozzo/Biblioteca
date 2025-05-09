package model;

import java.time.LocalDate;

public class Assinatura {
    private int id;
    private Usuario usuario;
    private LocalDate dataInicio;
    private LocalDate dataFim;

    public Assinatura(int id, Usuario usuario, LocalDate dataInicio, LocalDate dataFim) {
        this.id = id;
        this.usuario = usuario;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public String toCSV() {
        return id + ";" + usuario.toCSV() + ";" + dataInicio + ";" + dataFim;
    }
}
