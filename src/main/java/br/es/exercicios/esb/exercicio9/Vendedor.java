package br.es.exercicios.esb.exercicio9;

public class Vendedor extends Empregado{

    private float percentualComissao;

    public Vendedor(String nome, float salario, float percentualComissao){
        super(nome);
        this.salario = salario;
        this.percentualComissao = percentualComissao;
    }

    public float calcularComissao(){
        return (salario * percentualComissao) / 100;
    }

    public float calcularSalario(){
        return salario + calcularComissao();
    }

    public String toString(){
        return "Vendedor        : " + getNome() + "\n"
                + ", salario sem comissao (R$): " + salario + "\n"
                + ", valor da comissao    (R$): " + calcularComissao() + "\n"
                + ", salario com comissao (R$): " + calcularSalario() + "\n"
                + ", percentual de Comissao   : " + percentualComissao + "%";
    }
}
