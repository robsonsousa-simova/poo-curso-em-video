package br.com.simova.aula2b_video4;

import java.util.Date;

public class DesafioAula2b {

    public DesafioAula2b(String nomeDesafio, String desafiante, Date dataDoDesafio, boolean desafioIsComplete) {
        this.nomeDesafio = nomeDesafio;
        this.desafiante = desafiante;
        this.dataDoDesafio = dataDoDesafio;
        this.desafioIsComplete = desafioIsComplete;
    }

    private String nomeDesafio;
    private String desafiante;
    private Date dataDoDesafio;

    private Caneta canetaUtilizada;

    private boolean desafioIsComplete;

    public String getNomeDesafio() {
        return nomeDesafio;
    }

    public void setNomeDesafio(String nomeDesafio) {
        this.nomeDesafio = nomeDesafio;
    }

    public String getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(String desafiante) {
        this.desafiante = desafiante;
    }

    public Date getDataDoDesafio() {
        return dataDoDesafio;
    }

    public void setDataDoDesafio(Date dataDoDesafio) {
        this.dataDoDesafio = dataDoDesafio;
    }

    public boolean isDesafioIsComplete() {
        return desafioIsComplete;
    }

    public void setDesafioIsComplete(boolean desafioIsComplete) {
        this.desafioIsComplete = desafioIsComplete;
    }

    public Caneta getCanetaUtilizada() {
        return canetaUtilizada;
    }

    public void setCanetaUtilizada(Caneta canetaUtilizada) {
        this.canetaUtilizada = canetaUtilizada;
    }

    @Override
    public String toString() {

        return
                "Desafio: " + nomeDesafio
                        + "\nNome: " + desafiante
                        + "\nData desafio: " + dataDoDesafio
                        + "\nStatus do desafio: " + desafioIsComplete
                        + "\nModelo caneta utilizada: " + canetaUtilizada.getModelo();
    }
}
