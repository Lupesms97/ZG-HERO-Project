package org.example.model;


import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Empresa extends Match {
    private String cnpj;
    private String senha;
    private String nome;
    private int quantidadeFuncionario;
    private LocalDate dataFundacao;
    private Vagas vaga;
    private List<Candidato> candidatosAprovados;

    public Empresa() {

    }

    public Empresa(String cnpj, String senha) {
        this.cnpj = cnpj;
        this.senha = senha;
    }

    public Empresa(String cnpj, String senha, String nome, int quantidadeFuncionario, LocalDate dataFundacao) {
        this.cnpj = cnpj;
        this.senha = senha;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
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


    public Vagas getVaga() {
        return vaga;
    }

    public void setVaga(Vagas vaga) {
        this.vaga = vaga;
    }

    public LocalDate getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(LocalDate dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public void CandidatoCurtido(Candidato candidato) {
        candidatosAprovados.add(candidato);

    }
    public void CriarVagas(){
        Vagas vaga = new Vagas();

    }
    public List<String> mostrarCandidatoDisponiveis(Vagas vaga){
        List<String> verCandidatos = null;
        for (Candidato candidato: vaga.getCandidatoesDisponiveis()) {
            verCandidatos.add(String.valueOf(candidato));
        }
        return verCandidatos;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "cnpj='" + cnpj + '\'' +
                ", senha='" + senha + '\'' +
                ", nome='" + nome + '\'' +
                ", quantidadeFuncionario=" + quantidadeFuncionario +
                ", dataFundacao=" + dataFundacao +
                ", vaga=" + vaga +
                ", candidatosAprovados=" + candidatosAprovados +
                '}';
    }
}
