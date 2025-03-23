package br.com.agibank.dao;

import br.com.agibank.Conexao;
import br.com.agibank.beans.Cliente;
import br.com.agibank.beans.Funcionario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClienteDAO {
    private Connection con;
    private PreparedStatement stmt;
    private ResultSet rs;

    public ClienteDAO() throws SQLException {
        con = Conexao.getConexao();
    }

    public void fecharConexao() throws  SQLException {
        con.close();
    }

    public int criarCliente(Cliente cliente) throws SQLException {
        final String sql = "INSERT INTO Cliente(id_cliente, id_usuario) VALUES(?,?)";
        stmt = con.prepareStatement(sql);

        stmt.setInt(1,cliente.getId_cliente());
        stmt.setInt(2, cliente.getId_usuario());
        return stmt.executeUpdate();
    }
}
