package model;

public class Usuario {

    private int id;
    private String login;
    private String senha;
    private String admin;

    public Usuario(String login, String senha, String admin) {
        this.login = login;
        this.senha = senha;
        this.admin = admin;
    }

    public Usuario() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public String getAdmin() {
        return admin;
    }

}
