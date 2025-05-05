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

    public static Aluguel fromCSV(String csv) {
        String[] parts = csv.split(";", 12);
        Usuario usuario = Usuario.fromCSV(parts[1] + ";" + parts[2] + ";" + parts[3] + ";" + parts[4]);
        Livro livro = Livro.fromCSV(parts[5] + ";" + parts[6] + ";" + parts[7] + ";" + parts[8] + ";" + parts[9] + ";" + parts[10]);
        return new Aluguel(
                Integer.parseInt(parts[0]),
                usuario,
                livro,
                LocalDate.parse(parts[11]),
                LocalDate.parse(parts[12])
        );
    }
}
