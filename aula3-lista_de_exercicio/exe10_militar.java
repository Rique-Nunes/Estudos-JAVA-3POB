/*Exercício 10: construir um programa em Java que leia o ano de nascimento e o sexo de uma
pessoa e que calcule a sua idade aproximada. Se o sexo for igual a “M” (masculino) e a idade for
igual a 18, imprimir “Serviço Militar Obrigatório”, caso contrário, imprimir “Isento de Serviço
Militar”. */

import java.util.Scanner;
import java.time.Year;

public class exe10_militar {
    
    public static void main(String arg[]){
        int data;
        String genero;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu genero (M/F): ");
        genero = sc.nextLine();
        System.out.println("Digite seu ano de nascimento: ");
        data = sc.nextInt();
        System.out.println(elegivel(data, genero));
        sc.close();
    }
    public static String elegivel(int ano, String genero){
        int ano_atual = Year.now().getValue();
    if(genero.equalsIgnoreCase("M")){
        if(ano_atual - ano == 18){
            return "Serviço Militar Obrigatório";
        }else{
            return "Isento do Serviço Militar";
        }
    }else{
        return "Isento do Serviço Militar";
    }

    }
}
