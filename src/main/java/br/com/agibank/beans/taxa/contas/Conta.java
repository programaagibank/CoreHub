package br.com.agibank.beans.taxa.contas;

import java.time.LocalDate;

public class Conta {
    private int idConta;
    private int idUsuario;
    private int tipo;
    private int classe;
    private int agencia;
    private int numero;
    private double saldo;
    private LocalDate dataAbertura;
    private String status;

    public Conta(int idUsuario, int tipo, int classe, int agencia, int numero, double saldo, LocalDate dataAbertura, String status) {
        this.idUsuario = idUsuario;
        this.tipo = tipo;
        this.classe = classe;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
        this.status = status;
    }

    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        if (idUsuario <= 0) throw new IllegalArgumentException("idUsuario deve ser maior que 0");
        this.idConta = idConta;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getTipo() {
        if (tipo <= 0) throw new IllegalArgumentException("Tipo de conta deve ser maior que 0");
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getClasse() {
        return classe;
    }

    public void setClasse(int classe) {
        if (classe <= 0) throw new IllegalArgumentException("classe deve ser maior que 0");
        this.classe = classe;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0) throw new IllegalArgumentException("agencia deve ser maior que zero");
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0) throw new IllegalArgumentException("numero deve ser maior que zero");
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0) throw new IllegalArgumentException("saldo não pode ser negativo");
        this.saldo = saldo;
    }

    public LocalDate getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(LocalDate dataAbertura) {
        if (dataAbertura == null) throw new IllegalArgumentException("dataAbertura não pode ser nula");
        this.dataAbertura = dataAbertura;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
