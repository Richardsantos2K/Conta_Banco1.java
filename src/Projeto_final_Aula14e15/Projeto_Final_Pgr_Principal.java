package Projeto_final_Aula14e15;

public class Projeto_Final_Pgr_Principal {
    public static void main(String[]Args){

        Video v[] = new Video [3];
        v[0] = new Video("Os carros mais caros do mundo");
        v[1] = new Video("As manções mais caras do mundo");
        v[2] = new Video("5 formas de se fazer pão");

        Usuario s[] = new Usuario[2];
        s[0] = new Usuario("Roger", 22, "M", "ger@email.com");
        s[1] = new Usuario("Julia", 16, "F", "juh87@email.com");

        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(s[0], v[2]); //roger assiste 5 formas de fazer pao
        vis[0].avaliar();
        System.out.println("-----------------------Youtube-----------------------");
        System.out.println(vis[0].toString());
        System.out.println("-----------------------------------------------------");

        System.out.println();

        vis[1] = new Visualizacao(s[0], v[1]); //julia assiste as mansoes mais caras do mundo
        vis[1].avaliar(45.0f);
        System.out.println("-----------------------Youtube-----------------------");
        System.out.println(vis[1].toString());
        System.out.println("-----------------------------------------------------");

        /*System.out.println("-----------------------Youtube-----------------------");
        System.out.println(v[0].toString());
        System.out.println("-----------------------------------------------------");

        System.out.println("-----------------------------------------------------");
        System.out.println(s[0].toString());
        System.out.println("-----------------------------------------------------");*/



    }
}
