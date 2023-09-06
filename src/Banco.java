public class Banco {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("emileny", "000.111.222-99", "emi@gmail.com");
        c1.imprimir();
        Conta conta = new Conta("000000-9", "c1", "000-1", 0);
        conta.imprimir();
    }
}
