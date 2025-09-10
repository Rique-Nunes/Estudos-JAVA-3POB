/*Exercício 4: Contagem de Números Pares em um Array

Descrição:
Crie um programa que solicite ao usuário 8 números inteiros e armazene-os em
um array. O programa deve contar e exibir a quantidade de números pares no
array. */
import java.util.Scanner;

public class exe4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[8];

        int qtd = numeros.length;

        for(int i=0; i<qtd; i++){
            System.out.println("digite os numeros: " + i);
            numeros[i] = sc.nextInt();
        }
        int contador=0;
        for(int i=0; i<qtd; i++){
            if(numeros[i] %2==0){
                System.out.println("par " + numeros[i]);
                contador+=1;
            }
        }
        System.out.println("foram : " + contador);
    sc.close();
    }
}
