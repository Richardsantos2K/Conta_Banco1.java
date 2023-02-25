package Poo_Heranca_aula11;

public class Aula11_Programa_Principal_Heranca {
    public static void main(String[]args){

        //Pessoa p = new Pessoa(); A classe Pessoa é uma classe abstrata, por isso não se pode utilizala no programa principal e não podera ser transformada em objeto

        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");

        System.out.println("-------------------------------");
        System.out.println(v1.toString());
        System.out.println("-------------------------------");


        Aluno a1 = new Aluno();

        a1.setNome("Claudio");
        a1.setMatricula(2365);
        a1.setCurso("Informatica");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.PagarMensalidade();

        System.out.println("-------------------------------");
        System.out.println(a1.toString());
        System.out.println("-------------------------------");


        Bolsista b1 = new Bolsista();

        b1.setMatricula(5689);
        b1.setNome("Richard");
        b1.setIdade(18);
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.PagarMensalidade();

        System.out.println("-------------------------------");
        System.out.println(b1.toString());
        System.out.println("-------------------------------");


        Professor p1 = new Professor(2500, "Informatica");
        p1.setNome("Douglas");
        p1.setIdade(33);
        p1.setSexo("M");
        p1.getSalario();
        p1.getEspecialidade();
        p1.receberAumento();

        System.out.println("-------------------------------");
        System.out.println(p1.toString());
        System.out.println("-------------------------------");

        Tecnico t1 = new Tecnico();
        t1.setNome("Rogerio");
        t1.setIdade(25);
        t1.setSexo("M");
        t1.PagarMensalidade();
        t1.setRegistroProfissional("Desenvolvedor Backend");
        t1.praticar();

        System.out.println("-------------------------------");
        System.out.println(t1.toString());
        System.out.println("-------------------------------");




    }


}
