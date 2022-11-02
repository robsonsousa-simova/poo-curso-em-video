package br.com.simova.aula11b_video23;

public class Professor extends Pessoa {

    private String especializacao;
    private float salario;

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void receberSalario() {
        System.out.println("O Professor " + nome + " recebeu R$ " + salario + " de salário.");
    }

    @Override
    public String toString() {
        return super.toString() + "\tEspecialização: " + especializacao;
    }
}
