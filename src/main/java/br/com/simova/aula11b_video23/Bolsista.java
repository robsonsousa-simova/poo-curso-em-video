package br.com.simova.aula11b_video23;

public class Bolsista extends Aluno {

    private float bolsa;

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    public void renovarBolsa() {
        System.out.println("Renovando bolsa de " + getNome());
    }

    @Override
    public void pagarMensalidade() {

        System.out.println(getNome() + " é bolsita. Pagamento facilitado.");
    }

    @Override
    public String toString() {
        return super.toString() + "\tBolsa:" + bolsa;
    }
}
