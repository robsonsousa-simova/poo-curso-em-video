package br.com.simova.aula9b_video19;

public class ProjetoLivro {

    public static void main(String[] args) {

        Pessoa[] pessoas = new Pessoa[2];
        Livro[] livros = new Livro[3];

        pessoas[0] = new Pessoa("Robson", 43, "Masculino");
        pessoas[1] = new Pessoa("Juliana", 29, "Feminino");

        // public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor)
        livros[0] = new Livro("Java: Como Programar 10° Edição", "Deitel", 934, pessoas[0]);
        livros[1] = new Livro("MySQL: Guia do Programador", "André Milani", 397, pessoas[0]);
        livros[2] = new Livro("O Nome do Vento", "Patrick Rothfuss", 651, pessoas[1]);

        for (Livro livro : livros) {
            livro.abrir();
            exibirDetalhesLivro(livro);
            livro.folhear(50);
            exibirDetalhesLivro(livro);
            livro.avancarPagina();
            exibirDetalhesLivro(livro);
            livro.voltarPagina();
            exibirDetalhesLivro(livro);
            livro.fechar();
            exibirDetalhesLivro(livro);
        }
    }

    public static void exibirDetalhesLivro(Livro livro) {

        System.out.println(livro.detalhes());
    }
}
