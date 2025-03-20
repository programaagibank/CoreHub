package br.com.agibank.dao;

import br.com.agibank.beans.Usuario;

import java.sql.*;

public class UsuarioDAO {
    private Connection con;
    private PreparedStatement stmt;
    private ResultSet rs;

    public UsuarioDAO() throws SQLException {
        con = Conexao.getConexao();
    }

    public void fecharConexao() throws SQLException {
        con.close();
    }

    public int criarUsuario(Usuario usuario) throws SQLException {
        final String sql = "INSERT INTO Usuario (nome, apelido, senha, email, telefone, data_nascimento, rua, numero, complemento) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        stmt = con.prepareStatement(sql);

        stmt.setString(1, usuario.getNome());
        stmt.setString(2, usuario.getApelido());
        stmt.setString(3, usuario.getSenha());
        stmt.setString(4, usuario.getEmail());
        stmt.setInt(5, usuario.getTelefone());
        stmt.setDate(6, Date.valueOf(usuario.getData_nascimento()));
        stmt.setString(7, usuario.getRua());
        stmt.setInt(8, usuario.getNumero());
        stmt.setString(9, usuario.getComplemento());
        return stmt.executeUpdate();
    }
}