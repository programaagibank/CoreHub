package br.com.agibank.controller.conta;

import br.com.agibank.bo.conta.ContaBO;

import java.sql.SQLException;

public class ContaController {

    private final ContaBO contaBO = new ContaBO();
    private String resultado;

    public ContaController() throws SQLException {
    }

    public String buscarStatusConta(int idConta){
        try{
            contaBO.buscarStatusConta(idConta);
            return resultado;
        }catch (SQLException e){
            resultado = "Erro: " + e.getMessage();
        }
        return resultado;
    }

    public String exibirTitularConta(int idConta){
        try{
            resultado = "Nome do titular: " + contaBO.exibirTitularConta(idConta);
            return resultado;
        }catch (SQLException e){
            resultado = "Erro: " + e.getMessage();
        }
        return resultado;
    }

    public String exibirTiposConta(int idConta){

        try{
            resultado = "Tipo da conta é: " + contaBO.exibirTiposConta(idConta);
            return resultado;
        }catch (SQLException e){
            resultado = "Erro: " + e.getMessage();
        }
        return resultado;

    }
}