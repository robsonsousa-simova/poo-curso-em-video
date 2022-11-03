package br.com.simova.aula14a_video28;

public class Assercao {

    private int numeroPergunta;
    private Resposta resposta;

    private boolean certa;

    public Assercao(int numeroPergunta, boolean certa) {
        this.numeroPergunta = numeroPergunta;
        this.certa = certa;
    }

    public int getNumeroPergunta() {
        return numeroPergunta;
    }

    public void setNumeroPergunta(int numeroPergunta) {
        this.numeroPergunta = numeroPergunta;
    }

    public Resposta getResposta() {
        return resposta;
    }

    public void setResposta(Resposta resposta) {
        this.resposta = resposta;
    }

    public boolean isCerta() {
        return certa;
    }

    public void setCerta(boolean certa) {
        this.certa = certa;
    }
}
