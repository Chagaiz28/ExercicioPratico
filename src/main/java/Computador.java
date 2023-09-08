public class Computador {
    String marca;
    float preço;
    HardwareBasico hardware1;
    HardwareBasico hardware2;
    HardwareBasico hardware3;
    MemoriaUSB memoriaUSB;
    SistemaOperacional so;

    void addMemoriaUSB(MemoriaUSB musb){
        musb = memoriaUSB;
    }
    void mostraPCConfig(){
        System.out.println("Marca: "+ marca);
        System.out.println("Preço: "+preço);
        System.out.println("Processador: "+hardware1.nome+" "+hardware1.capacidade);
        System.out.println("Memória RAM: "+hardware2.nome+" "+hardware2.capacidade);
        System.out.println("HD: "+hardware3.nome+" "+hardware3.capacidade);
        System.out.println("Sistema Operacional: "+so.nome +" " +so.tipo);
        System.out.println("Memória USB: " + memoriaUSB.nome +" " +memoriaUSB.capacidade);
    }
}
