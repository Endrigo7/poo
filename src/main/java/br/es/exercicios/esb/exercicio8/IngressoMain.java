package br.es.exercicios.esb.exercicio8;

public class IngressoMain {

    public static void main(String[] args) {
        final double VALOR_INGRESSO = 500;

        Ingresso ingresso = new Ingresso(VALOR_INGRESSO);
        IngressoVip ingressoVip = new IngressoVip(ingresso.getValor()
                , 250);

        System.out.println(ingresso);
        System.out.println(ingressoVip);

    }

}
