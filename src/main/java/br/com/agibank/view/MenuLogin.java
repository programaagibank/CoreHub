package br.com.agibank.view;

import br.com.agibank.beans.Usuario;
import br.com.agibank.controller.LoginController;

import java.sql.SQLException;
import java.util.Scanner;

public class MenuLogin {
    public static void login() throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Login: ");
        System.out.print("Usuário: ");
        String usuario = sc.nextLine();
        System.out.print("Senha: ");
        String senha = sc.nextLine();

        Usuario usuarioVerificado = LoginController.processarLogin(usuario,senha);
        if( usuarioVerificado!= null){
            System.out.println("SEJA BEM VINDO(A) " + usuarioVerificado.getApelido());
            if(usuarioVerificado.getFuncionario())  MenuFuncionario.exibirMenuFuncionario(usuarioVerificado.getId_Usuario());
            else  MenuCliente.exibirMenuCliente(usuarioVerificado.getId_Usuario());
        } else {
            System.out.println("Usuario ou senha incorretos!");
            login();
        }

    }
}
