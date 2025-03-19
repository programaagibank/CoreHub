package br.com.agibank.controller;

import br.com.agibank.beans.Agencia;
import br.com.agibank.daos.AgenciaDAO;

public class AgenciaController {
    private AgenciaDAO AgenciaDAO = new AgenciaDAO();

    public void adicionarAgencia(String rua, int numero, String complemento, String cidade){
        Agencia agencia = new Agencia(rua,numero,complemento,cidade);
        AgenciaDAO.inserirAgencia(rua,numero,complemento,cidade);
    }

    public void deletarAgencia(int id_agencia){;
        AgenciaDAO.deletarAgencia(id_agencia);
    }

    public void alterarEndereco(int id_agencia, String rua, int numero, String complemento, String cidade){
        AgenciaDAO.alterarEndereco(id_agencia,rua,numero,complemento,cidade);
    }

    public void listarAgencias(){
        AgenciaDAO.listarAgencias();
    }
}
