package br.com.simova.aula3b_video7;

import java.util.Date;

public class Aula3b {

    public static void main(String[] args) {

        System.out.println("\n");

        Caneta c1 = new Caneta();
        c1.modelo = "BIC Cristal";
        c1.cor = "Azul";
        // c1.ponta = 0.5f;
        c1.carga = 80;
        c1.destampar();
        c1.rabiscar();
        c1.status();
        System.out.println("\n");
        c1.tampar();
        c1.rabiscar();
        c1.status();

        DesafioAula3b desafioAula3b = new DesafioAula3b("Desafio Aula 3 b", "Robson", new Date(), false);
        desafioAula3b.setCanetaUtilizada(c1);

        System.err.println(desafioAula3b);
        System.out.println("\n");

        desafioAula3b.setDesafioComplete(true);
        System.out.println(desafioAula3b);

    }
}
