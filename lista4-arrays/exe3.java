/*Exercício 3: Inversão de Elementos de um Array
Descrição:
Escreva um programa que solicite ao usuário 6 números inteiros e os armazene
em um array. Em seguida, exiba os números na ordem inversa à de entrada. */
import java.util.Scanner;

public class exe3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[6];
        int qtd= numeros.length;

        for(int i=0; i<qtd; i++){
            System.out.println("digite os numeros: " + i);
            numeros[i] = sc.nextInt();
        }
        for(int i=qtd; i!=0 ; i--){
            System.out.println("numeros: " + i);
        }
        sc.close();
    }
}
