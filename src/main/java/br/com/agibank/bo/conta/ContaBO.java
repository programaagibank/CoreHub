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

    public String exibirTitularConta(int idConta) throws SQLException{
        return contaDAO.exibirTitularConta(idConta);
    }

    public ArrayList<TipoConta> exibirTiposConta(int idConta) throws SQLException{
        return contaDAO.exibirTiposConta(idConta);

    }

    public boolean cadastrarConta(int idUsuario, int idTipo, double idClasse, int idAgencia, int numero, double saldo, String dataAbertura) {
        try {

            if (saldo < 10) {
                System.out.println("Erro: O saldo inicial deve ser de pelo menos R$ 10,00.");
                return false;
            }

            int resultado = contaDAO.cadastrarConta(idUsuario, idTipo, idClasse, idAgencia, numero, saldo, dataAbertura);

            return resultado > 0;
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar conta: " + e.getMessage());
            return false;
        }
    }


}
