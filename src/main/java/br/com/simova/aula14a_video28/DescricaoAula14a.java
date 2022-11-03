package br.com.simova.aula14a_video28;

public class DescricaoAula14a {

    private String informacao = "Quis de perguntas e respostas baseados na apresentação da Aula 14-A do Curso Programação Orientada a Objetos";
    private String instrutor = "Intrutor: Gustavo Guanabara";
    private String linkVideo = "Link do Vídeo: https://www.youtube.com/watch?v=SgubvKWfHKo&list=PLHz_AreHm4dkqe2aR0tQK74m8SFe-aGsY&index=28";
    private String autor = "Robson Sousa";

    public String getInformacao() {
        return informacao;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public String getLinkVideo() {
        return linkVideo;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Informação: " + getInformacao() + "\nInstrutor: " + getInstrutor() + "\nLink: " + getLinkVideo() + "\nAutor: " + getAutor();
    }

    public void exibirDescricao(){

        System.out.println(this);
    }
}
