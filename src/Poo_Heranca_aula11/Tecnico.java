package Poo_Heranca_aula11;

public class Tecnico extends Aluno{

    private String registroProfissional;

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    public void praticar(){

        System.out.println(this.nome + " Esta praticando na sua area de " + this.registroProfissional);

    }


}
