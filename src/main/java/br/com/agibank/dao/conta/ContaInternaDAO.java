package br.com.agibank.dao.conta;

import br.com.agibank.beans.conta.ContaInterna;
import br.com.agibank.dao.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;

public class ContaInternaDAO {

    private Connection con;
    private PreparedStatement stmt;
    private ResultSet rs;

    public ContaInternaDAO() throws SQLException {
        con = Conexao.getConexao();
    }

    public void fecharConexao() throws SQLException {
        con.close();
    }

    public int cadastrarConta(ContaInterna conta) throws SQLException {
        final String sql = "INSERT INTO ContaInterna (id_lista_contas, id_usuario, id_tipo, id_classe, id_classe, id_agencia, numero, saldo, data_abertura, status) VALUES (?,?,?,?,?,?,?,?,?)";

        stmt = con.prepareStatement(sql);
        stmt.setInt(1, conta.getIdListaConta());
        stmt.setInt(2, conta.getIdUsuario());
        stmt.setInt(3, conta.getIdTipo());
        stmt.setDouble(4, conta.getIdClasse());
        stmt.setInt(5, conta.getIdAgencia());
        stmt.setInt(6, conta.getNumero());
        stmt.setDouble(7, conta.getSaldo());
        stmt.setDate(8, conta.getDataAbertura());
        stmt.setString(9, conta.getStatus());

        return stmt.executeUpdate();
    }

    public String buscarConta(int id) throws SQLException {
        final String sql = "SELECT * FROM ContaInterna WHERE id_usuario = ?";

        ContaInterna contaInterna = new ContaInterna();

        stmt = con.prepareStatement(sql);
        stmt.setInt(1, id);
        rs = stmt.executeQuery();

        if(rs.next()){

            contaInterna.setIdContaInterna(rs.getInt("id_conta_interna"));
            contaInterna.setIdUsuario(rs.getInt("id_usuario"));
            contaInterna.setIdTipo(rs.getInt("id_tipo"));
            contaInterna.setIdClasse(rs.getDouble("id_classe"));
            contaInterna.setIdAgencia(rs.getInt("id_agencia"));
            contaInterna.setNumero(rs.getInt("numero"));
            contaInterna.setSaldo(rs.getDouble("saldo"));
            contaInterna.setDataAbertura(rs.getDate("data_abertura"));
            contaInterna.setStatus(rs.getString("status"));

            return contaInterna.toString();

        }else return "Deu errado";

    }

    public int atualizarConta(int numero, Double saldo, Date dataAbertura, String status) throws SQLException {
        final String sql = "UPDATE Conta SET numero = ?, saldo = ?, data_abertura = ?, status = ?  WHERE id_conta_interna = ?";

        stmt = con.prepareStatement(sql);

        stmt.setInt(1, numero);
        stmt.setDouble(2, saldo);
        stmt.setDate(3, dataAbertura);
        stmt.setString(4, status);

        return stmt.executeUpdate();

    }

    public int deletarConta(int id) throws SQLException {
        final String sql = "DELETE FROM ContaInterna(id_conta_interna) VALUES(?)";

        stmt = con.prepareStatement(sql);

        stmt.setInt(1, id);

        return stmt.executeUpdate();
    }
}