package br.com.simova.aula7b_video15;

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

        // luta não aprovada
        Luta f1na = new Luta(lutadores[0], lutadores[2], 3);
        apresentarLutadores(f1na);

        // luta aprovada após lutador desafiado terem peso e consequentemente categoria alterados para a mesma categoria do lutador desafiante
        lutadores[0].setPeso(80);
        apresentarLutadores(f1na);

        // atribui o peso do lutador 0 para o mesmo peso que tinha anteriormente.
        lutadores[0].setPeso(68.9f);

        // luta aprovada
        Luta f1a = new Luta(lutadores[0], lutadores[1], 3);
        Luta f2a = new Luta(lutadores[2], lutadores[3], 2);
        Luta f3a = new Luta(lutadores[4], lutadores[5], 1);

        apresentarLutadores(f1a);
        apresentarLutadores(f2a);
        apresentarLutadores(f3a);

        for (int i = 0; i < lutadores.length; i++) {

            lutadores[i].status();
            if (i < 2)
                lutadores[i].vencerLuta();
            if (i >= 2 && i <= 3)
                lutadores[i].perderLuta();
            if (i > 3)
                lutadores[i].empatarLuta();
            lutadores[i].status();
        }
    }

    public static void apresentarLutadores(Luta luta) {

        if (luta.isLutaAprovada()) {
            System.out.println("\nLadies and Gentlemen, please Welcome to Ultimate Emoji Championship!\n");
            String[] corners = {"direito", "esquerdo"};
            Lutador[] lutadores = {luta.getDesafiado(), luta.getDesafiante()};

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

            System.out.println("\n");
        }
    }
}
