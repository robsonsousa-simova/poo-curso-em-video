package br.com.simova.aula5b_video11;

public class Aula5b {

    public static void main(String[] args) {

        // numConta, tipo, dono, saldo, status
        ContaBanco c1 = new ContaBanco();
        c1.setNumConta(1);
        c1.setDono("Alice");
        c1.abrirConta("CC");

        c1.fecharConta();
        c1.sacar(60);
        c1.depositar(10);
        c1.sacar(60);
        c1.pagarMensal();
        c1.fecharConta();

        c1.depositar(12);
        c1.fecharConta();

        c1.estadoAtual();




        ContaBanco c2 = new ContaBanco();

        c2.setNumConta(2);
        c2.setDono("Bob");
        c2.abrirConta("CP");

        c2.estadoAtual();

        c2.depositar(100);
        c2.estadoAtual();

        c2.fecharConta();

        c2.sacar(250);
        c2.pagarMensal();
        c2.fecharConta();
        c2.depositar(20);
        c2.fecharConta();

        c2.estadoAtual();

        ContaBanco c3 = new ContaBanco();
        c3.setNumConta(3);
        c3.setDono("Tio Sam");
        c3.abrirConta("CV");

        c3.estadoAtual();
    }
}
