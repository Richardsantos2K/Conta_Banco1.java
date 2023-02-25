package TesteCodigo;

public class Aula_Teste {
    public static void main(String [] args){

        Pessoa p[] = new Pessoa[2];

        Livro l[] = new Livro[2];

        p[0] = new Pessoa("Richard", 18, "M");

        p[1] = new Pessoa("Alessandra", 18, "F");

        l[0] = new Livro("A espera de um milagre", "Rogerio", 300, p[0]);

        l[1] = new Livro("Crepusculo", "Marcelin", 500, p[1]);

        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());

    }
}
