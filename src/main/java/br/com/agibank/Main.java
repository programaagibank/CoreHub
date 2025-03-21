package br.com.agibank;
import br.com.agibank.beans.Funcionario;
import br.com.agibank.beans.Usuario;
import br.com.agibank.dao.FuncionarioDAO;
import br.com.agibank.dao.UsuarioDAO;

import java.sql.SQLException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws SQLException {
        try{
            Usuario usuario = new Usuario(1, "Heitor", "HTR", "1234", "heitor@teste.com", 1198759345, LocalDate.of(1985, 8, 20), "Rua Um", 45, "casa 2");
            UsuarioDAO usuarioDAO = new UsuarioDAO();
            usuarioDAO.criarUsuario(usuario);

//            Funcionario funcionario = new Funcionario(1, 5, "Aendente");
//            FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
//            funcionarioDAO.criarUsuario(1);
            // Instanciando a classe FuncionarioDAO


//            FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
//
//
//            Funcionario funcionario = new Funcionario();
//            funcionario.setId_funcionario(1); // ID do usuário já criado
//            funcionario.setFuncao("Analista");
//
//            // Chamando o método para criar o funcionário
//            int resultado = funcionarioDAO.criarUsuario(funcionario);
//            if (resultado > 0) {
//                System.out.println("Funcionário criado com sucesso!");
//            } else {
//                System.out.println("Erro ao criar o funcionário.");
//            }


//            Usuario usiario = new Usuario();
//            usiario.setApelido("HTR");
//            FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
//            System.out.println( funcionarioDAO.pegarIDUsuario(usiario));
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}