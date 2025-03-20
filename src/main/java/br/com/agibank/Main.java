package br.com.agibank;
import br.com.agibank.controller.SuporteController;
import br.com.agibank.controller.AgenciaController;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException{
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
        //suporte.listarChamados();

    }
}