package br.com.simova.aula13b_video17;

public abstract class Animal {

    protected float peso;
    protected int idade;
    protected int membros;

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }

    public abstract void emitirSom();

    public static void exibirInformacoes(){

        System.err.println("Sou um método estático de uma classe abstrata que não pode ser instanciada. Mas ainda posso ser chamado.");
    }
}
