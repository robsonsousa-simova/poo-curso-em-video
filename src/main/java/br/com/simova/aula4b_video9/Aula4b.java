package br.com.simova.aula4b_video9;

public class Aula4b {

    public static void main(String[] args) {

        Caneta c1 = new Caneta("NIC", "Amarela", 0.4f);
        c1.status();

        System.out.println("Tenho uma caneta " + c1.getModelo() + " na cor " + c1.getCor() + " e de ponta " + c1.getPonta());
        System.out.println("\n");

        Caneta c2 = new Caneta("Lamy", "Verde", 1.4f);
        c2.setTampada(false);
        c2.status();

        System.err.println("Tenho uma caneta " + c2.getModelo() + " na cor " + c2.getCor() + " e de ponta " + c2.getPonta());
    }
}
