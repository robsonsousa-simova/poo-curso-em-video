package br.com.simova.aula8a_video16;

public class Luta {

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;

    public Luta(Lutador desafiado, Lutador desafiante, int rounds) {
        this.desafiado = desafiado;
        this.desafiante = desafiante;
        this.rounds = rounds;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isLutaAprovada() {

        if (desafiado.getCategoria().equals(desafiante.getCategoria())) {
            System.out.println("Luta aprovada. Pois tanto desafiado(" + desafiado.getNome()
                    + "), quanto desafiante(" + desafiante.getNome() + ") estão na categoria "
                    + desafiado.getCategoria() + ".");
            return true;
        } else {
            System.out.println("Luta não aprovada. O desafiado ("
                    + desafiado.getNome() + ") está na categoria "
                    + desafiado.getCategoria() + " e o desafiante ("
                    + desafiante.getNome() + ") está na categoria "
                    + desafiante.getCategoria() + ".");
        }

        return false;
    }
}
