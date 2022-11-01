package br.com.simova.aula8a_video16;

public class Lutador {

    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {

        if (peso < 52.2)
            this.categoria = "Inválido";
        else if (peso <= 70.3)
            this.categoria = "Leve";
        else if (peso <= 83.9)
            this.categoria = "Médio";
        else if (peso <= 120.2)
            this.categoria = "Pesado";
        else
            this.categoria = "Inválido";
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getTotalLutas() {

        return getVitorias() + getDerrotas() + getEmpates();
    }

    public void status() {
        System.out.println("\n" + getNome() + " é um peso " + getCategoria()
                + "\nVenceu " + getVitorias() + " lutas."
                + "\nPerdeu " + getDerrotas() + " lutas."
                + "\nEmpatou " + getEmpates() + " lutas.");
    }

    public void vencerLuta() {
        this.setVitorias(vitorias + 1);
    }

    public void perderLuta() {
        this.setDerrotas(derrotas + 1);
    }

    public void empatarLuta() {
        this.setEmpates(empates + 1);
    }
}
