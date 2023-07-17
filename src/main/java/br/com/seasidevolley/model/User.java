package br.com.seasidevolley.model;

public class User {

    private int id;
    private String cpf;
    private String email;

    public void setId(int id) {
        this.id = id;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;



    public int getId() {
        return id;
    }
    public String getCpf() {
        return cpf;
    }
    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }


}
