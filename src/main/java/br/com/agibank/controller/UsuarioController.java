package br.com.agibank.controller;
import br.com.agibank.daos.SuporteDAO;
import br.com.agibank.daos.UsuarioDAO;
import br.com.agibank.beans.Usuario;

import java.sql.SQLException;

public class UsuarioController {

    private final UsuarioDAO usuarioDAO = new UsuarioDAO();

    public UsuarioController() throws SQLException {
    }

    public Usuario buscarDadosUsuario(int id_usuario) throws SQLException{
        return usuarioDAO.buscarUsuarioPorId(id_usuario);
    }

}
