package br.com.agibank.view;

import java.sql.SQLException;
import java.util.Scanner;

public class MenuFuncionario {

    public static void exibirMenuFuncionario(int id_usuario) throws SQLException {
        System.out.printf("Funcionario Logado com sucesso");
        Scanner sc = new Scanner(System.in);
        int interacao;
        do{
            System.out.println("MENU FUNCIONARIO: ");
            System.out.println("1. SOLICITACOES DE ABERTURA DE CONTA");
            System.out.println("2. ATENDER CHAMADOS");
            System.out.println("3. CADASTRAR DOCUMENTOS NECESSARIOS");
            System.out.println("4. VERIFICAR CLASSES DE CONTAS");
            System.out.println("5. MEUS DADOS");
            System.out.println("6. VERIFICAR CONTAS");
            System.out.println("7. ANALISAR TRANSACOES SUSPEITAS");
            System.out.println("8. SAIR");
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
                    break;
                default:
                    System.out.println("Insira uma opcao valida!");
            }

        } while (interacao != 8);

    }
}
