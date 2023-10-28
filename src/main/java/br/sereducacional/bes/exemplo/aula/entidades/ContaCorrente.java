package br.sereducacional.bes.exemplo.aula.entidades;

public class ContaCorrente extends Conta{

    private double valorLimite;

    public ContaCorrente(String nomeConta, int agenciaConta, long numeroConta, double saldoInicial, double valorLimite) {
        super(nomeConta, agenciaConta, numeroConta, saldoInicial);
        this.valorLimite = valorLimite;
    }

    @Override
    public void debitar(double valor){
        double saldoDepoisDoDebito = getSaldo() - valor;

        if (saldoDepoisDoDebito + valorLimite >= 0){
            setSaldo(getSaldo() - valor);
        }else {
            throw new RuntimeException("Cliente não possui saldo e limite suficiente");
        }
    }

    public void debitar(double valor, String mensagemErro){
        double saldoDepoisDoDebito = getSaldo() - valor;

        if (saldoDepoisDoDebito + valorLimite >= 0){
            setSaldo(getSaldo() - valor);
        }else {
            throw new RuntimeException(mensagemErro);
        }
    }
}
