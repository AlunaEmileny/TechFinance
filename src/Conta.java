import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Conta { 
    String  numeroConta, agencia;
    double saldo;
    List<Transacao> transacaos;

    public Conta(String numeroConta, String agencia, double saldo){
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = saldo;
        this.transacaos = new ArrayList<>();
    }
    public void addHistoricoTransacoes(double valor, String tipo){
        Transacao t = new Transacao(tipo, valor, LocalDate.now());
        transacaos.add(t);
    }
    public void consultarExtrato(){
        transacaos.forEach(t -> System.out.println(t));
        System.out.println("Saldo Atual: " + this.saldo);
    }
    public void depositar(double valor){
        this.saldo += valor;
        addHistoricoTransacoes(valor, "Deposito");
    }
    public void sacar(double valor){
        if (this.saldo >= valor){
            System.out.println("Saque realizado com sucesso! ");
            this.saldo -= valor;
            addHistoricoTransacoes(valor, "Saque");
        }
        else {
            System.out.println("Seu saldo é insuficiente para essa transação");
        }

}
    public void transferir(){
    }
}
