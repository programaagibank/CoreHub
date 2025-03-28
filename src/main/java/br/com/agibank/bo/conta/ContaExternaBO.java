package br.com.agibank.bo.conta;

import br.com.agibank.beans.transacoes.ContaExterna;
import br.com.agibank.dao.transacoes.ContaExternaDAO;
import java.sql.SQLException;

public class ContaExternaBO {
    private ContaExternaDAO contaExternaDAO;

    public ContaExternaBO() throws SQLException {
        contaExternaDAO = new ContaExternaDAO();
    }

    public int criarContaExterna(ContaExterna conta) throws SQLException {
        if (contaExternaDAO.consultarContaExterna(conta.getJsonContaExterna()).getJsonContaExterna() != null) {
            throw new SQLException("Conta externa já cadastrada, id= " + conta.getId());
        }
        return contaExternaDAO.criarContaExterna(conta.getJsonContaExterna());
    }

    public ContaExterna buscarContaExterna(int id) throws SQLException {
        return contaExternaDAO.consultarContaExterna(id);
    }

    public ContaExterna buscarContaExterna(String jsonContaExterna) throws SQLException {
        return contaExternaDAO.consultarContaExterna(jsonContaExterna);
    }

    public int atualizarContaExterna(ContaExterna conta) throws SQLException {
        return contaExternaDAO.atualizarContaExterna(conta.getId(), conta.getJsonContaExterna());
    }

    public int excluirContaExterna(int id) throws SQLException {
        return contaExternaDAO.deletarContaExterna(id);
    }
}
