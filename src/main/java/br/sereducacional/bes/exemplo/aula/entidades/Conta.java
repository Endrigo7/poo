package br.sereducacional.bes.exemplo.aula.entidades;

public class Conta {

    private String nome;

    private int agencia;  //0001

    private long numero;

    private double saldo;

    private double taxaDeJuros = 0.01;

    public String getNome(){
        return nome;
    }

    public void setNome(String novoNome){
        nome = novoNome;
    }

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

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double novoSaldo){
        saldo = novoSaldo;
    }

    public double getTaxaDeJuros(){
        return taxaDeJuros;
    }

    public void setTaxaDeJuros(double novaTaxaDeJuros){
        taxaDeJuros = novaTaxaDeJuros;
    }

    public void creditar(double valor){
        saldo = saldo + valor;
    }

    public void debitar(double valor){
        saldo = saldo - valor;
    }

    public void transferir(double valor, Conta contaDestino){
        System.out.println("Irá realizar o debito em: " + this.getNome());
        this.debitar(valor);

        System.out.println("Irá realizar o credito em: " + contaDestino.getNome());
        contaDestino.creditar(valor);
    }
}
