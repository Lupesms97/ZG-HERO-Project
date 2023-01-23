package org.example.model;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Empresa extends Match {
    private String cnpj;
    private String senhaEmpresa;
    private String nome;
    private int quantidadeFuncionario;
    private LocalDate dataFundacao;
    private Vagas vaga;
    private List<Vagas> vagsPublicada = new ArrayList<>();
    private List<Candidato> empresaLikedCandidato;

    public Empresa() {}

    public Empresa(String cnpj, String senha) {
        this.cnpj = cnpj;
        this.senhaEmpresa = senha;
    }

    public Empresa(String cnpj, String senha, String nome, int quantidadeFuncionario, LocalDate dataFundacao) {
        this.cnpj = cnpj;
        this.senhaEmpresa = senha;
        this.nome = nome;
        this.quantidadeFuncionario = quantidadeFuncionario;
        this.dataFundacao = dataFundacao;
        this.vaga = vaga;
    }


    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getSenhaEmpresa() {
        return senhaEmpresa;
    }

    public void setSenhaEmpresa(String senhaEmpresa) {
        this.senhaEmpresa = senhaEmpresa;
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


    public Vagas getVaga() {
        return vaga;
    }

    public void setVaga(Vagas vaga) {
        this.vaga = vaga;
        vagsPublicada.add(vaga);
    }


    public LocalDate getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(LocalDate dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public void CandidatoCurtido(Candidato candidato) {
        empresaLikedCandidato.add(candidato);
    }

    public List<String> mostrarCandidatoDisponiveis(Vagas vaga) {
        List<String> verCandidatos = null;
        for (Candidato candidato : vaga.getCandidatoesDisponiveis()) {
            verCandidatos.add(String.valueOf(candidato));
        }
        return verCandidatos;
    }

    public void MostarVagsPublicadas() {
        vagsPublicada.forEach(System.out::println);
    }

    static public void ImplmentaçãoCandidato(){}



    @Override
    public String toString() {
        return "Empresa{" +
                "cnpj='" + cnpj + '\'' +
                ", senha='" + senhaEmpresa + '\'' +
                ", nome='" + nome + '\'' +
                ", quantidadeFuncionario=" + quantidadeFuncionario +
                ", dataFundacao=" + dataFundacao +
                '}';
    }
}