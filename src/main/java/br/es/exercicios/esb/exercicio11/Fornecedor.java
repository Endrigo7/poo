package br.es.exercicios.esb.exercicio11;

public class Fornecedor extends Pessoa{

    private double valorCredito;
    private double valorDivida;

    public Fornecedor(String nome, double valorCredito, double valorDivida){
        super(nome);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public double obterSaldo(){
        return valorCredito - valorDivida;
    }

    @Override
    public String toString() {
        return "Fornecedor: " + getNome() +
                ", saldo: " + obterSaldo();
    }
}
