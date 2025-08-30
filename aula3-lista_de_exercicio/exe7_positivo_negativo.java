/*Exercício 7: construir um programa em Java que leia um número inteiro e imprima “Positivo”,
se o número lido for maior que 0, imprima “Negativo”, se o número lido for menor que 0 e
imprima “Nulo”, se o número lido for igual a 0.*/
import java.util.Scanner;
public class exe7_positivo_negativo {
    
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int num1;

        System.out.println("digite o numero");
        num1 = sc.nextInt();
        System.out.println(verificador(num1));
        sc.close();
    }
    public static String verificador(int num1){
        if (num1 > 0){
            return "É positivo";
        }
        else if (num1 < 0){
            return "É negativo";
        }
        else if (num1 == 0){
            return "É zero";
        }
        else {
            return "Erro";
        }
    }
}
