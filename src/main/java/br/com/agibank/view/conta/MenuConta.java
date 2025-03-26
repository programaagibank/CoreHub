package br.com.agibank.view.conta;

import br.com.agibank.controller.conta.ContaController;
import br.com.agibank.view.cores.CoresTerminal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuConta {

    private ContaController contaController;
    private LocalDate dataAtual = LocalDate.now();
    private DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy/MM/dd");

    public MenuConta() {
        try {
            this.contaController = new ContaController();
        } catch (Exception e) {
            System.err.println("Erro ao inicializar ContaController: " + e.getMessage());
        }
    }

    public void exibirMenuConta(int idConta, int idUsuario) {
        Scanner sc = new Scanner(System.in);
        int interacao;

        do {
            System.out.println("\nDIGITE A OPÇÃO DESEJADA: ");
            System.out.println(CoresTerminal.getBLUE() + "1. VER STATUS DA CONTA" + CoresTerminal.getRESET());
            System.out.println("2. CRIAR MINHA CONTA");
            System.out.println("3. DELETAR A CONTA");
            System.out.println("4. ATUALIZAR MINHA CONTA");
            System.out.println("5. VISUALIZAR MINHA CONTA");
            System.out.println("6. EXIBIR TITULAR DA CONTA");
            System.out.println("7. MOSTRAR DOCUMENTOS");
            System.out.println("8. EXIBIR TIPO DE CONTAS");
            System.out.println("0. SAIR");

            try {
                System.out.print("Opção: ");
                interacao = sc.nextInt();
                sc.nextLine();

                switch (interacao) {
                    case 1: // VER STATUS DA CONTA
                        System.out.println("O status da sua conta é: " + contaController.buscarStatusConta(idConta));
                        break;
                    case 2: // CRIAR MINHA CONTA
                        System.out.println("QUE TIPO DE CONTA DESEJA ABRIR? (1. POUPANÇA, 2. SALÁRIO, 3. CORRENTE)");
                        int tipoConta = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Informe a classe da conta (ex: 1.0, 2.0): ");
                        double classeConta = sc.nextDouble();
                        sc.nextLine();

                        System.out.print("Informe o ID da agência: ");
                        int idAgencia = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Informe o número da conta: ");
                        int numeroConta = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Informe o saldo inicial: ");
                        double saldoInicial = sc.nextDouble();
                        sc.nextLine();

                        String dataFormatada = dataAtual.format(formato);

                        break;

                    case 3: // DELETAR A CONTA
                        System.out.println("Saldo disponível: ");
                        break;
                    case 4: // ATUALIZAR MINHA CONTA
                        System.out.println("Saldo disponível: ");
                        break;
                    case 5: //
                        System.out.println("Saldo disponível: ");
                        break;
                    case 6: // EXIBIR TITULAR DA CONTA
                        System.out.println("Titular da conta: " + contaController.exibirTitularConta(idConta));
                        break;
                    case 7: // MOSTRAR DOCUMENTOS
                        System.out.println("Exibindo documentos...");
                        break;
                    case 8: // EXIBIR TIPO DE CONTAS
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
