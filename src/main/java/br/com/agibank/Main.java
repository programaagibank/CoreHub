package br.com.agibank;

import br.com.agibank.dao.conta.*;
import br.com.agibank.view.conta.MenuConta;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws SQLException {

        ContaDAO contaDAO = new ContaDAO();

        System.out.println(contaDAO.listarContasUsuario(1));

    }
}