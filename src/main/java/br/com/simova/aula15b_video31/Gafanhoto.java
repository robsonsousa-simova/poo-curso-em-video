package br.com.simova.aula15b_video31;

public class Gafanhoto extends Pessoa{

    private String login;
    private int totalAssistido;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totalAssistido = 0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotalAssistido() {
        return totalAssistido;
    }

    public void setTotalAssistido(int totalAssistido) {
        this.totalAssistido = totalAssistido;
    }

    public void assistirMaisUmVideo(){

        this.totalAssistido++;
    }

    @Override
    public String toString() {
        return "Login: " + login + "\t|\tTotal Assistido: " + totalAssistido
                + "\t|\tNome: " + nome
                + "\t|\tIdade: " + idade
                + "\t|\tSexo: " + sexo
                + "\t|\tExperiencia: " + experiencia;
    }



    public void exibirGafanhoto(){

        String gafanhoto = toString();

        System.out.println(gafanhoto);
    }
}
