package Polimorfismo_conseito_Aula12;

/*------------Polimorfismo de Sobreposição----------------
 Acontece quando substituimos um método de uma superclasse
  na sua subclasse, usando a mesma assinatura
 */


public class Programa_Principal_Exemplo_Polimorfismo {
    public static void main(String[]args){


        //Animal n = new Animal();

        // Animal é uma classe Abstratata e por isso não cria novos objetos


        mamifero m = new mamifero();
        m.setPeso(85.7f);
        m.setIdade(12);
        m.setCorPelo("Pardo");
        m.setMembros(4);
        m.locomover();
        m.alimentar();
        m.emitirSom();
        System.out.println(m.toString());

        reptil r = new reptil();
        r.setPeso(85.7f);
        r.setIdade(12);
        r.setCorEscama("Verde");
        r.setMembros(4);
        r.locomover();
        r.alimentar();
        r.emitirSom();

        peixe p = new peixe();
        p.setPeso(85.7f);
        p.setIdade(12);
        p.setCorEscama("Azul");
        p.setMembros(4);
        p.locomover();
        p.alimentar();
        p.emitirSom();

        ave a = new ave();
        a.setPeso(85.7f);
        a.setIdade(12);
        a.setCorPena("Amerela-Azul");
        a.setMembros(4);
        a.locomover();
        a.alimentar();
        a.emitirSom();

        //Podemos usar todos animais criados, onde suas super Classes são a classificação de mamifero, repitil, peixe e ave
        Canguru c = new Canguru();
        c.setIdade(8);
        c.setPeso(50.5f);
        c.setMembros(4);
        c.locomover();
        c.setCorPelo("Marrom");
        c.alimentar();
        System.out.println(c.toString());// mostra os dados do canguru



    }
}
