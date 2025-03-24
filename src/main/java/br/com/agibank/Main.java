package br.com.agibank;
import br.com.agibank.beans.Usuario;
import br.com.agibank.controller.SuporteController;
import br.com.agibank.controller.AgenciaController;
import br.com.agibank.daos.UsuarioDAO;
import br.com.agibank.view.MenuInicial;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException{
        Scanner sc = new Scanner(System.in);
        MenuInicial.exibirMenuInicial(sc);
    }
}