package br.com.agibank.dao.conta;

import br.com.agibank.dao.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BeneficioDAO {

    private Connection con;
    private PreparedStatement stmt;
    private ResultSet rs;

    public BeneficioDAO() throws SQLException {
        con = Conexao.getConexao();
    }

    public void fecharConexao() throws SQLException {
        con.close();
    }

}
