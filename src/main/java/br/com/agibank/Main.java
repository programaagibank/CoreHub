package br.com.agibank;

import br.com.agibank.dao.conta.ClasseDAO;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args){

        //testes e mais testes
        try{
            ClasseDAO classedao = new ClasseDAO();

            classedao.deletarClasse(2);

            String resultado = classedao.buscarClasse(2);

            System.out.println(resultado);
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }


        LocalDate.parse("2005/10/05");
    }
}