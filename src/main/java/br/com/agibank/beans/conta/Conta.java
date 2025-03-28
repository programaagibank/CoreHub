package br.com.agibank.beans.conta;

import java.util.Date;

public class Conta {

    private int idConta;
    private int idUsuario;
    private int idTipo;
    private String tipo;
    private double idClasse;
    private String tipoClasse;
    private int idAgencia;
    private int numero;
    private double saldo;
    private Date dataAbertura;
    private String status;
    private int score;

    public Conta(){}

    public Conta(int idConta, int idUsuario, int idTipo, String tipo, double idClasse, String tipoClasse, int idAgencia, int numero, double saldo, Date dataAbertura, String status, int score) {
        this.idConta = idConta;
        this.idUsuario = idUsuario;
        this.idTipo = idTipo;
        this.tipo = tipo;
        this.idClasse = idClasse;
        this.tipoClasse = tipoClasse;
        this.idAgencia = idAgencia;
        this.numero = numero;
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
        this.status = status;
        this.score = score;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipoClasse() {
        return tipoClasse;
    }

    public void setTipoClasse(String tipoClasse) {
        this.tipoClasse = tipoClasse;
    }

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

    public Date getDataAbertura() {
        return dataAbertura;
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
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
               ", score=" + score +
               '}';
    }

    
    public String conta(){
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
               ", score=" + score +
               '}';
    }
}
