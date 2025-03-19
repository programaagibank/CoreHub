package br.com.agibank.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static final String URL = "jdbc:mysql://avnadmin:AVNS_QxEcCd77qpl_RMrmm0z@mysql-corehubdb-corehub.g.aivencloud.com:18743/CoreHubDB?";
    private static final String USER = "avnadmin";
    private static final String PASS = "AVNS_QxEcCd77qpl_RMrmm0z";

    public static Connection getConexao() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }
}
