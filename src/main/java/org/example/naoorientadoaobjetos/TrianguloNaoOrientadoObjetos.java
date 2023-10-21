package org.example.naoorientadoaobjetos;

import java.util.Scanner;

public class TrianguloNaoOrientadoObjetos {

    public static void main(String[] args) {
        Scanner leTeclado = new Scanner(System.in);

        // representar trinagulo 1
        double t1l1, t1l2, t1l3;
        double t1p, t1area;

        System.out.println("Digite os lados do triangulo 1");
        t1l1 = leTeclado.nextDouble();
        t1l2 = leTeclado.nextDouble();
        t1l3 = leTeclado.nextDouble();

        t1p = (t1l1 + t1l2 + t1l3) / 2;
        t1area = t1p * (t1p - t1l1) * (t1p - t1l2) * (t1p - t1l3);
        t1area = Math.sqrt(t1area);

        // representar trinagulo 2
        double t2l1, t2l2, t2l3;
        double t2p, t2area;

        System.out.println("Digite os lados do triangulo 2");
        t2l1 = leTeclado.nextDouble();
        t2l2 = leTeclado.nextDouble();
        t2l3 = leTeclado.nextDouble();

        t2p = (t2l1 + t2l2 + t2l3) / 2;
        t2area = t2p * (t2p - t2l1) * (t2p - t2l2) * (t2p - t2l3);
        t2area = Math.sqrt(t2area);

        if(t1area > t2area){
            System.out.print("O primeiro triangulo é o maior");
        }else{
            System.out.print("O secundo triangulo é o maior");
        }
        System.out.println(" sendo o primeiro triangulo com area " + t1area + " e o secundo com area " + t2area);
    }
}
