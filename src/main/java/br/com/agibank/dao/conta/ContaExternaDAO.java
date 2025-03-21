package br.com.agibank.dao.conta;

import br.com.agibank.beans.conta.ContaExterna;
import br.com.agibank.beans.conta.ContaSalario;
import br.com.agibank.dao.Conexao;
import com.mysql.cj.xdevapi.JsonValue;

import java.sql.*;

public class ContaExternaDAO {

    private Connection con;
    private PreparedStatement stmt;
    private ResultSet rs;

    public ContaExternaDAO() throws SQLException {
        con = Conexao.getConexao();
    }

    public void fecharConexao() throws SQLException {
        con.close();
    }

    public int cadastrarContaExterna(String json) throws SQLException {

        final String sql = "INSERT INTO Conta_Externa(dados_conta_externa) VALUES(?)";

        stmt = con.prepareStatement(sql);
        stmt.setString(1, json);

        return stmt.executeUpdate();
    }

    public String buscarContaExterna(int id) throws SQLException {

        final String sql = "SELECT * FROM Conta_Externa WHERE id_conta_externa = ?";

        ContaExterna contaExterna = new ContaExterna();

        stmt = con.prepareStatement(sql);
        stmt.setInt(1, id);
        rs = stmt.executeQuery();

        if(rs.next()){

            contaExterna.setIdContaExterna(rs.getInt("get_conta_externa"));
            contaExterna.setDadosContaExterna(rs.getString("dados_conta_externa"));

            return contaExterna.toString();

        }else return "Deu errado irmao";

    }

    public int atualizarContaExterna(String json, int idContaExterna) throws SQLException {

        final String sql = "UPDATE Conta_Salario SET dados_conta_externa = ? WHERE id_conta_externa = ?";

        stmt = con.prepareStatement(sql);
        stmt.setString(1, json);

        return stmt.executeUpdate();
    }

    public int deletarContaExterna(int id) throws SQLException {

        final String sql = "DELETE FROM Conta_Externa WHERE id_conta_externa = ?";

        stmt = con.prepareStatement(sql);
        stmt.setInt(1, id);

        return stmt.executeUpdate();

    }

}
