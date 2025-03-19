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



    public static void main(String[] args) {
        SuporteController suporte = new SuporteController();
        AgenciaController agencia = new AgenciaController();
        //suporte.adicionarChamado(1,"teste");
        //suporte.atenderChamado(1,2);
        //agencia.adicionarAgencia("rua",2,"complemento");
        //agencia.deletarAgencia(1);
        //suporte.listarChamados();
        //suporte.listarChamadosAtendidos();
        //agencia.alterarEndereco(1,"nova rua", 2,"novo complemento","nova cidade");
        agencia.listarAgencias();
    }
}