package br.sereducaciona.projeto.bes;

public class Conta {

    String numero;
    double saldo;

    public void creditar(double valor){
        if(valor < 0){
            return;
        }

        saldo = saldo + valor;
    }

}
