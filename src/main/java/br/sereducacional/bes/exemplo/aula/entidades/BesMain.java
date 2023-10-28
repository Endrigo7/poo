package br.sereducacional.bes.exemplo.aula.entidades;

public class BesMain extends Conta{

    public static void main(String[] args) {
        Conta c1 = new Conta();    // 0x10
        c1.agencia = 0001;
        c1.numero = 1234;
        c1.saldo = 100;

        Conta c2 = new Conta();    //0x11
        c2.agencia = 0001;
        c2.numero = 1234;
        c2.saldo = 100;

        Conta c3 = new Conta();    //0x12
        c3.agencia = 0001;
        c3.numero = 1234;
        c3.saldo = 100;

        c1.saldo = 150;
        c2.saldo = 200;
        c3.saldo = 500;

        System.out.println(c1.saldo + " ---- " + c1.taxaDeJuros);  // 150  ---- 0.01
        System.out.println(c2.saldo + " ---- " + c2.taxaDeJuros);  // 200  ---- 0.01
        System.out.println(c3.saldo + " ---- " + c3.taxaDeJuros);  // 500  ---- 0.01


        c1.saldo = 300;
        c2.saldo = 500;
        c3.saldo = 700;
        c2.taxaDeJuros = 0.02;

        System.out.println("--------------------------------");  // 300  ---- 0.02
        System.out.println(c1.saldo + " ---- " + c1.taxaDeJuros);  // 300  ---- 0.02
        System.out.println(c2.saldo + " ---- " + c2.taxaDeJuros);  // 500  ---- 0.02
        System.out.println(c3.saldo + " ---- " + c3.taxaDeJuros);  // 700  ---- 0.02

    }

}
