package br.com.simova.aula12b_video25;

public class Aula12b {

    public static void main(String[] args) {

        exibirLinhaPontilhada();

        Canguru c1 = new Canguru();
        c1.setMembros(4);
        c1.setCorPelo("Marrom");
        c1.exibirInfoAnimal();
        c1.usarBolsa();
        c1.exibirNomeDaClasseAndNomeDaSuperClasseAndNomeDoPacote();

        exibirLinhaPontilhada();

        Cachorro k1 = new Cachorro();
        k1.setMembros(4);
        k1.setCorPelo("Dourado");
        k1.exibirInfoAnimal();
        k1.exibirNomeDaClasseAndNomeDaSuperClasseAndNomeDoPacote();

        exibirLinhaPontilhada();

        Cobra s1 = new Cobra();
        s1.setMembros(0);
        s1.setCorEscama("Verde");
        s1.exibirInfoAnimal();
        s1.exibirNomeDaClasseAndNomeDaSuperClasseAndNomeDoPacote();

        exibirLinhaPontilhada();

        Tartaruga t1 = new Tartaruga();
        t1.setMembros(4);
        t1.setCorEscama("Marrom");
        t1.exibirInfoAnimal();
        t1.exibirNomeDaClasseAndNomeDaSuperClasseAndNomeDoPacote();

        exibirLinhaPontilhada();

        GoldFish f1 = new GoldFish();
        f1.setMembros(0);
        f1.setCorEscama("Dourado");
        f1.exibirInfoAnimal();
        f1.soltarBolhas();
        f1.exibirNomeDaClasseAndNomeDaSuperClasseAndNomeDoPacote();

        exibirLinhaPontilhada();

    }

    public static void exibirLinhaPontilhada() {

        System.out.println("------------------------------------------------------------------------------------");
    }
}
