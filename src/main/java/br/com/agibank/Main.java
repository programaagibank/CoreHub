package br.com.agibank;

import br.com.agibank.beans.taxa.Taxa;
import br.com.agibank.dao.taxa.TaxaDAO;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        try {
            TaxaDAO taxaDAO = new TaxaDAO();
            int resultadoCadastro = taxaDAO.cadastrarTaxa(1, "teste2", 9.9);
            System.out.println("Cadastro realizado? " + (resultadoCadastro > 0));

            String taxaEncontrada = taxaDAO.buscarTaxa(1);
            System.out.println(taxaEncontrada);

            Taxa taxaAtualizada = new Taxa();
            taxaAtualizada.setId(1); // Define o ID da taxa a ser atualizada
            int resultadoAtualizacao = taxaDAO.atualizarTaxa(taxaAtualizada);
            System.out.println("Atualizacao realizada? " + (resultadoAtualizacao > 0));

            int resultadoExclusao = taxaDAO.excluirTaxa(1);
            System.out.println("Exclusao realizada? " + (resultadoExclusao > 0));

            taxaDAO.fecharConexao();
        } catch (SQLException e) {
            System.err.println("ERRO AO EXECUTAR OPERAÇÃO NO BANCO DE DADOS: " + e.getMessage());
            e.printStackTrace();
        }
    }

}
