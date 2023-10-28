package org.example.orientadoaobjetos;


public class TrianguloOrientadoObjetos {

    public static void main(String[] args) {
        Triangulo t1 = new Triangulo(4, 8, 9);
        Triangulo t2 = new Triangulo(8, 8, 8);

        if(t1.calcularArea() > t2.calcularArea()){
            System.out.print("O primeiro triangulo é o maior");
        }else{
            System.out.print("O secundo triangulo é o maior");
        }
        System.out.println(" sendo o primeiro triangulo com area "
                + t1.calcularArea() + " e o secundo com area " + t2.calcularArea());
    }
}
