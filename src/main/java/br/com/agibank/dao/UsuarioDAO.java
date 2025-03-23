package br.com.agibank.dao;

import br.com.agibank.Conexao;
import br.com.agibank.Main;
import br.com.agibank.beans.Usuario;

import java.sql.*;
import java.time.LocalDate;

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

    public int atualizarCadastroUsuario(String nome, String apelido, String senha, String email, int telefone, LocalDate data_nascimento, String rua, int numero, String complemento, int id_usuario) throws SQLException {
        final String sql = "UPDATE Usuario SET nome = ?, apelido = ?, senha = ?, email = ?, telefone = ?, data_nascimento = ?, rua = ?, numero = ?, complemento = ? WHERE id_usuario = ?";
        stmt = con.prepareStatement(sql);

        stmt.setString(1, nome);
        stmt.setString(2, apelido);
        stmt.setString(3, senha);
        stmt.setString(4, email);
        stmt.setInt(5, telefone);
        stmt.setDate(6, Date.valueOf(String.valueOf(data_nascimento)));
        stmt.setString(7, rua);
        stmt.setInt(8, numero);
        stmt.setString(9, complemento);
        stmt.setInt(10, id_usuario);
        return stmt.executeUpdate();
    }

    public void deletarUsuario(int id_usuario) throws SQLException {
        final String sql = "DELETE FROM Usuario WHERE id_usuario = ?";
        stmt = con.prepareStatement(sql);

        stmt.setInt(1, id_usuario);
        stmt.executeUpdate();
    }
}