package br.com.agibank.beans;

import java.time.LocalDate;

public class Funcionario {
    private int id_funcionario;
    private int id_usuario;
    private String funcao;

    public Funcionario(int id_funcionario, int id_usuario, String funcao) {
        this.id_funcionario = id_funcionario;
        this.id_usuario = id_usuario;
        this.funcao = funcao;
    }

    public Funcionario(int id_usuario, String funcao) {
        this.id_usuario = id_usuario;
        this.funcao = funcao;
    }

    public int getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(int id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}