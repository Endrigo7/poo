package org.example.exercicio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leTeclado = new Scanner(System.in);

        System.out.println("Digite 3 números inteiros");
        int x = leTeclado.nextInt();
        int y = leTeclado.nextInt();
        int z = leTeclado.nextInt();

        if((x > y) && (x > z)){
            if(y > z){
                System.out.printf("%s, %s, %s", z, y, x);
            }else{
                System.out.printf("%s, %s, %s", y, z, x);
            }
        }else if(y > z){
            if(x > z){
                System.out.printf("%s, %s, %s", z, x, y);
            }else{
                System.out.printf("%s, %s, %s", x, z, y);
            }
        }else{
            if(x > y){
                System.out.printf("%s, %s, %s", y, x, z);
            }else{
                System.out.printf("%s, %s, %s", x, y, z);
            }
        }
    }
}
