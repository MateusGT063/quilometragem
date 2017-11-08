package br.com.projeto_km;

/**
 * Created by 16254862 on 06/11/2017.
 */



public class Quilometro {


    public Boolean ativo;
    public Quilometro(){};
    private Float kmrodados;

    public Quilometro(String quilometro, boolean ativo) {
        this.kmrodados = kmrodados;
        this.ativo = ativo;
    }

    public Boolean getAtivo() {return ativo;}

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public Float getKmrodados() {return kmrodados;}

    public void setKmrodados(Float kmrodados) {
        this.kmrodados = kmrodados;
    }

}
