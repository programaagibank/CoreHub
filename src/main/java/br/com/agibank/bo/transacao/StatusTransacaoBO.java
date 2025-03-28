package br.com.agibank.bo.transacao;

import br.com.agibank.beans.transacoes.StatusTransacao;
import br.com.agibank.dao.transacoes.StatusTransacaoDAO;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class StatusTransacaoBO {
    private StatusTransacaoDAO statusTransacaoDAO;

    public StatusTransacaoBO() {
        StatusTransacaoBO statusTransacao = new StatusTransacaoBO();
    }

    public int criarStatusTransacao(int idTransacao, String status) throws SQLException {
        if (status == null || status.isEmpty()) {
            throw new IllegalArgumentException("Status da transação não pode ser nulo");
        }
        StatusTransacao statusTransacao = new StatusTransacao(idTransacao, status,LocalDateTime.now());
        return statusTransacaoDAO.criarStatusTransacao(statusTransacao);
    }

    public StatusTransacao buscarStatusTransacao(int id) throws SQLException {
        return statusTransacaoDAO.buscarStatusTransacao(id);
    }

    public void atualizarStatusTransacao(int id, String status) throws SQLException {
        statusTransacaoDAO.atualizarStatusTransacao(id, status);
    }

    public void excluirStatusTransacao(int id) throws SQLException {
        statusTransacaoDAO.excluirStatusTransacao(id);
    }
}
