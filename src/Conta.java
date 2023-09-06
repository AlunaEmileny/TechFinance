import java.util.List;

public class Conta { 
    String  numeroConta, agencia;
    double saldo;
    List<Transacao> transacaos;

    public Conta(String numeroConta, String agencia, double saldo){
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = saldo;
        transacaos = new 
    }
    public void depositar(double valor){
        saldo += valor;
    }
    public void sacar(double valor){
        if (this.saldo >= valor){
            System.out.println("Saque realizado com sucesso! ");
            saldo -= valor;
            Transacao t = new Transacao();
            transacaos.add(t);
        }
        else {
            System.out.println("Seu saldo é insuficiente para essa transação");
        }

}
    public void transferir(){
    }
    public void consultarExtrato(){
        transacaos.forEach(t -> System.out.println(t));
        System.out.println("Saldo Atual: " + this.saldo);
    }
}
