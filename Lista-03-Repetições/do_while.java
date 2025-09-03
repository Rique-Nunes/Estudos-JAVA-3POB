/*Exercício 3: Contagem regressiva usando do-while
Descrição:
Crie um programa que solicite um número ao usuário e faça uma contagem
regressiva até 0, utilizando um loop do-while.
Requisitos:
• O programa deve solicitar um número inteiro positivo ao usuário.
• Utilizar um contador decrescente para reduzir o valor até 0.
• Exibir os números da contagem regressiva um por um. */

package lista3;
import java.util.Scanner;
public class do_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.println("contagem: ");
        int cont = sc.nextInt();

        do {
            System.err.println("contagem: "+ cont);
            cont--;
        } while (cont > 0);
        sc.close();
    }    
}
