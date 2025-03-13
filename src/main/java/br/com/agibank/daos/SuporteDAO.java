package br.com.agibank.daos;

import br.com.agibank.beans.Conexao;
import br.com.agibank.beans.Suporte;

import java.sql.*;

public class SuporteDAO {

    public void inserirSuporte(int id, String descricao) {
        String sql = "INSERT INTO Suporte (id_usuario,descricao,data_abertura) VALUES (?,?,?)";

        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.setString(2, descricao);
            stmt.setTimestamp(3, new Timestamp(System.currentTimeMillis()));
            stmt.executeUpdate();
            System.out.println("Teste realizado com sucesso");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

        public Suporte buscarChamadoPorId(int id_suporte){
        String sql = "SELECT id_usuario, descricao, responsavel, resolucao FROM Suporte WHERE id_suporte = ?";
        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id_suporte);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                Suporte suporte = new Suporte();
                suporte.setidCliente(rs.getInt("id_usuario"));
                suporte.setDescricao(rs.getString("descricao"));
                suporte.setidFuncionario(rs.getInt("responsavel"));
                suporte.setResolucao(rs.getString("resolucao"));
                return suporte;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void inserirAtendenteSuporte(int id_suporte, int id_funcionario){
            String sql = "UPDATE Suporte SET responsavel = ? WHERE id_suporte = ?";

        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id_funcionario);
            stmt.setInt(2, id_suporte);;
            stmt.executeUpdate();
            System.out.println("Teste realizado com sucesso");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
