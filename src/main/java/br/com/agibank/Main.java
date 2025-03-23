package br.com.agibank;
import br.com.agibank.beans.Usuario;
import br.com.agibank.controller.SuporteController;
import br.com.agibank.controller.AgenciaController;
import br.com.agibank.daos.UsuarioDAO;
import br.com.agibank.view.MenuInicial;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException{
        SuporteController suporte = new SuporteController();
        AgenciaController agencia = new AgenciaController();
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        //suporte.adicionarChamado(1,"teste");
        //suporte.atenderChamado(1,2);
        //agencia.adicionarAgencia("rua",2,"complemento");
        //agencia.deletarAgencia(1);
        //suporte.listarChamados();
        //suporte.listarChamadosAtendidos();
        //agencia.alterarEndereco(1,"nova rua", 2,"novo complemento","nova cidade");
        //agencia.listarAgencias();
        //suporte.listarChamados();
        //System.out.println(usuarioDAO.verificarTipoUsuario(8));
        Scanner sc = new Scanner(System.in);
        MenuInicial.exibirMenuInicial(sc);
        //suporte.atenderChamado(5,9);
    }
}