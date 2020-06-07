package model;

public class Genero {
    
    private int id_genero;
    private String tipo;
    private String classificao;

    public Genero(int id_genero, String tipo, String classificao) {
        this.id_genero = id_genero;
        this.tipo = tipo;
        this.classificao = classificao;
    }

    public Genero() {
    }

    public int getId_genero() {
        return id_genero;
    }

    public void setId_genero(int id_genero) {
        this.id_genero = id_genero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getClassificao() {
        return classificao;
    }

    public void setClassificao(String classificao) {
        this.classificao = classificao;
    }

    @Override
    public String toString() {
        return  "" + id_genero;
    }
    
    
    
}
