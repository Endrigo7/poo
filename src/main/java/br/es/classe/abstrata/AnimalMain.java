package br.es.classe.abstrata;

public class AnimalMain {


    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Passaro passaro = new Passaro();

        System.out.println("Metodos do passaro");
        passaro.emitirSom();
        passaro.voar();
        passaro.comer();

        System.out.println("Metodos do cachorro");
        cachorro.emitirSom();
        cachorro.comer();

    }

}
