import java.util.Scanner;

public class Conta { 
    String titular, numeroConta, agencia;
    double saldo;
    Scanner scanner = new Scanner(System.in);

    public Conta(String numeroConta, String titular, String agencia, double saldo){
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = saldo;
        this.titular = titular;
    }
    public void imprimir(){
        System.out.println("Numero: " + this.numeroConta);
        System.out.println("Titular: " + this.titular);
        System.out.println("agencia: " + this.agencia);
        System.out.println("Saldo: " + this.saldo);
    }
}
