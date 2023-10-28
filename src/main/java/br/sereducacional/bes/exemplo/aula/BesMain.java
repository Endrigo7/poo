package br.sereducacional.bes.exemplo.aula;

import br.sereducacional.bes.exemplo.aula.entidades.Conta;

public class BesMain extends Conta {

    public static void main(String[] args) {
        Conta c1 = new Conta();    // 0x10
        c1.setNome("c1");
        c1.setAgencia(0001);
        c1.setNumero(1234);
        c1.setSaldo(100);

        Conta c2 = new Conta();    //0x11
        c2.setNome("c2");
        c2.setAgencia(0001) ;
        c2.setNumero(1234);
        c2.setSaldo(100);

        Conta c3 = new Conta();    //0x12
        c3.setNome("c3");
        c3.setAgencia(0001);
        c3.setNumero(1234);
        c3.setSaldo(100);

        c1.setSaldo(150);
        c2.setSaldo(200);
        c3.setSaldo(500);

        System.out.println(c1.getSaldo() + " ---- " + c1.getTaxaDeJuros());  // 150  ---- 0.01
        System.out.println(c2.getSaldo() + " ---- " + c2.getTaxaDeJuros());  // 200  ---- 0.01
        System.out.println(c3.getSaldo() + " ---- " + c3.getTaxaDeJuros());  // 500  ---- 0.01


        c1.setSaldo(300);
        c2.setSaldo(500);
        c3.setSaldo(700);
        c2.setTaxaDeJuros(0.02);

        System.out.println("--------------------------------");  // 300  ---- 0.02
        System.out.println(c1.getSaldo() + " ---- " + c1.getTaxaDeJuros());  // 300  ---- 0.02
        System.out.println(c2.getSaldo() + " ---- " + c2.getTaxaDeJuros());  // 500  ---- 0.02
        System.out.println(c3.getSaldo() + " ---- " + c3.getTaxaDeJuros());  // 700  ---- 0.02

        c1.creditar(100);
        c2.creditar(200);
        c3.debitar(300);

        System.out.println("--------------------------------");
        System.out.println(c1.getSaldo() + " ---- " + c1.getTaxaDeJuros());  // 400  ---- 0.02
        System.out.println(c2.getSaldo() + " ---- " + c2.getTaxaDeJuros());  // 700  ---- 0.02
        System.out.println(c3.getSaldo() + " ---- " + c3.getTaxaDeJuros());  // 400  ---- 0.02

        c2.transferir(100, c3);

        System.out.println("--------------------------------");
        System.out.println(c1.getSaldo() + " ---- " + c1.getTaxaDeJuros());  // 400  ---- 0.02
        System.out.println(c2.getSaldo() + " ---- " + c2.getTaxaDeJuros());  // 600  ---- 0.02
        System.out.println(c3.getSaldo() + " ---- " + c3.getTaxaDeJuros());  // 500  ---- 0.02

    }

}
