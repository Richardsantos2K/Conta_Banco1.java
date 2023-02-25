package Exercicios_Poo;

public class Pessoa {

    //----------------------
    private String nome;
    private int idade;
    private String sexo;
    //----------------------


    public Pessoa(String nome, int idade, String sexo){

        this.nome = nome;
        this.idade = 0;
        this.sexo = sexo;

    }


    //----------------------
    public String getNome() {
        return nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int id) {
        this.idade = id;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String s) {
        this.sexo = s;
    }
    //----------------------



    //----------------------
    public void fazerAniversario(){
        this.setIdade(this.getIdade() + 1);
    }
    //----------------------


}
