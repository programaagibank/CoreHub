package br.com.agibank.dao.conta;

import br.com.agibank.beans.Usuario;
import br.com.agibank.beans.conta.Conta;
import br.com.agibank.beans.conta.TipoConta;
import br.com.agibank.dao.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ContaDAO {

    private Connection con;
    private PreparedStatement stmt;
    private ResultSet rs;

    public ContaDAO() throws SQLException {
        con = Conexao.getConexao();
    }

    public void fecharConexao() throws SQLException {
        con.close();
    }

    public boolean verificarContaExiste(int idAgencia, int numero, int idTipoConta) throws SQLException {
        String sql = "SELECT COUNT(*) FROM Conta WHERE id_agencia = ? AND numero = ?";
        stmt = con.prepareStatement(sql);
        stmt.setInt(1, idAgencia);
        stmt.setInt(2, numero);



        rs = stmt.executeQuery();
        if (rs.next()) {
            return rs.getInt(1) > 0; // Se retornar um número maior que 0, a conta já existe
        }
        return false;
    }

    public int cadastrarConta(int idUsuario, int idTipo, double idClasse, int idAgencia, int numero, double saldo, String dataAbertura) throws SQLException {
        final String sql = "INSERT INTO Conta (id_usuario, id_tipo, id_classe, id_agencia, numero, saldo, data_abertura, status) VALUES (?,?,?,?,?,?,?,?)";

        stmt = con.prepareStatement(sql);
        stmt.setInt(1, idUsuario);
        stmt.setInt(2, idTipo);
        stmt.setDouble(3, idClasse);
        stmt.setInt(4, idAgencia);
        stmt.setInt(5, numero);
        stmt.setDouble(6, saldo);
        stmt.setDate(7, java.sql.Date.valueOf(dataAbertura));
        stmt.setString(8, "Aguardando resposta");

        return stmt.executeUpdate();
    }

    public String buscarConta(int id) throws SQLException {
        final String sql = "SELECT * FROM Conta WHERE id_conta = ?";

        Conta conta = new Conta();

        stmt = con.prepareStatement(sql);
        stmt.setInt(1, id);
        rs = stmt.executeQuery();

        if(rs.next()){

            conta.setIdConta(rs.getInt("id_conta"));
            conta.setIdUsuario(rs.getInt("id_usuario"));
            conta.setIdTipo(rs.getInt("id_tipo"));
            conta.setIdClasse(rs.getDouble("id_classe"));
            conta.setIdAgencia(rs.getInt("id_agencia"));
            conta.setNumero(rs.getInt("numero"));
            conta.setSaldo(rs.getDouble("saldo"));
            conta.setDataAbertura(rs.getDate("data_abertura"));
            conta.setStatus(rs.getString("status"));

            return conta.toString();

        }else return "Deu errado";

    }

    public int atualizarConta(int numero, Double saldo, String dataAbertura, String status) throws SQLException {
        final String sql = "UPDATE Conta SET numero = ?, saldo = ?, data_abertura = ?, status = ?  WHERE id_conta = ?";

        stmt = con.prepareStatement(sql);

        stmt.setInt(1, numero);
        stmt.setDouble(2, saldo);
        stmt.setDate(3, java.sql.Date.valueOf(dataAbertura));
        stmt.setString(4, status);

        return stmt.executeUpdate();

    }

    public int deletarConta(int id) throws SQLException {
        final String sql = "DELETE FROM Conta(id_conta) VALUES(?)";

        stmt = con.prepareStatement(sql);
        stmt.setInt(1, id);

        return stmt.executeUpdate();
    }

    public String buscarStatusConta(int id) throws SQLException {

        final String sql = "SELECT status FROM Conta WHERE id_conta = ?";

        Conta conta = new Conta();

        stmt = con.prepareStatement(sql);
        stmt.setInt(1, id);
        rs = stmt.executeQuery();

        if(rs.next()){

            return rs.getString("status");

        }else return "Deu errado";
    }

    public String exibirTitularConta(int id) throws SQLException{
        Usuario usuario = new Usuario();

        final String sql = """
                SELECT Usuario.nome
                FROM Conta
                JOIN Usuario ON Conta.id_usuario = Usuario.id_usuario
                WHERE Conta.id_conta = ?;
                """;

        stmt = con.prepareStatement(sql);
        stmt.setInt(1, id);
        rs = stmt.executeQuery();

        if(rs.next()){
            return rs.getString("nome");
        }else return "titular não encontrado";

    }

    public String exibirTiposConta(int id) throws SQLException{

        ArrayList<TipoConta> tiposConta = new ArrayList<>();
        TipoConta tipoConta = new TipoConta();

        final String sql = """
                SELECT Tipo_Conta.tipo
                FROM Tipo_Conta
                INNER JOIN Conta ON Tipo_Conta.id_tipo_conta = Conta.id_conta
                WHERE Conta.id_conta = ?;
                """;

        stmt = con.prepareStatement(sql);
        stmt.setInt(1, id);
        rs = stmt.executeQuery();

        while (rs.next()) {

            tipoConta.setTipo(rs.getString("tipo"));
            tiposConta.add(tipoConta);
        }

        return tiposConta.toString();

    }

}