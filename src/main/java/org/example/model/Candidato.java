package org.example.model;

import java.net.PasswordAuthentication;
import java.util.Date;

public class Candidato {
//    username
    private String email;
    private char senha;
    private String nome;
    private Date datadeNacimento;
    private String cidade;
    private String areaDeAtuacao;
    private int tempoDeExperiencia;

    public Candidato(String email, char senha) {
        this.email = email;
        this.senha = senha;
    }

    public Candidato(String email, char senha, String nome, Date datadeNacimento, String cidade, String areaDeAtuacao, int tempoDeExperiencia) {
        this.email = email;
        this.senha = senha;
        this.nome = nome;
        this.datadeNacimento = datadeNacimento;
        this.cidade = cidade;
        this.areaDeAtuacao = areaDeAtuacao;
        this.tempoDeExperiencia = tempoDeExperiencia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getSenha() {
        return senha;
    }

    public void setSenha(char senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDatadeNacimento() {
        return datadeNacimento;
    }

    public void setDatadeNacimento(Date datadeNacimento) {
        this.datadeNacimento = datadeNacimento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getAreaDeAtuacao() {
        return areaDeAtuacao;
    }

    public void setAreaDeAtuacao(String areaDeAtuacao) {
        this.areaDeAtuacao = areaDeAtuacao;
    }

    public int getTempoDeExperiencia() {
        return tempoDeExperiencia;
    }

    public void setTempoDeExperiencia(int tempoDeExperiencia) {
        this.tempoDeExperiencia = tempoDeExperiencia;
    }
}











