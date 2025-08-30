/*Exercício 5: construir um programa em Java que leia o ano de nascimento de uma pessoa e que
calcule a sua idade aproximada. Se a idade aproximada for maior ou igual a 16, imprimir “Apto
a ser eleitor”, imprimir “Inapto a ser eleitor”, caso contrário. */

import java.util.Scanner;
import java.time.Year;

public class exe5_elegivel {
    
    public static void main(String arg[]){
        int data;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua data de nascimento: ");
        data = sc.nextInt();
        System.out.println(elegivel(data));
        sc.close();
    }
    public static String elegivel(int ano){
        int ano_atual = Year.now().getValue();

        if(ano_atual - ano >= 16){
            return "Apto a ser eleitor";
        }else{
            return "Inapto a ser eleitor";
        }
    }
}
