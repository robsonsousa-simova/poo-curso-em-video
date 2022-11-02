package br.com.simova.aula11b_video23;

public class Aula11b {

    public static void main(String[] args) {

        // Objeto p1 do tipo Classe Pessoa não pode ser instanciada, pois Pessoa é uma classe abstrata.
        // Em outras palavras: Classe Abstrata não pode ser instanciada.
        // Pessoa p1 = new Pessoa();

        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("Masculino");
        System.out.println(v1);
        v1.exibirNomeDaClasseAndNomeDaSuperClasseAndNomeDoPacote();

        imprimirLinhaPontilhada();

        Aluno a1 = new Aluno();
        a1.setNome("Claúdio");
        a1.setIdade(16);
        a1.setSexo("Masculino");
        a1.setMatricula(11101);
        a1.setCurso("Informática");
        a1.fazerAniversario();
        System.out.println(a1);
        a1.pagarMensalidade();
        a1.exibirNomeDaClasseAndNomeDaSuperClasseAndNomeDoPacote();

        imprimirLinhaPontilhada();

        Bolsista b1 = new Bolsista();
        b1.setNome("Jubileu");
        b1.setIdade(32);
        b1.setSexo("Masculino");
        b1.setMatricula(22201);
        b1.setCurso("Segurança da Informação");
        b1.setBolsa(12.5f);
        System.out.println(b1);
        b1.pagarMensalidade();
        b1.exibirNomeDaClasseAndNomeDaSuperClasseAndNomeDoPacote();

        imprimirLinhaPontilhada();

        Tecnico t1 = new Tecnico();
        t1.setNome("Bob");
        t1.setIdade(54);
        t1.setSexo("Masculino");
        t1.setMatricula(22202);
        t1.setCurso("Desenvolvimento de Sistemas Multi-plataforma");
        t1.setRegistroProfissional("Programador");
        System.out.println(t1);
        t1.registrar();
        t1.exibirNomeDaClasseAndNomeDaSuperClasseAndNomeDoPacote();

        imprimirLinhaPontilhada();

        Professor p1 = new Professor();
        p1.setNome("Xavier");
        p1.setIdade(42);
        p1.setSexo("Masculino");
        p1.setEspecializacao("Telepatia");
        p1.setSalario(155500.9f);
        p1.fazerAniversario();
        System.out.println(p1);
        p1.receberSalario();
        p1.exibirNomeDaClasseAndNomeDaSuperClasseAndNomeDoPacote();

        imprimirLinhaPontilhada();

    }

    public static void imprimirLinhaPontilhada() {

        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
    }
}
