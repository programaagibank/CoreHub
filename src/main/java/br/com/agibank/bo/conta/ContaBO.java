package br.com.agibank.bo.conta;

import br.com.agibank.beans.conta.Conta;
import br.com.agibank.beans.conta.TipoConta;
import br.com.agibank.dao.conta.ContaDAO;
import br.com.agibank.dao.transacoes.ContaExternaDAO;

import java.sql.SQLException;
import java.util.ArrayList;

public class ContaBO {

    private ContaDAO contaDAO = new ContaDAO();

    public ContaBO() throws SQLException {
        contaDAO = new ContaDAO();
    }

    public String buscarStatusConta(int idConta) throws SQLException{
        return contaDAO.buscarStatusConta(idConta);
    }

    public Conta exibirTitularConta(int idConta) throws SQLException{
        return contaDAO.exibirTitularConta(idConta);
    }

    public ArrayList<TipoConta> exibirTiposConta(int idConta) throws SQLException{
        return contaDAO.exibirTiposConta(idConta);

    }

}
