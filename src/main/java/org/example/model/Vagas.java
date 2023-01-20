package org.example.model;

public class Vagas {
    private double salrio;
    private String localizacao;

    private String tipoContrato;

    private String descricaoVaga;

    public Vagas(double salrio, String localizacao, String tipoContrato, String descricaoVaga) {
        this.salrio = salrio;
        this.localizacao = localizacao;
        this.tipoContrato = tipoContrato;
        this.descricaoVaga = descricaoVaga;
    }

    public double getSalrio() {
        return salrio;
    }

    public void setSalrio(double salrio) {
        this.salrio = salrio;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public String getDescricaoVaga() {
        return descricaoVaga;
    }

    public void setDescricaoVaga(String descricaoVaga) {
        this.descricaoVaga = descricaoVaga;
    }


}
