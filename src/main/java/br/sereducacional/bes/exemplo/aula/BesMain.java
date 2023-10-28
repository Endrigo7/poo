package br.sereducacional.bes.exemplo.aula;

import br.sereducacional.bes.exemplo.aula.entidades.Cliente;
import br.sereducacional.bes.exemplo.aula.entidades.Conta;
import br.sereducacional.bes.exemplo.aula.entidades.Poupanca;
import br.sereducacional.bes.exemplo.aula.repositorio.ContaRepositorio;

public class BesMain  {

    public static void main(String[] args) {


        ContaRepositorio contaRepositorio = new ContaRepositorio();

        System.out.println( "Você tera uma valor apos 10 meses de :" +
                Conta.simulacaoInvestimento(100, 10)
                + " esse valor foi devido a uma taxa de juros de " + Conta.getTaxaDeJurosFinanciamento()
        );

        Cliente cliente1 = new Cliente("Jose", "123");
        System.out.println(cliente1);

        Conta c1 = new Conta("c1", 0001, 1234, 101);    // 0x10
        contaRepositorio.salvar(c1);

        Conta c2 = new Conta("c2", 0001, 2345, 100);    //0x11
        contaRepositorio.salvar(c2);

        Conta c3 = new Conta("c3", 0001, 3456, 100);    //0x12
        contaRepositorio.salvar(c3);

        Conta c4 = new Conta("c4", 0001, 4567, 100);
        contaRepositorio.salvar(c4);

        Poupanca p1 = new Poupanca("p1", 0001, 5678, 100);
        p1.creditar(1000);
        contaRepositorio.salvar(p1);
        System.out.println( p1); //1100

        c1.setSaldo(150);
        c2.setSaldo(200);
        c3.setSaldo(500);

        System.out.println(c1);  // 150  ---- 0.01
        System.out.println(c2);  // 200  ---- 0.01
        System.out.println(c3);  // 500  ---- 0.01


        c1.setSaldo(300);
        c2.setSaldo(500);
        c3.setSaldo(700);

        System.out.println("--------------------------------");  // 300  ---- 0.02
        System.out.println(c1);  // 300  ---- 0.02
        System.out.println(c2);  // 500  ---- 0.02
        System.out.println(c3);  // 700  ---- 0.02

        c1.creditar(100);
        c2.creditar(200);
        c3.debitar(300);

        System.out.println("--------------------------------");
        System.out.println(c1);  // 400  ---- 0.02
        System.out.println(c2);  // 700  ---- 0.02
        System.out.println(c3);  // 400  ---- 0.02

        c2.transferir(100, c3);

        System.out.println("--------------------------------");
        System.out.println(c1);  // 400  ---- 0.02
        System.out.println(c2);  // 600  ---- 0.02
        System.out.println(c3);  // 500  ---- 0.02

        System.out.println("Encontre c1 e imprima ela" + contaRepositorio.buscar(0001, 1234));
        System.out.println("Encontre p1 e imprima ela" + contaRepositorio.buscar(0001, 5678));

        p1.renderJuros();
        System.out.println("Encontre p1 e imprima ela" + contaRepositorio.buscar(0001, 5678));

    }

}
