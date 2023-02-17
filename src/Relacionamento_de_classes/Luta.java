package Relacionamento_de_classes;

import java.util.Random;

public class Luta {

    //atributos


    //-----tipo abstrato de dados--------
    private Lutador desafiado; //colocamos o "desafiado" e "desafiante" para ser uma instancia da classe Lutador, ou, Objeto de Lutador
    private Lutador desafiante;
    private int rounds;
    private Boolean aprovada;
    //-----------------------------------



    //---------metodos especiais---------
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador dd) {
        this.desafiado = dd;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador df) {
        this.desafiante = df;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int ro) {
        this.rounds = ro;
    }

    public Boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(Boolean ap) {
        this.aprovada = ap;
    }
    //-----------------------------------



    //--------metodos abstratos----------

    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && (l1 != l2)){
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);


        } else {
            setAprovada(false);
            setDesafiado(null);
            setDesafiante(null);
            
        }


    }


    public void lutar() {
        if(getAprovada()){
            System.out.println("-----------------DESAFIADO-----------------");
            this.desafiado.apresentar();
            System.out.println("-----------------DESAFIANTE-----------------");
            this.desafiante.apresentar();
            Random aleatorio = new Random();// metodo aleatorio do java
            int vencedor = aleatorio.nextInt(3); //o programa ira escolher em numeros de 0, 1 ou 2
            switch (vencedor){
                case 0:
                    System.out.println("EMPATOU!!!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println("E O VENCEDOR É: " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println("E O VENCEDOR É: " + this.desafiante.getNome());
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
        }else{
            System.out.println("Luta não pode acontecer");
        }
    }
    //-----------------------------------

}
