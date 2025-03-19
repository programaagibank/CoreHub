package br.com.agibank.daos;

import br.com.agibank.beans.Agencia;
import br.com.agibank.beans.Conexao;
import br.com.agibank.beans.Suporte;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AgenciaDAO {

    public void inserirAgencia(String rua, int numero, String complemento, String cidade) {
        String sql = "INSERT INTO Agencia (rua,numero,complemento) VALUES (?,?,?,?)";

        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, rua);
            stmt.setInt(2, numero);
            stmt.setString(3, complemento);
            stmt.setString(4, cidade);
            stmt.executeUpdate();
            System.out.println("Agencia inserida com sucesso");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletarAgencia(int id_agencia) {
        String sql = "DELETE FROM Agencia WHERE id_agencia = ?";

        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id_agencia);
            stmt.executeUpdate();
            System.out.println("Teste realizado com sucesso");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void alterarEndereco(int id_agencia, String rua, int numero, String complemento, String cidade){
        String sql = "UPDATE Agencia SET rua = ?, numero = ?, complemento = ?, cidade = ? WHERE id_agencia = ?";

        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, rua);
            stmt.setInt(2, numero);
            stmt.setString(3, complemento);
            stmt.setString(4, cidade);
            stmt.setInt(5,id_agencia);
            stmt.executeUpdate();
            System.out.println("Endereço atualizado com sucesso");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void listarAgencias(){
            String sql = "SELECT * FROM Agencia";

        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                System.out.print(rs.getInt("id_agencia") + " ");
                System.out.print(rs.getString("rua") + " ");
                System.out.print(rs.getString("numero") + " ");
                System.out.print(rs.getString("complemento" + " "));
                System.out.println(rs.getString("cidade"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Agencia buscarAgenciaPorId(int id_agencia){
        String sql = "SELECT * FROM Agencia WHERE id_agencia = ?";
        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id_agencia);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                Agencia agencia = new Agencia();
                agencia.setComplemento(rs.getString("complemento"));
                agencia.setNumero(rs.getInt("numero"));
                agencia.setRua(rs.getString("rua"));
                agencia.setCidade(rs.getString("cidade"));
                return agencia;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
