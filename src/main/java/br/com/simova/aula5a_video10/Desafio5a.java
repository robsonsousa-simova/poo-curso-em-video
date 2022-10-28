package br.com.simova.aula5a_video10;

public class Desafio5a {

    public static void main(String[] args) {

        // Instancia 1 objeto do Tipo ContaBanco (Objeto c1)
        ContaBanco c1 = new ContaBanco(1, "CC", "Alice");

        // Instancia 1 objeto do Tipo ContaBanco (Objeto c2)
        ContaBanco c2 = new ContaBanco(2, "CP", "Bob");

        // Instancia 1 objeto do Tipo ContaBanco (Objeto c3)
        ContaBanco c3 = new ContaBanco(3, "CP", "Aegon");

        // Nas linhas 17 e 18, os objetos c1, c2 do tipo ContaBanco invocam o método abrir conta
        c1.abrirConta();
        c2.abrirConta();

        // Nas linhas 21, 22 e 23, cada objeto invoca os métodos getNumeroConta e getStatus
        System.out.println("Conta " + c1.getNumeroConta() + " aberta: " + c1.getStatus());
        System.out.println("Conta " + c2.getNumeroConta() + " aberta: " + c2.getStatus());
        System.out.println("Conta " + c3.getNumeroConta() + " aberta: " + c3.getStatus());

        pularLinha(); // invocação do método pular linha apenas para exibir uma linha em branco entre cada linha de output

        // Exemplo 1:  objeto tipo ContaBanco c1 ao invocar o método sacar (4x)
        c1.sacar(0.0);
        c1.sacar(-50.01);
        c1.sacar(50.01);
        c1.sacar(50);

        pularLinha();

        // Na linha 36 o objeto c1 do tipo ContaBanco invoca o método exibirInformacoesConta
        c1.exibirInformacoesConta();

        pularLinha();

        // Na linha 41 o objeto c1 do tipo ContaBanco invoca o método exibirInformacoesConta
        c2.exibirInformacoesConta();

        pularLinha();

        // Exemplo 1:  objeto tipo ContaBanco c2 ao invocar o método depositar (3x)
        c2.depositar(0.0);
        c2.depositar(-100.0);
        c2.depositar(100.0);

        pularLinha();

        c2.exibirInformacoesConta();

        pularLinha();

        // Na linha 57 o objeto c2 do Tipo ContaBanco invoca o método pagarMensalidade
        c2.pagarMensalidade();

        c1.pagarMensalidade();
        c1.exibirTipoAndSaldoConta();
        c2.exibirTipoAndSaldoConta();

        pularLinha();

        c1.fecharConta(); // invoca o método fecharConta, mas não fecha (saldo negativo)
        c2.fecharConta(); // invoca o método fecharConta

        c1.depositar(12);

        // Nas linhas 71 e 72 as instâncias c1 e c3 invocam o método fecharConta
        c1.fecharConta();
        c3.fecharConta();

    }

    // método estático para apenas para exibir uma linha em branco entre cada linha de output
    // Obs.: métodos estáticos pertencem a classe e não as instâncias dessa classe.
    public static void pularLinha() {

        System.out.println();
    }
}
