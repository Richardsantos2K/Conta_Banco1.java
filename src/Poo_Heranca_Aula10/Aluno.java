package Poo_Heranca_Aula10;

public class Aluno extends Pessoa {

    private int matr;
    private String curso;




    public void cancelarMatr(){
        System.out.println("Matricula encerrada com sucesso");
    }




    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }



}
