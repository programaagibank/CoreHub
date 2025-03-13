package br.com.agibank.controller;

import br.com.agibank.beans.Agencia;
import br.com.agibank.beans.Suporte;
import br.com.agibank.daos.AgenciaDAO;
import br.com.agibank.daos.SuporteDAO;

public class AgenciaController {
    private AgenciaDAO AgenciaDAO = new AgenciaDAO();

    public void adicionarAgencia(String rua, int numero, String complemento){
        Agencia agencia = new Agencia(rua,numero,complemento);
        AgenciaDAO.inserirAgencia(rua,numero,complemento);
    }

    public void deletarAgencia(int id_agencia){;
        AgenciaDAO.deletarAgencia(id_agencia);
    }
}
