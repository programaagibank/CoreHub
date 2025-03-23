package br.com.agibank.dao;

import br.com.agibank.Conexao;
import br.com.agibank.Main;
import br.com.agibank.beans.Funcionario;
import br.com.agibank.beans.Usuario;

import java.sql.*;

public class FuncionarioDAO{
    private Connection con;
    private PreparedStatement stmt;
    private ResultSet rs;

    public FuncionarioDAO() throws SQLException {
        con = Conexao.getConexao();
    }

    public void fecharConexao() throws  SQLException {
        con.close();
    }

    public int pegarIDUsuario(Usuario usuario) throws  SQLException {
        int id =0;
        final String sql = "SELECT id_usuario  FROM Usuario WHERE apelido = ?";
        stmt = con.prepareStatement(sql);
        stmt.setString(1, usuario.getApelido());
        ResultSet rs = stmt.executeQuery();
        if(rs.next()){
            id = rs.getInt("id_usuario");
        }

        return id;
    }

//    public int criarFuncionario(Funcionario funcionario) throws SQLException {
//        Usuario usuario = new Usuario();
//        int id_usuario = pegarIDUsuario(usuario);
//
//        if (id_usuario > 0) {
//            final String sql = "INSERT INTO Funcionario(id_usuario,funcao) VALUES(?,?)";
//            stmt = con.prepareStatement(sql);
//
//            stmt.setInt(1,id_usuario);
//            stmt.setString(2, funcionario.getFuncao());
//
//
//        }
//        return stmt.executeUpdate();
//    }

    public int criarFuncionario(Funcionario funcionario) throws SQLException {
        final String sql = "INSERT INTO Funcionario(id_usuario,funcao) VALUES(?,?)";
        stmt = con.prepareStatement(sql);

        stmt.setInt(1,funcionario.getId_usuario());
        stmt.setString(2, funcionario.getFuncao());
        return stmt.executeUpdate();
    }



}
