package org.example.model;

import java.util.List;

public class Vagas {
    private double salario;
    private String localizacao;

    private String tipoContrato;

    private String descricaoVaga;
    private List<Candidato> candidatoesDisponiveis;

    public Vagas(double salario, String localizacao, String tipoContrato, String descricaoVaga) {
        this.salario = salario;
        this.localizacao = localizacao;
        this.tipoContrato = tipoContrato;
        this.descricaoVaga = descricaoVaga;
    }

    public List<Candidato> getCandidatoesDisponiveis() {
        return candidatoesDisponiveis;
    }

    public void setCandidatoesDisponiveis(List<Candidato> candidatoesDisponiveis) {
        this.candidatoesDisponiveis = candidatoesDisponiveis;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
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
