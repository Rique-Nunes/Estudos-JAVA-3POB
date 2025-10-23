import java.util.Scanner;

public class GerenciarCaixa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Caixa caixa =  new Caixa();
        
        int continua; 
        
        double temp;
        do{
            System.out.println("1-sacar");
            System.out.println("2-exibir");
            System.out.println("0-para sair");
            
            continua = sc.nextInt();
            
            switch (continua){
                case 1:
                    System.out.println("digite a quantidade a sacar: ");
                    temp = sc.nextDouble();

                    caixa.sacar(temp);
                    break;
                case 2:
                    caixa.exibirSaldo();
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
        while (continua != 0);

    }
}