
import br.com.agibank.controller.ScoreController;
import br.com.agibank.view.MenuInicial;

import java.sql.SQLException;
import java.util.Scanner;

import br.com.agibank.dao.conta.*;
import br.com.agibank.view.conta.MenuConta;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws SQLException{
        Scanner sc = new Scanner(System.in);
        //MenuInicial.exibirMenuInicial(sc);
        ScoreController scoreController = new ScoreController();

        System.out.println(scoreController.atualizarScore(2));
    }
}