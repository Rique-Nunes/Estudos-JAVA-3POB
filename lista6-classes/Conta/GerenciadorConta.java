import java.util.Scanner;

public class GerenciadorConta{
    
    public static void main(String args[]){
        int continua=0;
        double valor;
        Scanner sc = new Scanner(System.in);
        ContaBancaria minhaConta = new ContaBancaria();
    
        minhaConta.titular = "Joao";

        do{
            System.out.println("1-depositar");
            System.out.println("2-sacar");
            System.out.println("3-visualizar");
            System.out.println("0-para sair");
            continua = sc.nextInt();
            
            switch (continua){
                case 1:
                    System.out.println("quanto: ");
                    valor = sc.nextDouble();
                    minhaConta.depositar(valor);
                    break;
                case 2:
                    System.out.println("quanto: ");
                    valor = sc.nextDouble();
                    minhaConta.sacar(valor);
                    break;
                case 3:
                    minhaConta.exibirSaldo();
                    break;
            }
        }
        while (continua !=0);

    }
}