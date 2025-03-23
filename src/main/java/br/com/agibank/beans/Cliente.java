package br.com.agibank.beans;

public class Cliente {
    private int id_cliente;
    private int id_usuario;

    public Cliente(int id_cliente, int id_usuario) {
        this.id_cliente = id_cliente;
        this.id_usuario = id_usuario;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
}
