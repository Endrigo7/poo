package org.example.passagem.parametro;

public class Somar {



    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 20;

        System.out.println("valor do numero1 dentro do metodo main: " + numero1);  // 10
        somar(numero1, numero2);                                                   // 30
        System.out.println("valor do numero1 dentro do metodo main: " + numero1);  // 10

        Aluno aluno = new Aluno();
        aluno.nome = "José";

        System.out.println("nome do aluno dentro do metodo main: " + aluno.nome);  // Jose
        sobrenomeAluno(aluno);                                                     // Jose da Silva
        System.out.println("nome do aluno dentro do metodo main: " + aluno.nome);  // Jose
    }

    public static void somar(int numero1, int numero2){
        numero1 = numero1 + numero2;
        System.out.println("valor do numero1 dentro do metodo somar: " + numero1);
    }

    public static void sobrenomeAluno(Aluno aluno){
        String nome = aluno.nome;

        aluno = new Aluno();
        aluno.nome = nome + " da silva";
        System.out.println("nome do aluno dentro do metodo sobrenomeAluno: " + aluno.nome);
    }
}
