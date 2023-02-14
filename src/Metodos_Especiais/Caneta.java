package Metodos_Especiais;

public class Caneta {
    private String modelo = "BIC";
    private float ponta;
    private boolean tampada;
    private boolean destampada;
    private String cor;






    public Caneta(String m, String c, float p){ //este é o metodo construtor
        this.modelo = m;
        this.cor = c;
        this.setPonta(p);
        this.tampada();
    }

    private void tampada() {
        this.tampada = true;
    }


    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }

    public void Destampar(){
        this.destampada = false;
    }



    public void status(){
        System.out.println("SOBRE A CANETA: ");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " +  this.cor);
        System.out.println("Tampada: " + this.tampada);
    }


}
