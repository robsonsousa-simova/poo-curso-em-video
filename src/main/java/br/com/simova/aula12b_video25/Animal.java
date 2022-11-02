package br.com.simova.aula12b_video25;

public abstract class Animal {

    protected float peso;
    protected int idade;
    protected int membros;

    public abstract void locomover();

    public abstract void alimentar();

    public abstract void emitirSom();

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }

    @Override
    public String toString() {
        return "Animal: " + getClass().getSimpleName() + "\t" + "{" + "Peso: " + peso + "\tIdade: " + idade + "\tMembros: " + membros + '}';
    }

    public void exibirInfoAnimal(){

        System.out.println(toString());
        locomover();
        alimentar();
        emitirSom();
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

        String classNameAndSuperClassNameAndPackageName = "Classe: " + getClassName() + "\tSuper Classe: " + getSuperClassName() + "\tPacote: " + getPackageName();
        System.out.println(classNameAndSuperClassNameAndPackageName);
    }

}
