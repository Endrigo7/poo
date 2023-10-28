package br.sereducacional.bes.exemplo.aula.entidades;

public class Conta {

    private int agencia;  //0001

    private long numero;

    private double saldo;

    private double taxaDeJuros = 0.01;

    public int getAgencia(){
        return agencia;
    }

    public void setAgencia(int novaAgencia){
        agencia = novaAgencia;
    }

    public long getNumero(){
        return numero;
    }

    public void setNumero(long novoNumero){
        numero = novoNumero;
    }

}
