package org.example.orientadoaobjetos;

class Triangulo {

    double lado1;
    double lado2;
    double lado3;

    Triangulo(double x, double y, double z){
        lado1 = x;
        lado2 = y;
        lado3 = z;
    }

    double calcularP(){
        return (lado1 + lado2 + lado3) / 2;
    }

    double calcularArea(){
        double p = calcularP();
        double area = p * (p - lado1) * (p - lado2) * (p - lado3);
        return Math.sqrt(area);
    }
}
