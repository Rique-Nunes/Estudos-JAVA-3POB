/*Exercício 2: Tabuada de um número
Descrição:
Escreva um programa que solicite um número ao usuário e exiba a tabuada
desse número de 1 a 10, utilizando um loop while.
Requisitos:
• O programa deve pedir um número inteiro ao usuário.
• Utilizar um contador para iterar de 1 a 10.
• Exibir a multiplicação do número pelo contador em cada iteração. */
package lista3;
import java.util.Scanner;
public class tabuaada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.println("digite o número da tabuada: ");
        int num = sc.nextInt();
        int multiplicação=1;
        for(int i=1;i<=10;i++){
            multiplicação=num * i;
            System.err.println(num + " X " + i + " = " + multiplicação);
        }
        sc.close();
    }
}
