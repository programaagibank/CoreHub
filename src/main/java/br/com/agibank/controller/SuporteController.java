package br.com.agibank.controller;
import br.com.agibank.daos.SuporteDAO;
import br.com.agibank.beans.Suporte;

public class SuporteController {
    private SuporteDAO suporteDAO = new SuporteDAO();

    public void adicionarChamado(int id_usuario, String descricao){
        Suporte suporte = new Suporte(id_usuario,descricao);
        suporteDAO.inserirSuporte(id_usuario,descricao);
    }

    public void atenderChamado(int id_chamado, int id_funcionario){
        Suporte suporte = suporteDAO.buscarChamadoPorId(id_chamado);
        if(suporte!=null){
            suporte.setidFuncionario(id_funcionario);
            suporteDAO.inserirAtendenteSuporte(id_chamado,id_funcionario);
        }
    }
}
