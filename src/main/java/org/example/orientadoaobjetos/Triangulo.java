package org.example.orientadoaobjetos;

class Triangulo {

    double lado1;
    double lado2;
    double lado3;

    Triangulo(double l1, double l2, double l3){
        lado1 = l1;
        lado2 = l2;
        lado3 = l3;
    }

    double calcularPerimetro(){
        return (lado1 + lado2 + lado3) / 2;
    }

    double calcularArea(){
        double p = calcularPerimetro();
        double area = p * (p - lado1) * (p - lado2) * (p - lado3);
        return Math.sqrt(area);
    }
}
