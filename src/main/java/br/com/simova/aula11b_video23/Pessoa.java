package br.com.simova.aula11b_video23;

public abstract class Pessoa {

    private String nome;
    private int idade;
    private String sexo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void fazerAniversario() {
        this.idade++;
    }

    @Override
    public String toString() {

        return "Nome: " + nome + "\tIdade: " + idade + "\tSexo: " + sexo;
    }

    public String getClassName() {

        return getClass().getSimpleName();
    }

    public String getSuperClassName() {

        return getClass().getSuperclass().getSimpleName();
    }

    public String getPackageName() {

        return getClass().getPackageName();
    }

    public void exibirNomeDaClasseAndNomeDaSuperClasseAndNomeDoPacote() {

        String classNameAndSuperClassNameAndPackageName = "Classe: " + getClassName() + " | Super Classe: " + getSuperClassName() + " | Pacote: " + getPackageName();
        System.out.println(classNameAndSuperClassNameAndPackageName);
    }

    public void exibirHierarquiaEntreClasses() {

        String hierarquia = "A classe " + getClassName() + " é filha da classe " + getSuperClassName() + ".";
        System.out.println(hierarquia);
    }

    public void exibirEspecializacaoDeClasse() {

        String classeEspecializada = "A classe " + getClassName() + " é uma Especialização de " + getSuperClassName() + ".";
        System.out.println(classeEspecializada);
    }

    public void exibirGeneralizacaoDeClasse() {

        String classeGeneralizada = "A classe " + getSuperClassName() + " é uma Generalização da classe " + getClassName() + ".";
        System.out.println(classeGeneralizada);
    }

    public static void exibirHierarquiaDeUmaClasseConcreta() {

        String hierarquia = "A classe " + Pessoa.class.getSimpleName() + " é filha da classe " + Pessoa.class.getSuperclass().getSimpleName() + ".";
        System.err.println(hierarquia);
    }
}
