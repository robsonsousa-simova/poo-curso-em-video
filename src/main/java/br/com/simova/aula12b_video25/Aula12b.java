package br.com.simova.aula12b_video25;

public class Aula12b {

    public static void main(String[] args) {

        exibirLinhaPontilhada();
        Mamifero m1 = new Mamifero();
        m1.setMembros(4);
        m1.setCorPelo("Branco");
        m1.setIdade(4);
        m1.setPeso(40);
        m1.exibirInfoAnimal();
        m1.exibirNomeDaClasseAndNomeDaSuperClasseAndNomeDoPacote();

        exibirLinhaPontilhada();

        Ave a1 = new Ave();
        a1.setMembros(2);
        a1.setCorPena("Branca");
        a1.setIdade(2);
        a1.setPeso(3);
        a1.exibirInfoAnimal();
        a1.exibirNomeDaClasseAndNomeDaSuperClasseAndNomeDoPacote();

        exibirLinhaPontilhada();

        Peixe p1 = new Peixe();
        p1.setMembros(0);
        p1.setCorEscama("Cinza");
        p1.setIdade(1);
        p1.setPeso(3);
        p1.exibirInfoAnimal();
        p1.soltarBolhas();
        p1.exibirNomeDaClasseAndNomeDaSuperClasseAndNomeDoPacote();

        exibirLinhaPontilhada();

        Reptil r1 = new Reptil();
        r1.setMembros(4);
        r1.setCorEscama("Verde");
        r1.setIdade(2);
        r1.setPeso(3);
        r1.exibirNomeDaClasseAndNomeDaSuperClasseAndNomeDoPacote();

        r1.exibirInfoAnimal();
    }

    public static void exibirLinhaPontilhada(){

        System.out.println("------------------------------------------------------------------------------------");
    }
}
