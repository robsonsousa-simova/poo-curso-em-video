package br.com.simova.aula11b_video23;

public class Tecnico extends Aluno {

    private String registroProfissional;

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    public void registrar() {

        System.out.println("O aluno " + getNome() + " possuio o seguinte Registro Profissional: " + registroProfissional);
    }

    @Override
    public String toString() {

        return super.toString() + "\tRegistro: " + registroProfissional;
    }
}
