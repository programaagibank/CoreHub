package br.com.agibank.view;

import br.com.agibank.beans.Usuario;
import br.com.agibank.controller.UsuarioController;

import java.sql.SQLException;
import java.util.Scanner;

public class MenuDadosUsuario {
    static UsuarioController usuarioController;
    static Usuario su = new Usuario();

    static {
        try {
            usuarioController = new UsuarioController();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    static Scanner sc = new Scanner(System.in);

    public MenuDadosUsuario() throws SQLException {
    }

    public static void exibirMenuDadosUsuario(int id_usuario) throws SQLException {
        int interacao;
        do{
            System.out.println(CoresTerminal.getYELLOW() + "QUAL E A OPERACAO DESEJADA?: " + CoresTerminal.getRESET());
            System.out.println(CoresTerminal.getBLUE() + "1. "+ CoresTerminal.getRESET() + "VER DADOS");
            System.out.println(CoresTerminal.getBLUE() + "2. " + CoresTerminal.getRESET() + "ATUALIZAR DADOS");
            System.out.println(CoresTerminal.getBLUE() + "3. " + CoresTerminal.getRESET() + "SAIR");
            System.out.print("-> ");
            interacao  = sc.nextInt();
            switch (interacao){
                case 1:
                    //TODO adicionar mais dados
                    System.out.println("MEUS DADOS");
                    Usuario usuario = usuarioController.buscarDadosUsuario(id_usuario);
                    System.out.println("Nome: " + usuario.getNome());
                    System.out.println("Apelido: " + usuario.getApelido());
                    break;
                case 2:
                    System.out.println(CoresTerminal.getYELLOW() + "QUAL DADO DESEJA ALTERAR" + CoresTerminal.getRESET());
                    System.out.println(CoresTerminal.getBLUE() + "1. " + CoresTerminal.getRESET() + "Nome");
                    System.out.println(CoresTerminal.getBLUE() + "2. " + CoresTerminal.getRESET() + "Email");
                    System.out.println(CoresTerminal.getBLUE() + "3. " + CoresTerminal.getRESET() + "Telefone");
                    System.out.println(CoresTerminal.getBLUE() + "4. " + CoresTerminal.getRESET() + "Rua");
                    System.out.println(CoresTerminal.getBLUE() + "5. " + CoresTerminal.getRESET() + "Numero");
                    System.out.println(CoresTerminal.getBLUE() + "6. " + CoresTerminal.getRESET() + "Complememto");
                    System.out.println(CoresTerminal.getBLUE() + "7. " + CoresTerminal.getRESET() + "Apelido");

                    System.out.println("->");
                    int opcao = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Novo Dado: ");
                    String novoDado = sc.nextLine();

                    if(usuarioController.alterarDadosUsuario(opcao,novoDado,id_usuario) != 0){
                        System.out.println(CoresTerminal.getGREEN() + "Alteracao realizada com sucesso!" + CoresTerminal.getRESET());
                    }else{
                        System.out.println(CoresTerminal.getRED() + "Ocorreu um erro na operacao!" + CoresTerminal.getRESET());
                    }

                    break;
                default:
                    System.out.println("Insira uma opcao valida");
            }
        }while(interacao!=3);
    }
}
