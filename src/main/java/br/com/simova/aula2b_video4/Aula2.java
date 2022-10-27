package br.com.simova.aula2b_video4;

import java.util.Date;

public class Aula2 {

    public static void main(String[] args) {

        System.out.println("\n");

        Caneta c1 = new Caneta();
        c1.modelo = "Bic 01";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.carga = 80;
        c1.tampar();
        c1.rabiscar();
        c1.status();

        System.out.println("\n");

        Caneta c2 = new Caneta();
        c2.modelo = "Bic 02";
        c2.cor = "Preta";
        c2.ponta = 0.5f;
        c2.carga = 80;
        c2.destampar();
        c2.rabiscar();

        c2.status();

        System.out.println("\n");

        Caneta c3 = new Caneta();
        c3.modelo = "Bic 03";
        c3.cor = "Vermelha";
        c3.ponta = 1.5f;
        c3.carga = 80;
        c3.tampar();
        c3.rabiscar();
        c3.destampar();
        c3.rabiscar();

        c3.status();

        System.out.println("\n");

        DesafioAula2b desafioAula2b = new DesafioAula2b("Desafio Aula 2 b", "Robson", new Date(), true);
        desafioAula2b.setCanetaUtilizada(c3);

        System.err.println(desafioAula2b);
    }
}
