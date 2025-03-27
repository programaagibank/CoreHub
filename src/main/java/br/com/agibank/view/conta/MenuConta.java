package br.com.agibank.view.conta;

import br.com.agibank.controller.conta.ContaController;
import br.com.agibank.view.cores.CoresTerminal;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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

                        System.out.print("Informe o ID da agência: ");
                        int idAgencia = sc.nextInt();

                        System.out.print("Informe o número da conta: ");
                        int numeroConta = sc.nextInt();

                        System.out.print("Informe o saldo inicial: ");
                        double saldoInicial = sc.nextDouble();

                        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                        String dataFormatada = LocalDate.now().format(formato);

                        int resultado = contaController.cadastrarConta(idUsuario, tipoConta, 1, idAgencia, numeroConta, saldoInicial, dataFormatada);

                        break;

                    case 3:
                        contaController.deletarConta(idConta);
                        System.out.println("Conta excluida com sucesso");
                        break;
                    case 4:
                        System.out.println("Saldo disponível: ");
                        break;
                    case 5:
                        System.out.println("Saldo disponível: ");
                        break;
                    case 6:
                        System.out.println("Titular da conta: " + contaController.exibirTitularConta(idConta));
                        break;
                    case 7:
                        System.out.println("Exibindo documentos...");
                        break;
                    case 8:
                        System.out.println("Exibindo tipos de conta...");
                        System.out.println(contaController.exibirTiposConta(idConta));
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
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } while (interacao != 0);

        sc.close();
    }
}
