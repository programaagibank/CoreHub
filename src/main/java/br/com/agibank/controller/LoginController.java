package br.com.agibank.controller;

import br.com.agibank.beans.Usuario;
import br.com.agibank.daos.UsuarioDAO;

import java.sql.SQLException;

public class LoginController {

    public static Usuario processarLogin(String usuario, String senha) throws SQLException {
        UsuarioDAO usuarioDao = new UsuarioDAO();
        Usuario usuarioVerificado = usuarioDao.buscarUsuarioLogin(usuario, senha);

        if( usuarioVerificado != null && usuarioVerificado.getSenha().equals(senha)) return usuarioVerificado;

        return null;
    }

}
