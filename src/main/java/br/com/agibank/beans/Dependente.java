package br.com.agibank.beans;

public class Dependente {
    private int id_dependente;
    private int id_responsavel;
    private int id_usuario;
    private String parentesco;

    public Dependente(int id_dependente, int id_responsavel, int id_usuario, String parentesco) {
        this.id_dependente = id_dependente;
        this.id_responsavel = id_responsavel;
        this.id_usuario = id_usuario;
        this.parentesco = parentesco;
    }

    public Dependente() {

    }

    public int getId_dependente() {
        return id_dependente;
    }

    public void setId_dependente(int id_dependente) {
        this.id_dependente = id_dependente;
    }

    public int getId_responsavel() {
        return id_responsavel;
    }

    public void setId_responsavel(int id_responsavel) {
        this.id_responsavel = id_responsavel;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }
}
