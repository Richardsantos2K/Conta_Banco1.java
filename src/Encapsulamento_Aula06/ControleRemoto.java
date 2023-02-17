package Encapsulamento_Aula06;

public class ControleRemoto implements Controlador {

    //-----------atributos-------------
    private int volume;
    private boolean ligado;
    private boolean tocando;
    //----------------------------------




    //--------metodo construtor---------
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = true;
        this.tocando = false;
    }
    //----------------------------------




    //---------metodos especiais--------
    private int getVolume() {
        return volume;
    }

    private void setVolume(int v) {

        this.volume = v;
    }

    private boolean getLigado() {

        return ligado;
    }

    private void setLigado(boolean l) {

        this.ligado = l;
    }

    private boolean getTocando() {

        return tocando;
    }

    private void setTocando(boolean t) {

        this.tocando = t;
    }



    //----------------------------------




    //---------Metodos abstratos---------
    @Override
    public void ligar() {
        if (this.getLigado())
            this.setLigado(true);
            System.out.println("Ligando TV");
    }


    @Override
    public void desligar() {
        this.setLigado(false);
        System.out.println("Desligando TV");
    }

    @Override
    public void abrirMenu() {
        System.out.println("-------- MENU --------");
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.print("Volume: " + this.getVolume());

        for (int i=0; i <= this.getVolume(); i+=10){

            System.out.print("█");
        }

    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() + 5);
        } else {
            System.out.println();
            System.out.println("Impossivel aumentar o volume");
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() - 5);
        } else {
            System.out.println();
            System.out.println("Impossivel diminuir o volume");
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() && this.getVolume() > 0){
            setVolume(0);
            System.out.println("Mudo...");
        }

    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume() ==  0){

            setVolume(50);
            System.out.println("Mudo desligado...");
        }

    }

    @Override
    public void play() {
        if(this.getLigado() && !this.getTocando()){
            setTocando(true);
            System.out.println("Programa iniciado....");
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()){
            setTocando(false);
            System.out.println("Programa pausado");
        }
    }
    //----------------------------------





}


