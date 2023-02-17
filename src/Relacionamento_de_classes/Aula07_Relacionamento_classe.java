package Relacionamento_de_classes;

public class Aula07_Relacionamento_classe {
    public static void main(String [] args){

        //Usamos o exemplo de vetor para simplificar a criação de novos objetos


        Lutador l[] = new Lutador[6];

               l[0] = new Lutador ("Islam Makhachev", "Russia", 31, 1.79f, 70.3f, 24, 1, 0);
               l[1] = new Lutador("Charles do Bronx", "Brasil", 33, 1.78f, 70.3f, 31, 8, 0);
               l[2] = new Lutador("Israel Adesanya", "Nigéria", 33, 1.93f,84.2f, 21, 1, 0);
               l[3] = new Lutador("Anderson silva", "Brasil", 40, 1.88f,84.0f, 34, 11, 0);
               l[4] = new Lutador("Francis Ngannou", "França", 36, 1.93f, 117.3f, 17, 3, 3);
               l[5] = new Lutador("Tyson Fury", "Reino Unido", 30, 2.06f, 122.5f, 31, 2, 1);


        Luta UFC01 = new Luta();
        UFC01.marcarLuta(l[1], l[0]);
        UFC01.lutar();
        l[1].status();
        l[0].status();

    }
}
