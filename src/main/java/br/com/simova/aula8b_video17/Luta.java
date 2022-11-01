package br.com.simova.aula8b_video17;

import java.util.Random;

public class Luta {

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;

    private boolean lutaAprovada;

    public Luta() {

    }

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

    public boolean isLutaAprovada(Lutador desafiado, Lutador desafiante) {

        if (desafiado.getCategoria().equals(desafiante.getCategoria()) && !desafiado.equals(desafiante)) {
            System.out.println("Luta aprovada. Pois tanto desafiado(" + desafiado.getNome()
                    + "), quanto desafiante(" + desafiante.getNome() + ") estão na categoria "
                    + desafiado.getCategoria() + ".");
            this.lutaAprovada = true;
            this.setDesafiado(desafiado);
            this.setDesafiante(desafiante);
            return true;
        } else {
            System.out.println("Luta não aprovada. O desafiado ("
                    + desafiado.getNome() + ") está na categoria "
                    + desafiado.getCategoria() + " e o desafiante ("
                    + desafiante.getNome() + ") está na categoria "
                    + desafiante.getCategoria() + ".");
            this.setDesafiado(desafiado);
            this.setDesafiante(desafiante);
            this.lutaAprovada = false;

            return false;
        }
    }

    public void marcarLuta(Lutador desafiado, Lutador desafiante) {

        if (isLutaAprovada(desafiado, desafiante)) {
            apresentarLutadores();
        }
    }

    public void apresentarLutadores() {

        System.out.println("\nLadies and Gentlemen, please Welcome to Ultimate Emoji Championship!\n");
        String[] corners = {"direito", "esquerdo"};

        Lutador[] lutadores = {getDesafiado(), getDesafiante()};

        for (Lutador lutador : lutadores) {

            System.out.println("No corner " + corners[0] + "..."
                    + "com " + lutador.getIdade() + " anos"
                    + ", diretamente de " + lutador.getNacionalidade()
                    + ", com altura de " + lutador.getAltura()
                    + ", pesando " + lutador.getPeso() + " Kg. Com um total de " + lutador.getTotalLutas() + " lutas"
                    + ", sendo " + lutador.getVitorias() + " vitórias, "
                    + lutador.getDerrotas() + " derrotas e "
                    + lutador.getEmpates() + " empates. Ele o peso " + lutador.getCategoria() + ", "
                    + lutador.getNome() + "!");

            corners[0] = corners[1];
        }
    }

    public void lutar() {

        if (lutaAprovada) {

            Random gerarAleatorio = new Random();
            int vencedor = gerarAleatorio.nextInt(3);

            switch (vencedor) {

                case 0: // empate
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    System.out.println(desafiado.getNome() + " e " + desafiante.getNome() + " empataram.");
                    break;
                case 1:
                    this.desafiado.vencerLuta();
                    this.desafiante.perderLuta();
                    System.out.println(desafiado.getNome() + " venceu.");
                    break;
                case 2:
                    this.desafiado.perderLuta();
                    this.desafiante.vencerLuta();
                    System.out.println(desafiante.getNome() + " venceu.");
                    break;
            }
        }
    }
}
