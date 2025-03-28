package br.com.agibank.controller;

import br.com.agibank.beans.Funcionario;
import br.com.agibank.dao.FuncionarioDAO;

import java.sql.SQLException;

public class FuncionarioController {

    public int CadastrarFuncionario(Funcionario funcionario){
        try{
            FuncionarioDAO funcionarioDao = new FuncionarioDAO();
            return  funcionarioDao.criarFuncionario(funcionario);
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

        return 0;
    }
}
