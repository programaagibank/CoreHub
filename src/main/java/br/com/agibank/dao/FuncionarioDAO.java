package br.com.agibank.dao;

import br.com.agibank.beans.Funcionario;
import br.com.agibank.beans.Usuario;

import java.sql.*;

public class FuncionarioDAO extends UsuarioDAO{
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

    @Override
    public int criarUsuario(Usuario usuario) throws SQLException {
        Funcionario funcionario = (Funcionario) usuario;
        int id_usuario = pegarIDUsuario(usuario);
        int resultadoUsuario = super.criarUsuario(usuario);

        if (resultadoUsuario > 0) {
            final String sql = "INSERT INTO Funcionario(id_usuario,funcao) VALUES(?,?)";
            stmt = con.prepareStatement(sql);

            stmt.setInt(1,id_usuario);
            stmt.setString(2, funcionario.getFuncao());


        }
        return stmt.executeUpdate();
    }



}
