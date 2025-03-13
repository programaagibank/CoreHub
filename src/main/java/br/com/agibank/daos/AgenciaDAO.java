package br.com.agibank.daos;

import br.com.agibank.beans.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AgenciaDAO {

    public void inserirAgencia(String rua, int numero, String complementoo) {
        String sql = "INSERT INTO Agencia (rua,numero,complemento) VALUES (?,?,?)";

        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, rua);
            stmt.setInt(2, numero);
            stmt.setString(3, complementoo);
            stmt.executeUpdate();
            System.out.println("Teste realizado com sucesso");

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
}
