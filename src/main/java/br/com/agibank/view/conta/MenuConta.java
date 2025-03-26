package br.com.agibank.view.conta;

import br.com.agibank.controller.conta.ContaController;
import br.com.agibank.view.cores.CoresTerminal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuConta {

    private ContaController contaController;

    public MenuConta() {
        try {
            this.contaController = new ContaController();
        } catch (Exception e) {
            System.err.println("Erro ao inicializar ContaController: " + e.getMessage());
        }
    }

    public void exibirMenuConta(int idConta) {
        Scanner sc = new Scanner(System.in);
        int interacao;

        do {
            System.out.println("\nDIGITE A OPÇÃO DESEJADA: ");
            System.out.println(CoresTerminal.getBLUE() + "1. VER STATUS DA CONTA" + CoresTerminal.getRESET());
            System.out.println("2. CONSULTAR SALDO DISPONÍVEL");
            System.out.println("3. EXIBIR TITULAR DA CONTA");
            System.out.println("4. MOSTRAR DOCUMENTOS");
            System.out.println("5. EXIBIR TIPO DE CONTAS");
            System.out.println("0. SAIR");

            try {
                System.out.print("Opção: ");
                interacao = sc.nextInt();
                sc.nextLine();

                switch (interacao) {
                    case 1:
                        System.out.println("O status da sua conta é: " + contaController.buscarStatusConta(idConta));
                        break;
                    case 2:
                        System.out.println("Saldo disponível: ");
                        break;
                    case 3:
                        System.out.println("Titular da conta: " + contaController.exibirTitularConta(idConta));
                        break;
                    case 4:
                        System.out.println("Exibindo documentos...");
                        break;
                    case 5:
                        System.out.println("Exibindo tipos de conta...");
                        contaController.exibirTiposConta(idConta);
                        break;
                    case 0:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Digite um número.");
                sc.nextLine();
                interacao = -1; // Força repetição do loop
            }
        } while (interacao != 0);

        sc.close();
    }
}
