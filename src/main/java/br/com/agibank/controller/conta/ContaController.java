package br.com.agibank.controller.conta;

import br.com.agibank.beans.conta.Conta;
import br.com.agibank.dao.conta.ContaDAO;

import java.sql.SQLException;

public class ContaController {

    private final ContaDAO contaDAO = new ContaDAO();

    public ContaController() throws SQLException {
    }



}
