package br.com.agibank.dao;

import br.com.agibank.beans.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

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
    public int criarUsuario(String nome, String apelido, String senha, int telefone, Date data_nascimento, String rua, int numero, String complemento) throws  SQLException {
        final String sql = "INSERT INTO Usuario(nome, apelido, senha, email, telefone, data_nascimento, rua, numero, complemento) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        stmt = con.prepareStatement(sql);
        stmt.setString(1, nome);
        stmt.setString(2, apelido);
        stmt.setString(3, senha);
        stmt.setInt(4, telefone);
        stmt.setDate(5, data_nascimento, );
        stmt.setString(6, rua);
        stmt.setInt(7, numero);
        stmt.setString(8, complemento);
    }
}
