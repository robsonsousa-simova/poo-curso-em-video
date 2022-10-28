package br.com.simova.aula4b_video9;

public class Caneta {

    private String modelo;
    private String cor;
    private float ponta;
    private boolean tampada;

    public Caneta(String modelo, String cor, float ponta){
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.setTampada(true);

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public void status(){
        System.out.println("Exibi informações sobre a caneta."
                + "\nModelo: " + this.getModelo()
                + "\nCor: " + this.getCor()
                + "\nPonta: " + this.getPonta()
                + "\nTampada: " + this.isTampada());
    }
}
