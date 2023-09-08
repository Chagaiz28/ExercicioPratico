public class Cliente {
    String nome;
    long cpf;
    Computador computadorCliente;

    float calculaTotalCompra (){
        float totalCompra = computadorCliente.preço;
        if(computadorCliente != null){
            totalCompra += computadorCliente.preço;
        }
        else{
        return  totalCompra;
        }

    }
}
