package br.com.agibank;

import br.com.agibank.dao.conta.*;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args){

        //testes e mais testes
        try{
            ContaInternaDAO contaInterna = new ContaInternaDAO();
            ContaCorrenteDAO contaCorrente = new ContaCorrenteDAO();
            ContaExternaDAO contaExterna = new ContaExternaDAO();
            ContaSalarioDAO contaSalario = new ContaSalarioDAO();
            ContaPoupancaDAO contaPoupanca = new ContaPoupancaDAO();
            TipoContaDAO tipoConta = new TipoContaDAO();






        }catch (SQLException e){
            System.out.println(e.getMessage());
        }



    }
}