package br.com.agibank.dao.transacoes;

import br.com.agibank.beans.transacoes.ContaExterna;
import br.com.agibank.dao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ContaExternaDAO {
    private Connection con;
    private PreparedStatement stmt;
    private ResultSet rs;

    public ContaExternaDAO() throws SQLException {
        con = Conexao.getConexao();
    }

    public int criarContaExterna(String jsonContaExterna) throws SQLException {
        final String sql = "INSERT INTO Conta_Externa (dados_conta_externa) VALUES (?)";
        stmt = con.prepareStatement(sql);
        stmt.setString(1, jsonContaExterna);
        return stmt.executeUpdate();
    }

    public ContaExterna consultarContaExterna(int id) throws SQLException {
        ContaExterna contaExterna =  new ContaExterna();
        final String sql = "SELECT * FROM Conta_Externa WHERE id = ?";
        stmt = con.prepareStatement(sql);
        stmt.setInt(1, id);
        rs = stmt.executeQuery();
        while (rs.next()) {
            contaExterna.setId(rs.getInt("id"));
            contaExterna.setJsonContaExterna(rs.getString("jsonContaExterna"));
        }
        return contaExterna;
    }

    public ContaExterna consultarContaExterna(String jsonContaExterna) throws SQLException {
        ContaExterna contaExterna =  new ContaExterna();
        final String sql = "SELECT * FROM Conta_Externa WHERE jsonContaExterna = ?";
        stmt = con.prepareStatement(sql);
        stmt.setString(1, jsonContaExterna);
        rs = stmt.executeQuery();
        if (rs.next()) {
            contaExterna.setId(rs.getInt("id"));
            contaExterna.setJsonContaExterna(rs.getString("jsonContaExterna"));
        }
        return contaExterna;
    }

    public int atualizarContaExterna(int id, String jsonContaExterna) throws SQLException {
        final String sql = "UPDATE Conta_Externa SET jsonContaExterna = ? WHERE id = ?";
        stmt = con.prepareStatement(sql);
        stmt.setString(1, jsonContaExterna);
        stmt.setInt(2, id);
        return stmt.executeUpdate();
    }

    public int deletarContaExterna(int id) throws SQLException {
        final String sql = "DELETE FROM Conta_Externa WHERE id = ?";
        stmt = con.prepareStatement(sql);
        stmt.setInt(1, id);
        return stmt.executeUpdate();
    }
}
