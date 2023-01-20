package org.example.model;


import java.util.Date;

public class Empresa {
    private String cnpj;
    private char senha;
    private String nome;
    private int quantidadeFuncionario;
    private Date dataFundação;

    public Empresa(String cnpj, char senha) {
        this.cnpj = cnpj;
        this.senha = senha;
    }

    public Empresa(String cnpj, char senha, String nome, int quantidadeFuncionario, Date dataFundação) {
        this.cnpj = cnpj;
        this.senha = senha;
        this.nome = nome;
        this.quantidadeFuncionario = quantidadeFuncionario;
        this.dataFundação = dataFundação;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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

    public int getQuantidadeFuncionario() {
        return quantidadeFuncionario;
    }

    public void setQuantidadeFuncionario(int quantidadeFuncionario) {
        this.quantidadeFuncionario = quantidadeFuncionario;
    }

    public Date getDataFundação() {
        return dataFundação;
    }

    public void setDataFundação(Date dataFundação) {
        this.dataFundação = dataFundação;
    }
    //verificar formas de fazer

}
