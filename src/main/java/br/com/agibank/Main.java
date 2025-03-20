package br.com.agibank;
import br.com.agibank.beans.Usuario;
import br.com.agibank.dao.UsuarioDAO;

import java.sql.SQLException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws SQLException {
        try{
            Usuario usuario = new Usuario(1, "Heitor", "HTR", "1234", "heitor@teste.com", 1198759345, LocalDate.of(1985, 8, 20), "Rua Um", 45, "casa 2");
            UsuarioDAO usuarioDAO = new UsuarioDAO();
            usuarioDAO.criarUsuario(usuario);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}