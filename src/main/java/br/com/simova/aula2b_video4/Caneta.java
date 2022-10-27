package br.com.simova.aula2b_video4;

public class Caneta {

    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    public String getModelo() {
        return modelo;
    }

    public void status() {
        System.out.println("Modelo da caneta: " + this.modelo
                + "\nCor da caneta: " + this.cor
                + "\nPonta da caneta: " + this.ponta
                + "\nCarga da caneta: " + this.carga
                + "\nA caneta está tampada?: " + this.tampada
        );

    }

    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("Erro. Não posso rabiscar com a caneta tampada.");
        } else {
            System.out.println("Estou rabiscando.");
        }
    }

    void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }
}
