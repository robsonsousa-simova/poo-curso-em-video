package br.com.simova.aula14a_video28;

import java.util.ArrayList;
import java.util.List;

public class Pergunta {

    private int numero;
    private String enunciado;

    private List<Resposta> respostas = new ArrayList<>();

    public Pergunta() {
    }

    public Pergunta(int numero, String enunciado) {
        this.numero = numero;
        this.enunciado = enunciado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    @Override
    public String toString() {
        return "Pergunta: " + getNumero() + "\nEnunciado: " + getEnunciado();
    }

    public void exibirPergunta(){

        String informacao = toString();

        System.out.println(informacao);
    }
}
