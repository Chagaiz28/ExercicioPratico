import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cliente cliente = new Cliente();
        cliente.nome = "Henrique Corrêa";
        cliente.cpf = 123456789;

        MemoriaUSB pd = new MemoriaUSB();
        pd.nome = "Pen Drive";
        pd.capacidade = 16;

        MemoriaUSB pd2 = new MemoriaUSB();
        pd2.nome = "Pen drive";
        pd2.capacidade = 32;

        MemoriaUSB hd = new MemoriaUSB();
        hd.nome = "HD Externo";
        hd.capacidade = 1;

        Computador c1 = new Computador();
        c1.marca = "Positivo";
        c1.preço = 2300;
        c1.hardware1 = new HardwareBasico("Pentium Core i3", 2200);
        c1.hardware2 = new HardwareBasico("Memória RAM",8);
        c1.hardware3 = new HardwareBasico("HD",500);
        c1.addMemoriaUSB(pd);

        Computador c2 = new Computador();
        c2.marca = "Acer";
        c2.preço = 5800;
        c2.hardware1 = new HardwareBasico("Pentium Core i5", 3370);
        c2.hardware2 = new HardwareBasico("Memória RAM",16);
        c2.hardware3 = new HardwareBasico("HD",1);
        c2.addMemoriaUSB(pd2);

        Computador c3 = new Computador();
        c3.marca = "Vaio";
        c3.preço = 1800;
        c3.hardware1 = new HardwareBasico("Pentium Core i7", 4500);
        c3.hardware2 = new HardwareBasico("Memória RAM",32);
        c3.hardware3 = new HardwareBasico("HD",2);
        c3.addMemoriaUSB(hd);

        System.out.println("Escolha uma opção");
        int op;
        do{
            System.out.println("Escolha a promoção: ");
            op = scanner.nextInt();
            if(op == 1)
                cliente.computadorCliente = c1;
            else if(op == 2)
                cliente.computadorCliente = c2;
            else if(op == 3)
                cliente.computadorCliente = c3;
            else
                System.out.println("Opção Inválida");
        }while(op !=0);




    }
}
