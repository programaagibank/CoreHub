package br.com.agibank.beans.conta;

import java.util.Date;

public class Conta {

    private int idConta;
    private int idUsuario;
    private int idTipo;
    private double idClasse;
    private int idAgencia;
    private int numero;
    private double saldo;
    private Date dataAbertura;
    private String status;

    public Conta(int idConta, int idUsuario, int idTipo, double idClasse, int idAgencia, int numero, double saldo, Date dataAbertura, String status) {
        this.idConta = idConta;
        this.idUsuario = idUsuario;
        this.idTipo = idTipo;
        this.idClasse = idClasse;
        this.idAgencia = idAgencia;
        this.numero = numero;
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
        this.status = status;
    }

    public Conta(){}

    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public double getIdClasse() {
        return idClasse;
    }

    public void setIdClasse(double idClasse) {
        this.idClasse = idClasse;
    }

    public int getIdAgencia() {
        return idAgencia;
    }

    public void setIdAgencia(int idAgencia) {
        this.idAgencia = idAgencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public java.sql.Date getDataAbertura() {
        return (java.sql.Date) dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "idConta=" + idConta +
                ", idUsuario=" + idUsuario +
                ", idTipo=" + idTipo +
                ", idClasse=" + idClasse +
                ", idAgencia=" + idAgencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                ", dataAbertura=" + dataAbertura +
                ", status='" + status + '\'' +
                '}';
    }
}
