package br.com.simova.aula15b_video31;

public class ProjetoYoutube {

    public static void main(String[] args) {

        exibirLinhaPontilhada();

        Video[] v = new Video[3];

        v[0] = new Video("Programação Orientada a Objetos");
        v[1] = new Video("REST and RESTful API's");
        v[2] = new Video("Spring Framework for Java Professionals");

        for (Video video : v) {
            video.exibirInformacoesVIdeo();
        }

        exibirLinhaPontilhada();

        Gafanhoto[] g = new Gafanhoto[2];

        g[0] = new Gafanhoto("Bob", 42, "Masculino", "bob");
        g[1] = new Gafanhoto("Alice", 22, "Feminino", "alice");

        g[0].ganharExperiencia();
        g[0].ganharExperiencia();

        for (Gafanhoto gafanhoto : g) {
            // gafanhoto.assistirMaisUmVideo();
            gafanhoto.ganharExperiencia();
            gafanhoto.exibirGafanhoto();


        }

        exibirLinhaPontilhada();

        Visualizacao[] vis = new Visualizacao[3];

        vis[0] = new Visualizacao(g[0], v[0]);
        vis[1] = new Visualizacao(g[1], v[1]);
        vis[2] = new Visualizacao(g[1], v[2]);

        // List<Visualizacao> visualizacaos = Arrays.asList(v1, v2, v3);

        for (Visualizacao visualizacao : vis) {

            visualizacao.exibirVisualizacao();
        }

        exibirLinhaPontilhada();
    }

    public static void exibirLinhaPontilhada() {

        System.out.println("--------------------------------------------------------------------------------------------------------------------");
    }

    public static void quebrarLinha() {

        System.out.println();
    }
}
