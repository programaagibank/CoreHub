package br.com.agibank.view;

import javax.management.MBeanRegistration;
import java.sql.SQLException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class MenuCliente {
    public static void exibirMenuCliente(int id_usuario) throws SQLException {
        Scanner sc = new Scanner(System.in);
        int interacao;
        do{
            System.out.println("MENU CLIENTE: ");
            System.out.println("1. VERIFICAR SALDO");
            System.out.println("2. REALIZAR TRANSACAO");
            System.out.println("3. SOLICITAR SUPORTE");
            System.out.println("4. VERIFICAR BENEFICIOS");
            System.out.println("5. MEUS DADOS");
            System.out.println("6. VER EXTRATO");
            System.out.println("7. DADOS DA CONTA");
            System.out.println("8. SAIR");
            System.out.print("-> ");
            interacao = sc.nextInt();

            switch (interacao){
                case 1:
                    System.out.println("SALDO NA CONTA:");
                    break;
                case 2:
                    MenuTransacao.exibirMenuTransacao(id_usuario);
                    break;
                case 3:
                    MenuSuporte.exibirMenuSuporte(id_usuario);
                    break;
                case 4:
                    System.out.println("BENEFICIOS DA SUA CLASSE:");
                    break;
                case 5:
                    MenuDadosUsuario.exibirMenuDadosUsuario(id_usuario);
                    break;
                case 6:
                    System.out.println("EXTRATO:");
                    break;
                case 7:
                    System.out.println("DADOS DA CONTA:");
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Insira uma opcao valida!");
            }

        } while (interacao != 8);

    }
}
