public class Transacao {
    String tipoTransacao;
    double valor;
    double saldo;
    public void depositar(double valor){
        saldo += valor;
    }
    public void sacar(){
        saldo -= valor;
    }
    public void transferir(){

    }
    public void consultarExtrato(){
        System.out.println("Saldo Atual: " + saldo);
    }
}
