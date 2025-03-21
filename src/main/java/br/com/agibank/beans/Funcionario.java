package br.com.agibank.beans;

import java.time.LocalDate;

public class Funcionario extends Usuario{
    private int id_funcionario;
    private String funcao;

    public Funcionario(int id_funcionario, int id_usuario, String funcao, String nome, String apelido, String senha, String email, int telefone, LocalDate data_nascimento, String rua, int numero, String complemento) {
        super(id_usuario,nome, apelido, senha, email, telefone, data_nascimento, rua, numero, complemento);
        this.id_funcionario = id_funcionario;
        this.funcao = funcao;
    }

    public Funcionario(int id_usuario, String nome, String apelido, String senha, String email, int telefone, LocalDate data_nascimento, String rua, int numero, String complemento) {
        super(id_usuario,nome, apelido, senha, email, telefone, data_nascimento, rua, numero, complemento);

    }

    public Funcionario() {
        super();
    }

    public int getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(int id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}