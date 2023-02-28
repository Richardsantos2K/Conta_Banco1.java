package Polimorfismo_conseito_Aula12;

public abstract class Animal { // Por ser uma classe abstrata não podemos criar objetos apartir dessa classe "Animal"

    //Atributos de animal
    protected Float peso;
    protected int idade;
    protected int membros;


    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
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


    //Métodos de animais
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();



}
