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
        quebrarLinha();

        Resposta r1P1 = new Resposta(1, "Um construtor pode ter um nome diferente de sua classe", false, p1);
        Resposta r2P1 = new Resposta(2, "O compilador fornece um construtor padrão sem parâmetros em qualquer classe que não inclui explicitamente um construtor", true, p1);
        Resposta r3P1 = new Resposta(3, "Se uma classe não incluir um construtor, as variáveis de instância não são inicializadas", false, p1);
        Resposta r4P1 = new Resposta(4, "Não existe o conceito de construtor na Linguagem JAVA", false, p1);
        List<Resposta> respostasP1 = Arrays.asList(r1P1, r2P1, r3P1, r4P1);
        for (Resposta resposta : respostasP1)
            resposta.exibirResposta();

        exibirLinhaPontilhada();

        Pergunta p2 = new Pergunta(2, "Uma das formas de reutilização de software é a criação de uma classe que absorve membros de outra classe já existente." +
                " A nova classe é aprimorada com capacidades novas ou modificadas.");
        p2.exibirPergunta();
        quebrarLinha();

        Resposta r1P2 = new Resposta(1, "Recursão", false, p2);
        Resposta r2P2 = new Resposta(2, "Herança", true, p2);
        Resposta r3P2 = new Resposta(3, "Orientação a Aspectos", false, p2);
        Resposta r4P2 = new Resposta(4, "Chamada por Parâmetros", false, p2);
        List<Resposta> respostasP2 = Arrays.asList(r1P2, r2P2, r3P2, r4P2);
        for (Resposta resposta : respostasP2) {
            resposta.exibirResposta();
        }

        exibirLinhaPontilhada();

        Pergunta p3 = new Pergunta(3, "Observe o diagrama a seguir e assinale a alternativa correta, no que diz respeito à classe DecimalFormat");
        p3.exibirPergunta();
        quebrarLinha();

        Resposta r1P3 = new Resposta(1, "Qualquer classe dada será ascendendo de Format", false, p3);
        Resposta r2P3 = new Resposta(2, "DecimalFormat é descendente de Format", true, p3);
        Resposta r3P3 = new Resposta(3, "DecimalFormat é ancestral de Format", false, p3);
        Resposta r4P3 = new Resposta(4, "ChoiceFormat é filha de DecimalFormat", false, p3);
        List<Resposta> respostasP3 = Arrays.asList(r1P3, r2P3, r3P3, r4P3);
        for (Resposta resposta : respostasP3) {
            resposta.exibirResposta();
        }

        exibirLinhaPontilhada();

        Pergunta p4 = new Pergunta(4, "Segundo Deitel (2010), fornecer uma super classe apropriada a partir da qual outras classes podem herdader " +
                " e assim compartilhar um design comum é o propósito de: ");
        p4.exibirPergunta();
        quebrarLinha();

        Resposta r1P4 = new Resposta(1, "Um Objeto", false, p4);
        Resposta r2P4 = new Resposta(2, "Uma Subclasse", false, p4);
        Resposta r3P4 = new Resposta(3, "Uma Classe Abstrata", true, p4);
        Resposta r4P4 = new Resposta(4, "Um Construtor", false, p4);
        List<Resposta> respostasP4 = Arrays.asList(r1P4, r2P4, r3P4, r4P4);
        for (Resposta resposta : respostasP4) {
            resposta.exibirResposta();
        }

        exibirLinhaPontilhada();

        Pergunta p5 = new Pergunta(5, "Entende-se por método abstrato um método que: ");
        p5.exibirPergunta();
        quebrarLinha();

        Resposta r1P5 = new Resposta(1, "Declarado, mas não implementado", true, p5);
        Resposta r2P5 = new Resposta(2, "Declarado e implementado", false, p5);
        Resposta r3P5 = new Resposta(3, "Não declarado, mas implementado", false, p5);
        Resposta r4P5 = new Resposta(4, "Não declarado e não implementado", false, p5);
        List<Resposta> respostasP5 = Arrays.asList(r1P5, r2P5, r3P5, r4P5);
        for (Resposta resposta : respostasP5) {
            resposta.exibirResposta();
        }

        exibirLinhaPontilhada();

        Pergunta p6 = new Pergunta(6, "Informe se é falso ou verdadeiro o que se afirma sobre o conceito de Herança da POO: ");
        p6.exibirPergunta();
        quebrarLinha();

        Resposta r1P6 = new Resposta(1, "A herança permite basear uma nova classe na definição de outra classe", true, p6);
        Resposta r2P6 = new Resposta(2, "Não se pode sobrepor um comportamento de uma superclasse em uma subclasse", false, p6);
        Resposta r3P6 = new Resposta(3, "Com mecanismo de herança é possível estabelecer relacionamentos 'é um' entre classes", true, p6);
        // Resposta r4P6 = new Resposta(4, "", false, p6);
        List<Resposta> respostasP6 = Arrays.asList(r1P6, r2P6, r3P6);
        for (Resposta resposta : respostasP6) {
            resposta.exibirResposta();
        }

        exibirLinhaPontilhada();

        Pergunta p7 = new Pergunta(7, "Ao programar em PHP Orientado a Objetos e declarar uma classe com a palavra-chave final, conforme o código abaixo, pode-se afirmar que: ");
        p7.exibirPergunta();
        quebrarLinha();

        Resposta r1P7 = new Resposta(1, "As subclasses de ClasseA não herdarão seus métodos", false, p7);
        Resposta r2P7 = new Resposta(2, "A ClasseA não poderá ser instanciada", false, p7);
        Resposta r3P7 = new Resposta(3, "A ClasseA não poderá ter subclasses", true, p7);
        Resposta r4P7 = new Resposta(4, "A ClasseA não poderá ter métodos", false, p7);
        List<Resposta> respostasP7 = Arrays.asList(r1P7, r2P7, r3P7, r4P7);
        for (Resposta resposta : respostasP7) {
            resposta.exibirResposta();
        }

        exibirLinhaPontilhada();

        Pergunta p8 = new Pergunta(8, "Em relação à Programação Orientada a Objetos, assinale a opção correta: ");
        p8.exibirPergunta();
        quebrarLinha();

        Resposta r1P8 = new Resposta(1, "Os membros private de uma superclasse são herdados pelas suas subclasses", false, p8);
        Resposta r2P8 = new Resposta(2, "Um método public da superclasse pode tornar-se um método protected ou private na subclasse", false, p8);
        Resposta r3P8 = new Resposta(3, "Um método protected da superclasse pode tornar-se um método private da subclasse", false, p8);
        Resposta r4P8 = new Resposta(4, "Utilizar acesso protected oferece um nível intermediário entre public e private", true, p8);
        List<Resposta> respostasP8 = Arrays.asList(r1P8, r2P8, r3P8, r4P8);
        for (Resposta resposta : respostasP8) {
            resposta.exibirResposta();
        }

        exibirLinhaPontilhada();

        Pergunta p9 = new Pergunta(9, "Marque a alternativa que completa corretamente a lacuna: \nAo programar em PHP utilizando-se o paradigma de Orientação a Objeto, " +
                " utiliza-se o símbolo _____________ para poder acessar as funções definidas em uma classe");
        p9.exibirPergunta();
        quebrarLinha();

        Resposta r1P9 = new Resposta(1, ".", false, p9);
        Resposta r2P9 = new Resposta(2, ">", false, p9);
        Resposta r3P9 = new Resposta(3, "=>", false, p9);
        Resposta r4P9 = new Resposta(4, "->", true, p9);
        List<Resposta> respostasP9 = Arrays.asList(r1P9, r2P9, r3P9, r4P9);
        for (Resposta resposta : respostasP9) {
            resposta.exibirResposta();
        }

        exibirLinhaPontilhada();

        Pergunta p10 = new Pergunta(10, "Segundo Deitel (2010), em Programação Orientado à Objetos, o conceito que permite escrever programas que processam objetos que compartilham " +
                " a mesma superclasse (direta e indiretamente) como se todos fossem objetos dessa superclasse é conhecido como: ");
        p10.exibirPergunta();
        quebrarLinha();

        Resposta r1P10 = new Resposta(1, "Associação", false, p10);
        Resposta r2P10 = new Resposta(2, "Polimorfismo", true, p10);
        Resposta r3P10 = new Resposta(3, "Atributo", false, p10);
        Resposta r4P10 = new Resposta(4, "Encapsulamento", false, p10);
        List<Resposta> respostasP10 = Arrays.asList(r1P10, r2P10, r3P10, r4P10);
        for (Resposta resposta : respostasP10) {
            resposta.exibirResposta();
        }

        exibirLinhaPontilhada();

    }

    public static void exibirLinhaPontilhada() {

        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
    }

    public static void quebrarLinha() {

        System.out.println("");
    }
}
