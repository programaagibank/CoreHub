package br.com.agibank.dao;

import br.com.agibank.Conexao;
import br.com.agibank.beans.Dependente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DependenteDAO {
    private Connection con;
    private PreparedStatement stmt;
    private ResultSet rs;

    public DependenteDAO() throws SQLException {
        con = Conexao.getConexao();
    }

    public void fecharConexao() throws SQLException {
        con.close();
    }

    public Dependente buscarDependente(int id) throws SQLException {
        Dependente dependente = new Dependente();
        final String sql = "SELECT * FROM Dependente WHERE id = ?";
        stmt = con.prepareStatement(sql);
        stmt.setInt(1, id);
        rs = stmt.executeQuery();

        if (rs.next()){
            dependente.setId_dependente(rs.getInt("id_dependente"));
            dependente.setId_responsavel(rs.getInt("id_responsavel"));
            dependente.setId_usuario(rs.getInt("id_usuario"));
            dependente.setParentesco(rs.getString("parentesco"));
        }
        return dependente;
    }

    public int deletarDependente(int id) throws SQLException {
        final String sql = "DELETE FROM Dependente WHERE id = ?";
        stmt = con.prepareStatement(sql);
        stmt.setInt(1, id);
        return stmt.executeUpdate();
    }

}
