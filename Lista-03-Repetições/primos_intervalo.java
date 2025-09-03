/*Exercício 5: Números primos em um intervalo
Descrição:
Escreva um programa que solicite dois números ao usuário e exiba todos os
números primos no intervalo entre eles, utilizando um loop aninhado (for
dentro de for).
Requisitos:
• O programa deve solicitar dois números inteiros positivos (início e fim
do intervalo).
• Deve utilizar um loop externo para percorrer os números dentro do
intervalo.
• Deve utilizar um loop interno para verificar se cada número é primo.
• Exibir apenas os números primos encontrados. */
package lista3;
import java.util.Scanner;
public class primos_intervalo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o primeiro primo");
        int primo1 = sc.nextInt();
        System.out.println("digite o seugndo primo");
        int primo2 = sc.nextInt();

        for (int i = primo1; i < primo2; i++) {
            if((i%2!=0) && (i%3!=0)){
                System.out.println("primo: " + i );
            }
        }
        sc.close();
    }
}
