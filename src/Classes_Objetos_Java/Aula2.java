package Classes_Objetos_Java;

public class Aula2 {

    public static void main(String[] args) {
            Caneta c1 = new Caneta();
            c1.cor = "Azul";
            c1.ponta = 0.5f;
            c1.modelo = "Bic";
            c1.carga = 50;
            c1.tampar();
            c1.status();
            c1.rabiscar();
            System.out.println();
            System.out.println();
            Caneta c2 = new Caneta();
            c2.modelo = "Bic";
            c2.cor = "Preta";
            c2.ponta = 0.5f;
            c2.carga = 90;
            c2.destampar();
            c2.status();
            c2.rabiscar();

        }
    }
