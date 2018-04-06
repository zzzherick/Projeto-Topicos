package com.topicos.cadastro;

public class Idiomas {

    private String nomeIdioma;
    private double preco;
    private int duracaoMes;
    private int duracaoHora;

    public void setNomeIdioma(String nomeIdioma){
        this.nomeIdioma = nomeIdioma;
    }

    public String getNomeIdioma(){
        return nomeIdioma;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public double getPreco(){
        return preco;
    }

    public void setDuracaoMes(int duracaoMes){
        this.duracaoMes = duracaoMes;
    }

    public int getDuracaoMes(){
        return duracaoMes;
    }

    public void setDuracaoHora(int duracaoHora){
        this.duracaoHora = duracaoHora;
    }

    public int getDuracaoHora(){
        return duracaoHora;
    }

}
