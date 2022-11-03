package br.com.simova.aula13b_video17;

public class Aula13b {

    public static void main(String[] args) {

        Mamifero m1 = new Mamifero();
        m1.emitirSom();

        Lobo l1 = new Lobo();
        l1.emitirSom();

        Cachorro c1 = new Cachorro();
        c1.emitirSom();

        exibirLinhaPontilhada();

        c1.reagir("Comida");
        c1.reagir("Carinho");
        c1.reagir("Quieto");

        exibirLinhaPontilhada();

        c1.reagir(11, 12);
        c1.reagir(18, 1);
        c1.reagir(14, 30);

        exibirLinhaPontilhada();

        c1.reagir(true);
        c1.reagir(false);

        exibirLinhaPontilhada();

        c1.reagir(4, 9.5f);
        c1.reagir(4, 10f);
        c1.reagir(5, 9f);
        c1.reagir(6, 10f);

        exibirLinhaPontilhada();
    }

    public static void exibirLinhaPontilhada() {

        System.out.println("----------------------------------------------------------------------");
    }
}
