package Polimorfismo_conseito_Aula12;

public class reptil extends Animal{

    private String corEscama;


    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }



    @Override
    public void locomover() {

        System.out.println("Rastejando.....");

    }

    @Override
    public void alimentar() {

        System.out.println("Comendo folhas....");

    }

    @Override
    public void emitirSom() {

        System.out.println("Produzindo som....");

    }
}
