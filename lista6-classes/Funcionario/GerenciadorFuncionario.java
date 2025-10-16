import java.util.Scanner;

public class GerenciadorFuncionario{
    public static void main(String args[]){

        int continua=0;
        double valor;
        Scanner sc = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        do{
            System.out.println("1-depositar");
            System.out.println("2-sacar");
            System.out.println("3-visualizar");
            System.out.println("0-para sair");
            continua = sc.nextInt();
        }
    }

}