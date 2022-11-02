package br.com.simova.aula10b_video21;

public class ProjetoPessoas {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Claudio");
        p4.setNome("Fabiana");

        p1.setSexo("Masculino");
        p4.setSexo("Feminino");
        p2.setIdade(18);

        p2.setCurso("Informática");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");

        // os Objetos abaixo (p1, p2, p4) não possuem os métodos: receberSalario, mudarTrabalho e cancelarMatricula
        // Portanto, estão comentados para fins de observação de conceitos de Herança
//        p1.receberSalario(550.20f);
//        p2.mudaTrabalho();
//        p4.cancelarMatricula();

        System.out.println(p1);
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
