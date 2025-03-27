package br.com.agibank;
import br.com.agibank.view.MenuInicial;

import java.sql.SQLException;
import java.util.Scanner;

import br.com.agibank.dao.conta.*;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws SQLException{
        Scanner sc = new Scanner(System.in);
        MenuInicial.exibirMenuInicial(sc);
    }
}