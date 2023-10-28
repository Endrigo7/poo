package br.sereducacional.bes.exemplo.aula.entidades;

public class Conta extends Object{

    private String nome;

    private int agencia;  //0001

    private long numero;

    private double saldo;

    private static final double taxaDeJurosFinanciamento = 1.1;

    public Conta(String nomeConta, int agenciaConta, long numeroConta, double saldoInicial){
        System.out.println("Criando objeto da conta de nome: " + nomeConta);

        if(saldoInicial < 100) {
            throw new RuntimeException("Não é possível abrir contas com menos de 100 reais");
        }

        nome = nomeConta;
        agencia = agenciaConta;
        numero = numeroConta;
        saldo = saldoInicial;
    }

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

    public static double getTaxaDeJurosFinanciamento(){
        return taxaDeJurosFinanciamento;
    }

    public void creditar(double valor){
        System.out.println("creditar da classe conta");
        saldo = saldo + valor;
    }

    public void debitar(double valor){
        if(valor > getSaldo()){
            throw new RuntimeException("Cliente não possui saldo suficiente");
        }

        saldo = saldo - valor;
    }

    public void transferir(double valor, Conta contaDestino){
        System.out.println("Irá realizar o debito em: " + this.getNome());
        this.debitar(valor);

        System.out.println("Irá realizar o credito em: " + contaDestino.getNome());
        contaDestino.creditar(valor);
    }

    public static double simulacaoInvestimento(double investimentoInicial, int quantidadeDeMeses){
        return investimentoInicial * quantidadeDeMeses * taxaDeJurosFinanciamento;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "nome='" + nome + '\'' +
                // ", agencia=" + agencia +
                // ", numero=" + numero +
                ", saldo=" + saldo +
                '}';
    }
}
