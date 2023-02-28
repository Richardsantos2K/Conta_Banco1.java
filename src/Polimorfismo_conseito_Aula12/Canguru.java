package Polimorfismo_conseito_Aula12;

public class Canguru extends mamifero {

    public void usarBolsa(){
        System.out.println("Usando bolsa.....");
    }

    @Override
    public void locomover() {
        System.out.println("Saltando.....");
    }
}
