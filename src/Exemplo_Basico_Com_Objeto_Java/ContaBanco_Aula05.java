package Exemplo_Basico_Com_Objeto_Java;

public class ContaBanco_Aula05 {
    public static void main(String[] args) {
        ContaBancoalg_2 p1 = new ContaBancoalg_2();
        p1.setNumConta(568741959);
        p1.setDono("José de silva");
        p1.abrirConta("CC");

        ContaBancoalg_2 p2 = new ContaBancoalg_2();
        p2.setNumConta(568444144);
        p2.setDono("Leticia souza");
        p2.abrirConta("CP");




        //Conta do josé
        p1.depositar(100.50f);
        p1.sacar(50);

        // Conta da leticia
        p2.depositar(250.00f);
        p2.fecharConta();

        //Mostra o estado atual da contA
        p1.estadoAtual();
        p2.estadoAtual();
    }
}