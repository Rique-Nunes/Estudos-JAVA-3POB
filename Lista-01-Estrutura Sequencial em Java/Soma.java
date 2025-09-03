import java.util.Scanner;

public class Soma {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o primeiro numero: ");
        int num1 = sc.nextInt();
        
        System.out.println("digite o segundo numero: ");
        int num2 = sc.nextInt();

        int soma = num1 + num2; 
        
        System.out.println("A soma dos números é: " + soma);
        
        sc.close();
    }
}