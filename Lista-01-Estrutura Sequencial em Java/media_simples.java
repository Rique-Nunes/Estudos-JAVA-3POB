/*4. Cálculo de Média Simples
Faça um programa que solicite ao usuário três notas (valores decimais) 
e exiba a média aritmética delas. */

import java.util.Scanner;

public class media_simples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o primeiro: ");
        float num1 = sc.nextFloat();
        System.out.println("digite o primeiro: ");
        float num2 = sc.nextFloat();
        System.out.println("digite o primeiro: ");
        float num3 = sc.nextFloat();
        float media = (num1 +num2+num3)/3;
        System.out.println("media:  " + media);
        sc.close();
    }
}
