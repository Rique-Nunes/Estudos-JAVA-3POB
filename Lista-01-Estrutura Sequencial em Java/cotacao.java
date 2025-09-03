/*9. Conversão de Moeda
Faça um programa que leia um valor em reais (R$) e a cotação do dólar no dia. 
O programa deve calcular e exibir o valor equivalente em dólares (US$). */

import java.util.Scanner;

public class cotacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o valor em reais: ");
        float valor = sc.nextFloat();
        System.out.println("digite a cotacao dolar: ");
        float cotacao = sc.nextFloat();
        float v = valor * cotacao;
        System.out.println("A volumo é " + v);
        sc.close();
    }
}
