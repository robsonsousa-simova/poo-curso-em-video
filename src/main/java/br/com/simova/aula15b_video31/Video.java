package br.com.simova.aula15b_video31;

public class Video implements AcoesVideo {

    private String titulo;
    private int avalicao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avalicao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvalicao() {
        return avalicao;
    }

    public void setAvalicao(int avalicao) {
        this.avalicao = avalicao;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public void play() {
        this.reproduzindo = true;
    }

    @Override
    public void pause() {
        this.reproduzindo = false;
    }

    @Override
    public void like() {
        this.curtidas++;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + "\t|\tAvalicao: " + avalicao + "\t|\tViews: " + views + "\t|\tCurtidas: " + curtidas + "\t|\tReproduzindo: " + reproduzindo;
    }

    public void exibirInformacoesVIdeo(){

        String informacoes = toString();

        System.out.println(informacoes);
    }
}
