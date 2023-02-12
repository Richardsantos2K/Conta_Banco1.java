package Exemplo_Basico_Com_Objeto_Java;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ContaBancoalg_2 {



        //----------------atributos-------------------
        public int NumConta;
        protected String tipo;
        private String dono;
        private float saldo;
        private Boolean status;

        //---------------------------------------------





        //-------------metodo construtor--------------

        public ContaBancoalg_2(){
            this.setSaldo(0);
            this.setStatus(false);
        }

        //---------------------------------------------




        //--------------metodos especiais--------------

        public void estadoAtual(){
            System.out.println("---------------------------------------------");
            System.out.println("Conta: " + this.getNumConta());
            System.out.println("Dono: " + this.getDono());
            System.out.println("Tipo da Conta: " + this.getTipo());
            System.out.println("Saldo atual da conta: " + this.getSaldo());
            System.out.println("Status da Conta: " + this.getStatus());
        }





        public void setNumConta(int n) {

            this.NumConta = n;
        }

        public int getNumConta() {

            return NumConta;
        }

        public void setTipo(String t) {

            this.tipo = t;
        }

        public String getTipo() {

            return tipo;
        }

        public void setDono(String d) {

            this.dono = d;
        }

        public String getDono() {
            return dono;
        }

        public void setSaldo(float s) {

            this.saldo = s;
        }

        public float getSaldo() {

            return saldo;
        }

        public void setStatus(Boolean st) {

            this.status = st;
        }

        public Boolean getStatus() {

            return status;
        }

        //---------------------------------------------




        //-----------------metodos----------------------

        public void abrirConta(String t){

            this.setTipo(t);
            this.setStatus(true);

            if (this.getTipo() == "CC"){
                this.setSaldo(50.00f);
                System.out.println("-----------------------------------------");
                System.out.println("Conta corrente criada por " + this.getDono());
                System.out.println("-----------------------------------------");
            } else if (this.getTipo() == "CP") {
                this.setSaldo(150.00f);
                System.out.println("-----------------------------------------");
                System.out.println("Conta popança criada por " + this.getDono());
                System.out.println("-----------------------------------------");
            }




        }

        public void fecharConta(){

            if (this.getSaldo() > 0){
                System.out.println("Conta com dinheiro");
            } else if (this.getSaldo() < 0) {
                System.out.println("Sua conta esta em debito, por favor resolva suas pendencias");
            } else {
                this.setStatus(false);
                System.out.println("Conta fechada com sucesso");
            }

        }

        public void depositar(float v){

            if (this.getStatus()){
                this.setSaldo(this.getSaldo() + v);
                System.out.println("-----------------------------------------");
                System.out.println("Deposito realizado com sucesso na conta de " + this.getDono());
                System.out.println("-----------------------------------------");
            }else{
                System.out.println("-----------------------------------------");
                System.out.println("É impossivel depositar nesta conta, pois ela se encontra fechada");
                System.out.println("-----------------------------------------");
            }

        }

        public void sacar(float v){
            if (this.getStatus()){
                if (this.getSaldo() >= v){
                    this.setSaldo(this.getSaldo() - v);
                    System.out.println("-----------------------------------------");
                    System.out.println("Saque de" + this.getDono() +" realizado com sucesso");
                    System.out.println("-----------------------------------------");

                }else{
                    System.out.println("-----------------------------------------");
                    System.out.println("Saldo de" + this.getDono() + "insuficiente para seu saque");
                    System.out.println("-----------------------------------------");
                }
            }else{
                System.out.println("-----------------------------------------");
                System.out.println("É impossivel Sacar nesta conta, pois ela se encontra fechada");
                System.out.println("-----------------------------------------");
            }

        }

        public void pagarMensal(float v){

            v = 0;

            if(this.getTipo() == "CC"){
                v = 12;

            }else if (this.getTipo() == "CP"){
                    v = 20;
            }


            if(this.getStatus()){
                if(this.getSaldo() > v){
                    this.setSaldo(this.getSaldo() - v);
                    System.out.println("-----------------------------------------");
                    System.out.println("Mensalidade pagada com sucesso por " + this.getDono());
                    System.out.println("-----------------------------------------");
                }else{
                    System.out.println("-----------------------------------------");
                    System.out.println("Impossivel pagar");
                    System.out.println("-----------------------------------------");
                }
            }

        }
    }
