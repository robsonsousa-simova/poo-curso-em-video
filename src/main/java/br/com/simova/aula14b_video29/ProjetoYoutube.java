package br.com.simova.aula14b_video29;

public class ProjetoYoutube {

    public static void main(String[] args) {

        exibirLinhaPontilhada();

        Video [] v =  new Video[3];

        v[0] = new Video("Programação Orientada a Objetos");
        v[1] = new Video("REST and RESTful API's");
        v[2] = new Video("Spring Framework for Java Professionals");

        v[0].exibirInformacoesVIdeo();

        exibirLinhaPontilhada();

        // Pessoa p1 = new Pessoa("Jubileu", 22, "Masculino");

        Gafanhoto [] g = new Gafanhoto[2];

        g[0] = new Gafanhoto("Bob", 1, "Masculino", "bob");
        g[1] = new Gafanhoto("Alice", 1, "Masculino", "alice");

        for (Gafanhoto gafanhoto: g){
            gafanhoto.exibirInformacoesPessoa();
            exibirLinhaPontilhada();
        }




    }

    public static void exibirLinhaPontilhada(){

        System.out.println("--------------------------------------------------------------------------------------------------------------------");
    }

    public static void quebrarLinha(){

        System.out.println();
    }
}
