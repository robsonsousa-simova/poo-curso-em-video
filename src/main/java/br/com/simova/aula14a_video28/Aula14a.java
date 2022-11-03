package br.com.simova.aula14a_video28;

import java.util.Arrays;
import java.util.List;

public class Aula14a {

    public static void main(String[] args) {

        exibirLinhaPontilhada();
        DescricaoAula14a descricaoAula14a = new DescricaoAula14a();
        descricaoAula14a.exibirDescricao();
        exibirLinhaPontilhada();

        Pergunta p1 = new Pergunta(1, "Segundo Deitel (2010) com relação à Linguagem de Programação JAVA, é correto afirmar que:");

        p1.exibirPergunta();
        exibirLinhaPontilhada();

        Pergunta p2 = new Pergunta();

        Resposta r1 = new Resposta(1, "Um construtor pode ter um nome diferente de sua classe", false, p1);
        Resposta r2 = new Resposta(2, "O compilador fornece um construtor padrão sem parâmetros em qualquer classe que não inclui explicitamente um construtor", true, p1);
        Resposta r3 = new Resposta(3, "Se uma classe não incluir um construtor, as variáveis de instância não são inicializadas", false, p1);
        Resposta r4 = new Resposta(4, "Não existe o conceito de construtor na Linguagem JAVA", false, p1);

        List<Resposta> respostas = Arrays.asList(r1, r2, r3, r4);


    }

    public static void exibirLinhaPontilhada(){

        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
    }
}
