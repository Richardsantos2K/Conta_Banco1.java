package Exercicios_Poo;

public class Exercicios_ProjetoLivro_Aula09 {
    public static void main (String[] args){

        Pessoa [] p = new Pessoa [2];

        Livro [] l = new Livro[3];

        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Maria", 20, "M");

        l[0] = new Livro("Em busca do que não achou", "Marquinhos", 300, p[0]);
        l[1] = new Livro("Algo de errado não esta certo", "Rogerio", 150, p[1]);

        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());




    }
}
