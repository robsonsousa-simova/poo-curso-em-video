package br.com.simova.aula11b_video23;

public class Aluno extends Pessoa {

    private int matricula;
    private String curso;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void pagarMensalidade() {
        System.out.println("Pagando mensalidade de aluno " + this.nome);
    }

    @Override
    public String toString() {
        return super.toString() + "\tMatrícula: " + matricula + "\tCurso: " + curso;
    }
}
