package org.example.model;

abstract class Match {

    public void LikeCandidato(Candidato candidato, Vagas vaga){
        candidato.VagaCurtida(vaga);
        vaga.setLiked(1);
        System.out.println("Você curtiu a vaga de "+vaga.getTitulo()+"!");
//       Implementar aqui a função match para que toda vez depois de um like ele verificar
//       Se deu um match
    }
    public void LikeEmpresa(Empresa empresa, Candidato candidato){
        empresa.CandidatoCurtido(candidato);
        System.out.println("Você curtiu o:  "+candidato.getNome()+"!");
    }


}
