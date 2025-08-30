/*Exercício 6: construir um programa em Java que leia o salário bruto e o sexo de um funcionário.
Se o sexo for “M” (masculino), calcular, armazenar e imprimir um desconto de 5% e o salário
líquido, caso contrário, calcular, armazenar e imprimir um desconto de 3% e o salário líquido. */

import java.util.Scanner;

public class exe6_salario_machista {
    public static void main(String arg[]){
        float salario;
        String genero;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o genero da pessoa: (M/m, F/f)");
        genero = sc.nextLine();
        System.out.println("Digite o salario da pessoa: ");
        salario = sc.nextFloat();
        System.out.println(salario_novo(genero, salario));
        sc.close();
    }
    public static String salario_novo(String genero, float salario){
        float novo_salario, desconto;
        if(genero.equalsIgnoreCase("M")){
            desconto = (float)(salario * 0.05); 
            novo_salario = salario - desconto;
            return "O novo salario e " + novo_salario + "com desconto de " + desconto;      
        }
        else if(genero.equalsIgnoreCase("F")){
            desconto = (float)(salario * 0.03); 
            novo_salario = salario - desconto;
            return "O novo salario e " + novo_salario + "com desconto de " + desconto;      
        }
        else{
            return "erro";
        }
    }
}
