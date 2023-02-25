package Poo_Heranca_aula11;

public class Professor extends Pessoa {

    private String especialidade;
    private int salario;

    public Professor(int salario, String especialidade){
        this.salario = salario;
        this.especialidade = especialidade;
    }


    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void receberAumento(){
        this.setSalario(getSalario() + 500);
        System.out.println("Professor(a) " + this.nome + " Recebeu um aumento de R$500 seu salario atual sera de " + this.salario);
    }


}
