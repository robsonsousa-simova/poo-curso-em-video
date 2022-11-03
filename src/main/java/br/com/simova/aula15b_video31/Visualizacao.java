package br.com.simova.aula15b_video31;

public class Visualizacao {

    private Gafanhoto espectador;
    private Video filme;

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotalAssistido(this.espectador.getTotalAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    public Gafanhoto getespectador() {
        return espectador;
    }

    public void setespectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    public void avaliar(){

    }

    public void avaliar(int nota){


    }

    public void avaliar(float porcentagem){


    }

    @Override
    public String toString() {
        return "Espectador:" + espectador + "\t|\tFilme: " + filme;
    }

    public void exibirVisualizacao(){

        String visualizacao = toString();

        System.out.println(visualizacao);
    }
}
