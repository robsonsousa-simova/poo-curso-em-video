package br.com.simova.aula3b_video7;

public class Caneta {

    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

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

    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("Erro. Não posso rabiscar com a caneta tampada.");
        } else {
            System.out.println("Estou rabiscando.");
        }
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }
}
