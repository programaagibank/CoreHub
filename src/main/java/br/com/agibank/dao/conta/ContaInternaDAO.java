package br.com.agibank.dao.conta;

import br.com.agibank.beans.conta.ContaInterna;
import br.com.agibank.dao.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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

    public int buscarConta(ContaInterna conta) throws SQLException {
        final String sql = "SELECT * FROM ContaInterna WHERE id_usuario = ?";

        //ContaInterna contaInterna = new ContaInterna();

        stmt = con.prepareStatement(sql);
        stmt.setInt(1, conta.getIdContaInterna());

        return stmt.executeUpdate();

       // if(rs != null){

           // contaInterna.setNumero(rs.getInt("numero"));

        //}

    }



    public int deletarConta(ContaInterna conta) throws SQLException {
        final String sql = "DELETE FROM ContaInterna (id_conta_interna) VALUES (?)";

        stmt = con.prepareStatement(sql);

        stmt.setInt(1, conta.getIdContaInterna());

        return stmt.executeUpdate();
    }





}

