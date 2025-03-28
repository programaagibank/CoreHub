package br.com.agibank.view;

import com.github.lalyos.jfiglet.FigletFont;

import java.sql.SQLException;
import java.util.Scanner;

public class MenuInicial {
    public static void exibirMenuInicial(Scanner sc) throws SQLException {

        try {
            String asciiArt = FigletFont.convertOneLine("Core Hub");
            System.out.println(CoresTerminal.getBLUE() + asciiArt + CoresTerminal.getRESET());
        } catch (Exception e) {
            e.printStackTrace();
        }

        int interacao;
        do{
            System.out.println(CoresTerminal.getYELLOW() + "MENU INICIAL: "+ CoresTerminal.getRESET());
            System.out.println(CoresTerminal.getBLUE() + "1. " + CoresTerminal.getRESET() + "Login");
            System.out.println(CoresTerminal.getBLUE() + "2. " + CoresTerminal.getRESET() + "Cadastro");
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
