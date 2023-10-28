package br.es.exercicios.esb.exercicio9;

public class EmpregadoMain {

    public static void main(String[] args) {
        Gerente gerente = new Gerente("Joao", "Vendas", 15000f);
        Vendedor vendedor = new Vendedor("Jose", 10000f, 10.0f);
        System.out.println(gerente);
        System.out.println("-------------");
        System.out.println(vendedor);
    }

}
