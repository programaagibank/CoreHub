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

    public int criarDependente(Dependente dependente) throws SQLException {
        final String sql = "INSERT INTO Dependente (id_responsavel, id_usuario, parentesco)VALUES (?,?,?)";
        stmt = con.prepareStatement(sql);
        stmt.setInt(1, dependente.getId_responsavel());
        stmt.setInt(2, dependente.getId_usuario());
        stmt.setString(3, dependente.getParentesco());
        return stmt.executeUpdate();
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
