package org.example.model;

import java.util.List;

abstract class Match {
    private List<Vagas> candidatoLikedEmpresa;
    private List<Candidato> empresaLikedCandidato;


    public List VagaCurtida(Vagas vaga){
        candidatoLikedEmpresa.add(vaga);
        return candidatoLikedEmpresa;
    }
    public void CandidatoCurtido(Candidato candidato) {
        empresaLikedCandidato.add(candidato);
    }



    public void LikeCandidato(Candidato candidato, Vagas vaga){
        candidato.VagaCurtida(vaga);
        vaga.setLiked(1);
        System.out.println("Você curtiu a vaga de "+vaga.getTitulo()+"!");


    }
    public void LikeEmpresa(Empresa empresa, Candidato candidato){
        empresa.CandidatoCurtido(candidato);
        System.out.println("Você curtiu o:  "+candidato.getNome()+"!");
        VerificarMatch(candidato);
    }

   public boolean VerificarMatch(Candidato candidato){
        boolean match;
        if (candidatoLikedEmpresa.contains(empresaLikedCandidato)) {
            match = true;
        }else match=false;
        return match;
    }
    public boolean VerificarMatch(Empresa empresa){
        boolean match;
        if (empresaLikedCandidato.contains(candidatoLikedEmpresa)) {
            match = true;
        }else match=false;
        return match;
    }




}
