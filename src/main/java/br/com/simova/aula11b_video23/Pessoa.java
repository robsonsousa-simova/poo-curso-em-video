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
}
