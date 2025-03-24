package br.com.agibank.view;

import java.sql.SQLException;
import java.util.Scanner;

public class MenuInicial {
    public static void exibirMenuInicial(Scanner sc) throws SQLException {
        int interacao;
        do{
            System.out.println("MENU INICIAL: ");
            System.out.println("1. Login");
            System.out.println("2. Cadastro");
            System.out.print("-> ");
            interacao = sc.nextInt();
        } while (interacao < 1 || interacao > 2);
        if (interacao == 1){
            MenuLogin.login();
        } else {
            MenuCadastro.cadastro();
        }
    }
}
