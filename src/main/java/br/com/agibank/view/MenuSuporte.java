package br.com.agibank.view;

import br.com.agibank.beans.Suporte;
import br.com.agibank.controller.SuporteController;

import java.sql.SQLException;
import java.util.Scanner;

public class MenuSuporte {

    static SuporteController suporte;
    static Suporte su = new Suporte();

    static {
        try {
            suporte = new SuporteController();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    static Scanner sc = new Scanner(System.in);

    public MenuSuporte() throws SQLException {
    }

    public static void exibirMenuSuporte(int id_usuario){
        int interacao;
        do{
            System.out.println("QUAL E A OPERACAO DESEJADA?: ");
            System.out.println("1. SOLICITAR AJUDA");
            System.out.println("2. VERIFICAR RESPOSTAS");
            System.out.println("3. SAIR");
            System.out.print("-> ");
            interacao  = sc.nextInt();
            switch (interacao){
                case 1:
                    System.out.println("QUAL E O PROBLEMA?");
                    sc.nextLine();
                    String descricao = sc.nextLine();
                    suporte.adicionarChamado(id_usuario,descricao);
                    break;
                case 2:
                    System.out.println("CHAMADOS REALIZADOS");
                    suporte.exibirChamadosPorUsuario(id_usuario);
                    break;
                default:
                    System.out.println("Insira uma opcao valida");
            }
        }while(interacao!=3);
    }

    public static void exibirMenuSuporteFuncionario(int id_usuario){
        int interacao;
        do{
            System.out.println("QUAL E A OPERACAO DESEJADA?: ");
            System.out.println("1. VERIFICAR CHAMADOS RESOLVIDOS");
            System.out.println("2. VERIFICAR CHAMADOS PENDENTES");
            System.out.println("3. ASSUMIR CHAMADO");
            System.out.println("4. RESOLVER CHAMADO");
            System.out.println("5. SAIR");
            System.out.print("-> ");
            interacao  = sc.nextInt();
            switch (interacao){
                case 1:
                    System.out.println("CHAMADOS RESOLVIDOS");
                    suporte.listarChamadosAtendidos();
                    break;
                case 2:
                    System.out.println("CHAMADOS PENDENTES");
                    suporte.listarChamadosPendentes();
                    break;
                case 3:
                    System.out.println("Id do chamado:");
                    int id_chamado = sc.nextInt();
                    suporte.atenderChamado(id_chamado,id_usuario);
                    break;
                case 4:
                    System.out.println("Id do chamado:");
                    int id_chamado2 = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Resolucao: ");
                    String resolucao = sc.nextLine();
                    suporte.resolverChamado(id_chamado2,resolucao,id_usuario);
                    break;
                default:
                    System.out.println("Insira uma opcao valida");
            }
        }while(interacao!=5);
    }
}
