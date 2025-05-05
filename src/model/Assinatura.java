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

    public static Assinatura fromCSV(String csv) {
        String[] parts = csv.split(";", 8);
        Usuario usuario = Usuario.fromCSV(parts[1] + ";" + parts[2] + ";" + parts[3] + ";" + parts[4]);
        return new Assinatura(
                Integer.parseInt(parts[0]),
                usuario,
                LocalDate.parse(parts[5]),
                LocalDate.parse(parts[6])
        );
    }
}
