package br.com.simova.aula8b_video17;

public class UECCombate {

    public static void main(String[] args) {

        // instancia um vetor do tipo Lutador com 6 posições
        Lutador[] lutadores = new Lutador[6];

        lutadores[0] = new Lutador("Pretty Boy", "França", 31, 175, 68.9f, 11, 2, 1);
        lutadores[1] = new Lutador("Putscript", "Brasil", 29, 168, 57.8f, 14, 2, 3);
        lutadores[2] = new Lutador("Snapshadow", "EUA", 35, 165, 80.9f, 12, 2, 1);
        lutadores[3] = new Lutador("Dead Code", "Austrália", 28, 193, 81.6f, 13, 0, 2);
        lutadores[4] = new Lutador("Ufocobol", "Brasil", 37, 170, 119.3f, 5, 4, 3);
        lutadores[5] = new Lutador("Nerdaart", "EUA", 30, 181, 105.7f, 12, 2, 4);

        Luta f1 = new Luta();

        f1.isLutaAprovada(lutadores[1], lutadores[2]);

        printarLinhaPontilhada();
        lutadores[1].setPeso(80.9f);
        f1.marcarLuta(lutadores[1], lutadores[2]);
        lutadores[1].status();
        lutadores[2].status();

        printarLinhaPontilhada();
        f1.lutar();
        printarLinhaPontilhada();

        f1.apresentarLutadores();

        lutadores[1].status();
        lutadores[2].status();
    }

    public static void printarLinhaPontilhada() {

        System.out.println("------------------------------------------------");
    }
}
