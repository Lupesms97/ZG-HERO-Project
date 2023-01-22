package org.example.model;

import java.util.List;

public class Vagas {
    private String titulo;
    private double salario;
    private String localizacao;

    private String tipoContrato;

    private String descricaoVaga;
    private int isLiked;
    private List<Candidato> candidatoesDisponiveis;

    public Vagas(String titulo, double salario, String localizacao, String tipoContrato, String descricaoVaga, boolean isLiked, List<Candidato> candidatoesDisponiveis) {
        this.titulo = titulo;
        this.salario = salario;
        this.localizacao = localizacao;
        this.tipoContrato = tipoContrato;
        this.descricaoVaga = descricaoVaga;
        this.isLiked = 0;
        this.candidatoesDisponiveis = candidatoesDisponiveis;
    }
    public Vagas(){}
    public List<Candidato> getCandidatoesDisponiveis() {
        return candidatoesDisponiveis;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getIsLiked() {
        return isLiked;
    }

    public void setLiked(int isLiked) {
        this.isLiked = isLiked;
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

    @Override
    public String toString() {
        return "Vagas{" +
                "titulo='" + titulo + '\'' +
                ", salario=" + salario +
                ", localizacao='" + localizacao + '\'' +
                ", tipoContrato='" + tipoContrato + '\'' +
                ", descricaoVaga='" + descricaoVaga + '\'' +
                ", isLiked=" + isLiked +
                ", candidatoesDisponiveis=" + candidatoesDisponiveis +
                '}';
    }

}
