package br.com.agibank.view;

import br.com.agibank.controller.SuporteController;
import br.com.agibank.controller.conta.ContaController;

import java.sql.SQLException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class MenuConta {

    static ContaController conta;

    static {
        try {
            conta = new ContaController();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    static Scanner sc = new Scanner(System.in);

    public static void conta() throws SQLException {
    }

    public static void exibirMenuConta(int idConta) throws SQLException {

        int interacao;

        do {
            System.out.println("DIGITE A OPÇÃO DESEJADA: ");
            System.out.println("1. VER STATUS DA CONTA");
            System.out.println("2. CONSULTAR SALDO DISPONIVEL");
            System.out.println("3. EXIBIR TITULAR DA CONTA");
            System.out.println("4. MOSTRAR DOCUMENTOS");
            System.out.println("5. EXIBIR TIPO DE CONTAS");
            interacao = sc.nextInt();


            switch (interacao){

                case 1:
                    System.out.println("O status da sua conta é: ");
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Titular da conta: ");
                    break;
                case 4:
                case 5:

            }

        }while (interacao != 5);

    }

}
