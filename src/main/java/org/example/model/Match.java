package org.example.model;

abstract class Match {
    Candidato candidato = new Candidato();
    Empresa empresa = new Empresa();
    private int like ;

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public void Like(Vagas vaga){
        candidato.VagaCurtida(vaga);
        setLike(0);
//       Implementar aqui a função match para que toda vez depois de um like ele verificar
//       Se deu um match
    }
    public void Deslike(int i){
        setLike(1);
    }
    public void Match(Candidato candidato, Empresa empresa,Vagas vaga){
        for (ca:
             ) {
            
        }
            
            
        }
    }
    public void EnviarMensagem(){}
}
