package br.com.agibank;
import br.com.agibank.controller.SuporteController;
import br.com.agibank.controller.AgenciaController;

public class Main {
    public static void main(String[] args) {
        SuporteController suporte = new SuporteController();
        AgenciaController agencia = new AgenciaController();
        //suporte.adicionarChamado(1,"teste");
        //suporte.atenderChamado(1,2);
        agencia.adicionarAgencia("rua",2,"complemento");
        //agencia.deletarAgencia(1);
    }
}