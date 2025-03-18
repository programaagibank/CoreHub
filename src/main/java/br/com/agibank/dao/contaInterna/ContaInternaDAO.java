package br.com.agibank.dao.contaInterna;

import br.com.agibank.beans.contaInterna.ContaInterna;
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

    public int cadastrarConta(ContaInterna conta) throws SQLException{
        final String sql = "INSERT INTO ContaInterna (id_conta_interna, id_lista_contas, id_usuario, id_tipo, id_classe, id_classe, id_agencia, numero, saldo, data_abertura, status) VALUES (?,?,?,?,?,?,?,?,?,?)";

        stmt = con.prepareStatement(sql);
        stmt.setInt(1, conta.getIdContaInterna());
        stmt.setInt(2, conta.getIdListaConta());
        stmt.setInt(3, conta.getIdUsuario());
        stmt.setInt(4, conta.getIdTipo());
        stmt.setDouble(5, conta.getIdClasse());
        stmt.setInt(6, conta.getIdAgencia());
        stmt.setInt(7, conta.getNumero());
        stmt.setDouble(8, conta.getSaldo());
        stmt.setDate(9, conta.getDataAbertura());
        stmt.setString(10, conta.getStatus());

        return stmt.executeUpdate();
    }

}

