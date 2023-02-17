package Relacionamento_de_classes;

public class Lutador {

    //-------------atributos-------------
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    //------------------------------------

    //metodos construtor




    public Lutador(String no, String nac, int id, float al, float pe, int vi, int de, int emp ) {

       this.setNome(no);
       this.setNacionalidade(nac);
       this.setIdade(id);
       this.setAltura(al);
       this.setPeso(pe);
       this.vitorias = vi;
       this.derrotas = de;
       this.empates = emp;
    }

    //metodos especias
    public String getNome() {

        return nome;
    }

    public void setNome(String no) {

        this.nome = no;
    }

    public String getNacionalidade() {

        return nacionalidade;
    }

    public void setNacionalidade(String nac) {

        this.nacionalidade = nac;
    }

    public int getIdade() {

        return idade;
    }

    public void setIdade(int id) {

        this.idade = id;
    }

    public float getAltura() {

        return altura;
    }

    public void setAltura(float a) {

        this.altura = a;
    }

    public float getPeso() {

        return peso;
    }

    public void setPeso(float pe) {

        this.peso = pe;
        this.setCategoria();
    }

    public String getCategoria() {

        return categoria;
    }

    private void setCategoria() {
        if (this.getPeso() < 52.2){
            this.categoria = "Invalido";
        }else if (this.getPeso() <= 70.3) {
            this.categoria = "Leve";
        }else if (this.getPeso() <= 83.9) {
            this.categoria = "Médio";
        }else if (this.getPeso() <= 120.2) {
            this.categoria = "Pesado";
        }else{
            this.categoria = "Invalido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vi) {
        this.vitorias = vi;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int de) {
        this.derrotas = de;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int emp) {
        this.empates = emp;
    }

    //metodos



    public void apresentar() {
        System.out.println();
        System.out.println("----------------UFC-----------------");
        System.out.println("Apresentando o Lutador " + getNome());
        System.out.println("Diretamente de " + getNacionalidade());
        System.out.println("Com " + getIdade() + " Anos de idade");
        System.out.println("Com " + getAltura() + " De Altura");
        System.out.println("Pesando " + getPeso() + "Kg");
        System.out.println("Com " + getVitorias() + " Vitorias");
        System.out.println(getDerrotas() + " Derrotas");
        System.out.println("E " + getEmpates() + " Empates");
        System.out.println("------------------------------------");
        System.out.println();
    }


    public void status() {
        System.out.println();
        System.out.println("----------------UFC-----------------");
        System.out.println(getNome());
        System.out.println("É um peso " + getCategoria());
        System.out.println(getVitorias() + " Vitorias");
        System.out.println(getDerrotas() + " Derrotas");
        System.out.println(getEmpates() + " Empates");
        System.out.println("Seu país de origem é " + getNacionalidade());
        System.out.println("------------------------------------");
        System.out.println();
    }


    public void ganharLuta() {
        setVitorias(getVitorias() + 1);
    }


    public void perderLuta() {
        setDerrotas(getDerrotas() + 1);
    }


    public void empatarLuta() {
        setEmpates(getEmpates() + 1);
    }
}
