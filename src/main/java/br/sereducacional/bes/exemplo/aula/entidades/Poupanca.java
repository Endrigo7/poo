package br.sereducacional.bes.exemplo.aula.entidades;

public class Poupanca extends Conta{

    private static final double taxaDeJurosPoupanca = 0.01;


    public Poupanca(String novoNome, int novaAgencia, long novoNumero, double saldoInicial){
        super(novoNome, novaAgencia, novoNumero, saldoInicial);
        System.out.println("Vou criar uma poupanca com o construtor");
    }

    public void renderJuros(){
        double rendimento = getSaldo() * taxaDeJurosPoupanca;
        creditar(rendimento);
    }

}
