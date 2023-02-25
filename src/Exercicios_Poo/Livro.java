package Exercicios_Poo;

public class Livro implements Publicacao {

    //----------------------
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    //----------------------


    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor ){
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
    }


    //----------------------
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String ti) {
        this.titulo = ti;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String aut) {
        this.autor = aut;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int tpag) {
        this.totPaginas = tpag;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int apag) {
        this.pagAtual = apag;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean ab) {
        this.aberto = ab;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa let) {
        this.leitor = let;
    }
    //----------------------




    //----------------------

    public String detalhes() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                "\n, autor='" + autor + '\'' +
                "\n, totPaginas=" + totPaginas +
                "\n, pagAtual=" + pagAtual +
                "\n, aberto=" + aberto +
                "\n, leitor=" + leitor.getNome() +
                "\n, idade=" + leitor.getIdade() +
                "\n, sexo=" + leitor.getSexo() +
                '}';
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int p) {
        if (p > this.totPaginas){
            this.pagAtual = 0;
        }

        this.pagAtual = p;
    }

    @Override
    public void avancarPag() {
        this.setPagAtual(getPagAtual() + 1);
    }

    @Override
    public void voltarPag() {
        this.setPagAtual(getPagAtual() - 1);
    }

    //--------------------
}
