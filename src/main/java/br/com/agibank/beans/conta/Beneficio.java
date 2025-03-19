package br.com.agibank.beans.conta;

public class Beneficio {

    private int idBeneficio;
    private String classe;
    private String beneficio;

    public Beneficio(int idBeneficio, String classe, String beneficio) {
        this.idBeneficio = idBeneficio;
        this.classe = classe;
        this.beneficio = beneficio;
    }

    public int getIdBeneficio() {
        return idBeneficio;
    }

    public void setIdBeneficio(int idBeneficio) {
        this.idBeneficio = idBeneficio;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(String beneficio) {
        this.beneficio = beneficio;
    }
}
