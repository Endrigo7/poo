package br.es.exercicios.esb.exercicio8;

public class IngressoVip extends Ingresso{
    private double valorAdicional;

    public IngressoVip(){}

    public IngressoVip(double valor, double valorAdicional){
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public double getValorAdicional(){
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional){
        this.valorAdicional = valorAdicional;
    }

    public double getValorIngressoVip(){
        return getValor() + valorAdicional;
    }

    public String toString(){
        return "O valor do ingresso VIP é R$" + getValorIngressoVip();
    }

}
