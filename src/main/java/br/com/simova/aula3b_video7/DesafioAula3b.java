package br.com.simova.aula3b_video7;

import java.util.Date;

public class DesafioAula3b {

    private String nomeDesafio;
    private String desafiante;
    private Date dataDoDesafio;
    private Caneta canetaUtilizada;
    private boolean isDesafioComplete;

    public DesafioAula3b(String nomeDesafio, String desafiante, Date dataDoDesafio, boolean isDesafioComplete) {
        this.nomeDesafio = nomeDesafio;
        this.desafiante = desafiante;
        this.dataDoDesafio = dataDoDesafio;
        this.isDesafioComplete = isDesafioComplete;
    }
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
    public Caneta getCanetaUtilizada() {
        return canetaUtilizada;
    }

    public void setCanetaUtilizada(Caneta canetaUtilizada) {
        this.canetaUtilizada = canetaUtilizada;
    }

    public boolean isDesafioComplete() {
        return isDesafioComplete;
    }

    public void setDesafioComplete(boolean desafioComplete) {
        isDesafioComplete = desafioComplete;
    }

    @Override
    public String toString() {

        return
                "Desafio: " + getNomeDesafio()
                        + "\nNome: " + getDesafiante()
                        + "\nData desafio: " + getDataDoDesafio()
                        + "\nDesafio concluído: " + isDesafioComplete()
                        + "\nModelo caneta utilizada: " + getCanetaUtilizada().getModelo();
    }
}
