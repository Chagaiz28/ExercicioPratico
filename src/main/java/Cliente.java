import java.util.ArrayList;

public class Cliente {
    String nome;
    long cpf;
    ArrayList<Computador> computadorCliente = new ArrayList<>();

    float calculaTotalCompra() {
        float totalCompra = 0;
        for (Computador computador : computadorCliente) {
            if (computador != null) {
                totalCompra += computador.preço;
            }
        }
        return totalCompra;
    }

    void mostraCliente() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Total da Compra: " + calculaTotalCompra());
    }
}
