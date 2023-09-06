public class Cliente {
    
    String nome, cpf, email;
    public Cliente(String nome, String cpf, String email){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    
    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("email: " + this.email);
        System.out.println("cpf: " + this.cpf);
    }
}
