package br.com.simova.aula11b_video23;

public abstract class Pessoa {

    protected String nome;
    private int idade;
    private String sexo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void fazerAniversario() {
        this.idade++;
    }

    @Override
    public String toString() {

        return "Nome: " + nome + "\tIdade: " + idade + "\tSexo: " + sexo;
    }
}
