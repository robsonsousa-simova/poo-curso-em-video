package br.com.simova.aula10b_video21;

public class Professor extends Pessoa{

    private String especialidade;
    private float salario;

    public Professor() {
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void receberSalario(float aumentoSalario) {
        this.salario += aumentoSalario;
    }
}
