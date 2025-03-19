package br.com.agibank.dao.conta;

import br.com.agibank.beans.conta.Classe;
import br.com.agibank.dao.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClasseDAO {

    private Connection con;
    private PreparedStatement stmt;
    private ResultSet rs;

    public ClasseDAO() throws SQLException {
        con = Conexao.getConexao();
    }

    public void fecharConexao() throws SQLException {
        con.close();
    }

    public int cadastrarClasse(Classe classe) throws SQLException {
        final String sql = "INSERT INTO Classe (score, tipo_classe) VALUES (?,?)";

        stmt = con.prepareStatement(sql);
        stmt.setInt(1, classe.getScore());
        stmt.setString(2, classe.getTipoClasse());

        return stmt.executeUpdate();
    }

    public Classe buscarConta(int id) throws SQLException {

        final String sql = "SELECT * FROM Classe WHERE id_classe = ?";

        Classe classe = new Classe();

        stmt = con.prepareStatement(sql);
        stmt.setInt(1, id);
        rs = stmt.executeQuery();

        if(rs != null){

            classe.setIdClasse(rs.getInt("id_classe"));
            classe.setScore(rs.getInt("score"));
            classe.setTipoClasse(rs.getString("tipo_classe"));

            return classe;

        }
        return classe;
    }


}
