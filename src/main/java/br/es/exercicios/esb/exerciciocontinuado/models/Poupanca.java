package br.es.exercicios.esb.exerciciocontinuado.models;

public class Poupanca extends Conta{

    public Poupanca(String numero, double saldo){
        super(numero, saldo);
    }

    public void atualizarSaldoComRendimentos(double taxa){
        double rendimento = getSaldo() * taxa;
        creditar(rendimento);
    }
}
