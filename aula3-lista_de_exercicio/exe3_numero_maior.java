/*Exercício 3: construir um programa em Java que leia 2 números inteiros 
e imprima o maior número lido. */
import java.util.Scanner;

public class exe3_numero_maior {
    
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.println("Digite o primeiro número: ");
        num1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = sc.nextInt();
        int maior = maior(num1, num2);
        System.out.println("o maior: "+ maior);
        sc.close();
    }

    public static int maior(int num1, int num2){
        if(num1 > num2){
            return num1;
        }
        else{
            return num2;
        }
    }
}
