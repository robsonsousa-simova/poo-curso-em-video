package br.com.simova.aula6b_video13;

public class Aula6b {

    public static void main(String[] args) {

        ControleRemoto cr1 = new ControleRemoto();

        // caso 1
        cr1.abrirMenu();

        // caso 2
        cr1.ligar();
        cr1.abrirMenu();

        // caso 3
        cr1.play();
        cr1.abrirMenu();

        // caso 4
        cr1.aumentarVolume();
        cr1.abrirMenu();

        // caso 5
        cr1.diminuirVolume();
        cr1.diminuirVolume();
        cr1.diminuirVolume();
        cr1.abrirMenu();

        // caso 6
        cr1.ativarMudo();
        cr1.abrirMenu();

        // caso 7
        cr1.desativarMudo();
        cr1.abrirMenu();

        // caso 8
        cr1.desligar();
        cr1.abrirMenu();

        // caso 9
        cr1.desligar();
        cr1.abrirMenu();

        // caso 10
        cr1.pause();
        cr1.abrirMenu();

        // caso 11
        cr1.ativarMudo();
        cr1.abrirMenu();

        // caso 12
        cr1.desativarMudo();
        cr1.abrirMenu();

        // caso 13
        cr1.desligar();
        cr1.abrirMenu();

        // caso 14
        cr1.ligar();
        cr1.abrirMenu();

        // caso 15
        cr1.play();
        cr1.abrirMenu();
    }
}
