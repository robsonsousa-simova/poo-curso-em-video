package br.com.simova.aula6b_video13;

public class ControleRemoto implements Controlador {

    private int volume;

    private int ultimoVolume;
    private boolean ligado;
    private boolean tocando;

    private boolean mutado;

    public ControleRemoto() {
        this.volume = 0;
        this.ligado = false;
        this.tocando = false;
        this.mutado = true;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getUltimoVolume() {
        return ultimoVolume;
    }

    public void setUltimoVolume(int ultimoVolume) {
        this.ultimoVolume = ultimoVolume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    public boolean isMutado() {
        return !isLigado() || getVolume() == 0;
    }

    public void setMutado(boolean mutado) {
        this.mutado = mutado;
    }

    @Override
    public void ligar() {
        this.ligado = true;
    }

    @Override
    public void desligar() {

        if (isLigado()){
            pause();
            this.ligado = false;
            this.mutado = true;
            this.ultimoVolume = volume;
            this.volume = 0;
        }else {
            System.out.println("Já está desligado.");
        }
    }

    @Override
    public void abrirMenu() {

        System.out.println("\n------------------------------MENU------------------------------\n"
                + "Está ligado?:  " + this.isLigado()
                + "\nEstá tocando?:  " + this.isTocando()
                + "\nEstá mutado?:  " + this.isMutado()
                + "\nVolume:  " + this.getVolume()
                + "\nUltimo volume:  " + this.getUltimoVolume());

        for (int i = 1; i <= this.getVolume(); i += 10) {
            System.out.print(" * ");
        }

        // System.out.println("\n----------------------------------------------------------------");
    }

    @Override
    public void fecharMenu() {

        System.out.println("\nFechando menu...");
    }

    @Override
    public void aumentarVolume() {

        if (isLigado() && volume < 100) {
            this.ultimoVolume = volume;
            this.volume = (volume + 5);
        } else {
            System.out.println("Não é possível aumentar o volume se o aparelho estiver desligado.");
        }
    }

    @Override
    public void diminuirVolume() {

        if (isLigado() && volume > 0) {
            this.ultimoVolume = volume;
            this.volume = (volume - 5);
        } else {
            System.out.println("Não é possível diminuir o volume se o aparelho estiver desligado.");
        }
    }

    @Override
    public void ativarMudo() {

        if (isLigado() && getVolume() > 0) {
            this.ultimoVolume = volume;
            this.volume = 0;
        } else {
            System.out.println("Não é possível ativar o mudo se o aparelho estiver desligado.");
        }
    }

    @Override
    public void desativarMudo() {

        if (isLigado() && getVolume() == 0) {
            this.volume = getUltimoVolume();
            this.ultimoVolume = volume;
        } else {
            System.out.println("Não é possível desativar o mudo se o aparelho estiver desligado.");
        }
    }

    @Override
    public void play() {
        if (isLigado() && !isTocando()) {
            this.tocando = true;
            this.volume = 50;
        } else {
            System.out.println("Não é possível tocar se o aparelho estiver desligado.");
        }
    }

    @Override
    public void pause() {
        if (isLigado() && isTocando()) {
            this.tocando = false;
            ativarMudo();
        } else {
            System.out.println("Não é possível pausar se o aparelho estiver desligado.");
        }
    }
}
