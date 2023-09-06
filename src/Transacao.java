import java.time.LocalDate;

public class Transacao {
    String tipo;
    double valor;
    LocalDate data;

    public Transacao(String tipo, double valor, LocalDate data){
        this.tipo = tipo;
        this.valor = valor;
        this.data = data;
    }
    @Override
    public String toString() {
        return "Transacao{" +
                "data=" + data +
                ", valor=" + valor +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
