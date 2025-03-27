package br.com.agibank.view;

import br.com.agibank.beans.Funcionario;
import br.com.agibank.beans.Usuario;
import br.com.agibank.controller.FuncionarioController;

import java.sql.SQLException;
import java.util.Scanner;

public class CadastroFuncionario {
    public static void exibirCadastroFuncionario() throws SQLException {
        Scanner sc = new Scanner(System.in);
        FuncionarioController funcionarioController = new FuncionarioController();
        System.out.println(CoresTerminal.getBLUE() + "Funcao: " + CoresTerminal.getRESET());
        String funcao = sc.nextLine();
        Usuario usuario = MenuCadastro.cadastro();
        Funcionario funcionario = new Funcionario(usuario.getId_Usuario(),funcao);
        funcionarioController.CadastrarFuncionario(funcionario);
    }

}
