package br.es.classe.abstrata;

public abstract class Animal {

    private double peso;

    public void comer(){
        System.out.println("Estou comendo");
    }

    public abstract void emitirSom();
}
