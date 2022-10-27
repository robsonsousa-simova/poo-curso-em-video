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

    void status() {
        System.out.println("Modelo da caneta: " + this.modelo);
        System.out.println("Cor da caneta: " + this.cor);
        System.out.println("Ponta da caneta: " + this.ponta);
        System.out.println("A caneta está tampada? " + this.tampada);
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
