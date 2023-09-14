import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Conta { 
    private String  numeroConta, agencia;
    private double saldo;
    private List<Transacao> transacaos;
    private Cliente cliente;

    public Conta(Cliente cliente, String numeroConta, String agencia, double saldo){
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = saldo;
        this.transacaos = new ArrayList<>();
        this.cliente = cliente;
    }

    public String getNumeroConta() {
        return numeroConta;
    }
    public String getAgencia() {
        return agencia;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public String toString(){
        return "\nNome: " + this.cliente.getNome() +
               "\nCPF/CNPJ: " + this.cliente.getCpf()+
               "\nConta: " + this.getNumeroConta()+
               "\nAgência: " + this.getAgencia()+
               "\nSaldo: " + this.getSaldo();
    }
    public List<Transacao> getTransacaos() {
        return transacaos;
    }
    public void addHistoricoTransacoes(double valor, String tipo){
        Transacao t = new Transacao(tipo, valor, LocalDate.now());
        transacaos.add(t);
    }
    public void consultarExtrato(){
        transacaos.forEach(t -> System.out.println(t));
        System.out.println("Saldo Atual: " + getSaldo());
    }
    public void depositar(double valor){
        setSaldo(getSaldo() + valor);
        addHistoricoTransacoes(valor, "Deposito");
    }
    public void sacar(double valor){
        if (this.saldo >= valor){
            System.out.println("Saque realizado com sucesso! ");
            setSaldo(getSaldo()-valor);
            addHistoricoTransacoes(valor, "Saque");
        }
        else {
            System.out.println("Seu saldo é insuficiente para essa transação");
        }

}
    public void transferir(double valor){
        if (valor > getSaldo()){
            setSaldo(getSaldo()- valor);
            System.out.println("Transferencia realizada com sucesso!");
            addHistoricoTransacoes(valor, "transferencia");
        }else {
            System.out.println("Seu saldo é insuficiente para essa tranferencia.");
        }
    }
}
