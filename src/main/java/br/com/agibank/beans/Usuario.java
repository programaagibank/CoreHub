package br.com.agibank.beans;

import java.util.Date;

public class Usuario {
    private int usuario;
    private String nome;
    private String apelido;
    private String senha;
    private String email;
    private int telefone;
    private Date data_nascimento;
    private String rua;
    private int numero;
    private String complemento;

    public Usuario(int usuario, String nome, String apelido, String senha, String email, int telefone, Date data_nascimento, String rua, int numero, String complemento) {
        this.usuario = usuario;
        this.nome = nome;
        this.apelido = apelido;
        this.senha = senha;
        this.email = email;
        this.telefone = telefone;
        this.data_nascimento = data_nascimento;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
    }

    public Usuario(int numero, String rua, Date data_nascimento, int telefone, String email, String senha, String nome, String apelido, int usuario) {
        this.numero = numero;
        this.rua = rua;
        this.data_nascimento = data_nascimento;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
        this.nome = nome;
        this.apelido = apelido;
        this.usuario = usuario;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
