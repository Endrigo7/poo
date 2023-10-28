package br.es.exercicios.esb.exerciciocontinuado.models;

import br.es.exercicios.esb.exerciciocontinuado.models.Cliente;

public class Teste {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Jose", "123");
        System.out.println(cliente.getNome());

    }

}
