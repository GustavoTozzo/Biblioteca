package model;

public class Usuario {
    private int id;
    private String nomeCompleto;
    private String email;
    private String cpf;

    public Usuario(int id, String nomeCompleto, String email, String cpf) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.cpf = cpf;
    }

    public String toCSV() {
        return id + ";" + nomeCompleto + ";" + email + ";" + cpf;
    }

    public static Usuario fromCSV(String csv) {
        String[] parts = csv.split(";");
        return new Usuario(
                Integer.parseInt(parts[0]),
                parts[1],
                parts[2],
                parts[3]
        );
    }
}
