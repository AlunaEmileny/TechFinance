import java.util.Scanner;;
public class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.next();
        String cpf = scanner.next();
        String email = scanner.next();
        Cliente c1 = new Cliente(nome, cpf, email);
        c1.imprimir();
        Conta conta = new Conta("000000-9", "c1", "000-1", 0);

        scanner.close();
    }

}
