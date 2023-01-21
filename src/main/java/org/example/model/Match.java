package org.example.model;

abstract class Match {
    private int like ;

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public void Like(){
        setLike(0);
    }
    public void Deslike(){
        setLike(1);
    }
    public void Match(){}
    public void EnviarMensagem(){}
}
