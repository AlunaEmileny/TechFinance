import java.util.Scanner;;
public class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá, digite seu nome: ");
        String nome = scanner.next();
        System.out.println("Olá, digite seu CPF: ");       
        String cpf = scanner.next();
        System.out.println("Olá, digite seu email: ");
        String email = scanner.next();
        Cliente c1 = new Cliente(nome, cpf, email);
        c1.imprimir();

        // Teste da class Conta
        Conta conta = new Conta("1234321-1", "0001", 900);
        conta.sacar(230);
        conta.consultarExtrato();
        conta.sacar(1000);
        scanner.close();

    }

}
