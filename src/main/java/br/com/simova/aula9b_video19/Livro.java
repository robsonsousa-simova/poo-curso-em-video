package br.com.simova.aula9b_video19;

public class Livro implements Publicacao {

    private String titulo;
    private String autor;
    private int totalPaginas;
    private int paginaAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro() {
    }

    public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.aberto = false;
        this.paginaAtual = 0;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int pagina) {

        if (pagina >= 0 && pagina <= totalPaginas)
            this.setPaginaAtual(pagina);

        else if (pagina > this.totalPaginas)
            this.setPaginaAtual(getTotalPaginas());

        else
            this.setPaginaAtual(0);

    }

    @Override
    public void avancarPagina() {

        if (this.paginaAtual >= this.totalPaginas)
            this.setPaginaAtual(paginaAtual);
        else
            this.paginaAtual++;
    }

    @Override
    public void voltarPagina() {
        if (this.paginaAtual <= 0)
            this.setPaginaAtual(0);
        else
            this.paginaAtual--;
    }

    public String detalhes() {

        System.out.println("----------------------------------------------------------------------------------------------------------------");
        return "Título: " + titulo
                + "\nAutor: " + autor
                + "\nTotal páginas: " + totalPaginas
                + "\nPágina atual: " + paginaAtual
                + "\nAberto: " + aberto
                + "\nLeitor: " + leitor.getNome()
                + "\tIdade: " + leitor.getIdade()
                + "\tSexo: " + leitor.getSexo();
    }
}
