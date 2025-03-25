package br.com.agibank;

import java.sql.SQLException;

import br.com.agibank.dao.conta.*;

public class Main {
    public static void main(String[] args){

        try{
            ContaDAO contaDAO = new ContaDAO();

            String resultado = contaDAO.buscarConta(3);

            System.out.println(resultado);
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }

    }
}