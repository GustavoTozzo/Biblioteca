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

}
