package br.com.simova.aula14a_video28;

public class Resposta {

    private int numeroResposta;
    private String resposta;
    private boolean correct;
    private Pergunta pergunta;

    public Resposta(int numeroResposta, String resposta, boolean correct, Pergunta pergunta) {
        this.numeroResposta = numeroResposta;
        this.resposta = resposta;
        this.correct = correct;
        this.pergunta = pergunta;
    }

    public int getNumeroResposta() {
        return numeroResposta;
    }

    public void setNumeroResposta(int numeroResposta) {
        this.numeroResposta = numeroResposta;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    public Pergunta getPergunta() {
        return pergunta;
    }

    public void setPergunta(Pergunta pergunta) {
        this.pergunta = pergunta;
    }

    @Override
    public String toString() {
        return "Resposta Número: " + getNumeroResposta() + "\t" + getResposta();
    }

    public void exibirResposta() {

        String resposta = toString();

        System.out.println(resposta);
    }
}
