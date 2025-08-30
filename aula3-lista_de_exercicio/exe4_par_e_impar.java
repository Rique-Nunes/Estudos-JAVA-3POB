/*Exercício 4: construir um programa em Java que leia um número inteiro 
e imprima “PAR”, se o número for par e imprima “ÍMPAR”, se o número for ímpar. */

import java.util.Scanner;

public class exe4_par_e_impar {
    
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int num1;
        System.out.println("Digite o número: ");
        num1 = sc.nextInt();
        String texto = par_impar(num1);
        System.out.println(texto);
        sc.close();
    }

    public static String par_impar(int num1){
        if(num1 %2 == 0){
            return "É par";
        }else{
            return "É impar";
        }
    }
}
