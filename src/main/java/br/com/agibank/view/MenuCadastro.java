package br.com.agibank.view;

import java.time.LocalDate;
import java.util.Scanner;

public class MenuCadastro {
    //TODO implememtar bcrypt para cadastrar a senha ex.https://cursos.alura.com.br/forum/topico-utilizando-bcrypt-228825
    public static void cadastro(){
        Scanner sc = new Scanner(System.in);
        String nome;
        String apelido;
        String senha;
        String senhaConfirmada;
        String telefone;
        LocalDate dataNascimento;
        String rua;
        String numero;
        String complemento;

        System.out.print("Cadastro de Usuario");
        System.out.print("\n Nome:");
        nome = sc.next();
        System.out.print("Apelido:");
        apelido = sc.nextLine();
        System.out.print("Senha:");
        senha = sc.nextLine();
        System.out.print("Confirmacao senha");
        senhaConfirmada = sc.nextLine();
        System.out.print("Telefone:");
        telefone = sc.nextLine();
        System.out.print("Data de Nascimento (yyyy/MM/dd): ");
        dataNascimento = LocalDate.parse(sc.nextLine());
        System.out.print("Rua: ");
        rua = sc.nextLine();
        System.out.print("Numero: ");
        numero = sc.nextLine();
        System.out.print("Complemento:");
        complemento = sc.nextLine();

        System.out.println(
                nome + "\n" + apelido + "\n" + senha + "\n" + senhaConfirmada + "\n" + telefone + "\n" + dataNascimento + "\n" + rua + "\n" + numero + "\n" + complemento
        );
    }
}
