package br.com.agibank.view;

import br.com.agibank.beans.Funcionario;
import br.com.agibank.beans.Usuario;
import br.com.agibank.controller.FuncionarioController;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.SocketHandler;

public class MenuFuncionario {

    public static void exibirMenuFuncionario(int id_usuario) throws SQLException {
        Scanner sc = new Scanner(System.in);
        int interacao;
        do{
            System.out.println(CoresTerminal.getYELLOW() + "MENU FUNCIONARIO: " + CoresTerminal.getRESET());
            System.out.println(CoresTerminal.getBLUE() + "1. " + CoresTerminal.getRESET() + "SOLICITACOES DE ABERTURA DE CONTA");
            System.out.println(CoresTerminal.getBLUE() + "2. " + CoresTerminal.getRESET()  + "ATENDER CHAMADOS");
            System.out.println(CoresTerminal.getBLUE() + "3. " + CoresTerminal.getRESET()  + "CADASTRAR DOCUMENTOS NECESSARIOS");
            System.out.println(CoresTerminal.getBLUE() + "4. " + CoresTerminal.getRESET()  + "VERIFICAR CLASSES DE CONTAS");
            System.out.println(CoresTerminal.getBLUE() + "5. " + CoresTerminal.getRESET()  + "MEUS DADOS");
            System.out.println(CoresTerminal.getBLUE() + "6. " + CoresTerminal.getRESET()  + "VERIFICAR CONTAS");
            System.out.println(CoresTerminal.getBLUE() + "7. " + CoresTerminal.getRESET()  + "ANALISAR TRANSACOES SUSPEITAS");
            System.out.println(CoresTerminal.getBLUE() + "8. " + CoresTerminal.getRESET() + "CADASTRAR FUNCIONARIO");
            System.out.println(CoresTerminal.getBLUE() + "9. " + CoresTerminal.getRESET() + "SAIR");
            System.out.print("-> ");
            interacao = sc.nextInt();

            switch (interacao){
                case 1:
                    System.out.println("SALDO NA CONTA:");
                    break;
                case 2:
                    MenuSuporte.exibirMenuSuporteFuncionario(id_usuario);
                    break;
                case 3:
                    //TODO implementar cadastro de documentos
                    break;
                case 4:
                    //TODO implementar verificacao CLASSES DE CONTAS
                    break;
                case 5:
                    MenuDadosUsuario.exibirMenuDadosUsuario(id_usuario);
                    break;
                case 6:
                    //TODO implementar verificar contas
                    break;
                case 7:
                    //TODO implementar analisar transacoes suspeitas
                    break;
                case 8:
                    CadastroFuncionario.exibirCadastroFuncionario();
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Insira uma opcao valida!");
            }

        } while (interacao != 9);

    }
}
