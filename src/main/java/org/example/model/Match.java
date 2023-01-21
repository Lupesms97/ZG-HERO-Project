package org.example.model;

abstract class Match {
    private int like ;

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int Like(){
        setLike(0);
        return like;
    }
    public int Deslike(){
        setLike(1);
        return like;
    }
    public void Match(){}
    public void EnviarMensagem(){}
}
