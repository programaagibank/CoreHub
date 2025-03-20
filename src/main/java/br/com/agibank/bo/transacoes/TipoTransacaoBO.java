package br.com.agibank.bo.transacoes;

import br.com.agibank.beans.transacoes.TipoTransacao;
import br.com.agibank.dao.transacoes.TipoTransacaoDAO;
import java.sql.SQLException;

public class TipoTransacaoBO {
    private TipoTransacaoDAO tipoTransacaoDAO;

    public TipoTransacaoBO() throws SQLException {
        tipoTransacaoDAO = new TipoTransacaoDAO();
    }

    public int criarTipoTransacao(String tipoTransacao) throws SQLException {
        if ( tipoTransacao == null){
            throw new IllegalArgumentException("Tipo de transação não pode ser nulo");
        }
        return tipoTransacaoDAO.criarTipoTransacao(tipoTransacao);
    }

    public TipoTransacao buscarTipoTransacao(int id) throws SQLException {
        return tipoTransacaoDAO.buscarTipoTransacao(id);
    }

    public void atualizarTipoTransacao(int id, String tipoTransacao) throws SQLException {
        tipoTransacaoDAO.atualizarTipoTransacao(id, tipoTransacao);
    }

    public void deletarTipoTransacao(int id) throws SQLException {
        tipoTransacaoDAO.deletarTipoTransacao(id);
    }
}
