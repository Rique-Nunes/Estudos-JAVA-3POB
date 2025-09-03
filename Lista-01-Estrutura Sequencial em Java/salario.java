/*Escreva um programa que receba o salário bruto de um funcionário e o valor de desconto do INSS. O programa deve calcular e exibir o salário líquido.
*/

import java.util.Scanner;

public class salario {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o salario");
        float salario = sc.nextFloat();
        System.out.println("digite o desconto");
        float INSS = sc.nextFloat();
        float salario_b = salario - (salario*(INSS/100));

        System.out.println("o salario é: " + salario_b);
        sc.close();
    }
}
