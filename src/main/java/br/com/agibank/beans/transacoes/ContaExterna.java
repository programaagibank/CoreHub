package br.com.agibank.beans.transacoes;

public class ContaExterna {
    private int id;
    private String jsonContaExterna;

    public ContaExterna() {
    }

    public ContaExterna(String jsonContaExterna) {
        this.jsonContaExterna = jsonContaExterna;
    }

    public ContaExterna(int id, String jsonContaExterna) {
        this.id = id;
        this.jsonContaExterna = jsonContaExterna;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJsonContaExterna() {
        return jsonContaExterna;
    }

    public void setJsonContaExterna(String jsonContaExterna) {
        this.jsonContaExterna = jsonContaExterna;
    }
}
