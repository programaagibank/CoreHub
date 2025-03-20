package br.com.agibank.controller;
import br.com.agibank.daos.SuporteDAO;
import br.com.agibank.beans.Suporte;

import java.sql.SQLException;

public class SuporteController {
    private final SuporteDAO suporteDAO = new SuporteDAO();

    public SuporteController() throws SQLException {
    }

    public void adicionarChamado(int id_usuario, String descricao){
        Suporte suporte = new Suporte(id_usuario,descricao);
        try{
            suporteDAO.inserirSuporte(id_usuario,descricao);
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

    }

    public Suporte buscarChamadoPorId(int id_chamado) {
        Suporte suporte = null;

        try {
            suporte = suporteDAO.buscarChamadoPorId(id_chamado);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return suporte;
    }

    public void atenderChamado(int id_chamado, int id_funcionario){
       Suporte suporte = buscarChamadoPorId(id_chamado);
        if(suporte!=null){

            try{
                suporteDAO.inserirAtendenteSuporte(id_chamado,id_funcionario);
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            suporte.setidFuncionario(id_funcionario);
        }
    }

    public void listarChamados(){
        try{
            suporteDAO.listarChamados();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public void listarChamadosPendentes(){
        try{
            suporteDAO.listarChamadosPendentes();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void listarChamadosAtendidos(){
        try{
            suporteDAO.listarChamadosAtendidos();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
