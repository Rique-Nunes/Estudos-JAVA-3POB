/*Exercício 5: Busca de Elemento em um Array
Descrição:
Implemente um programa que solicite ao usuário 10 números inteiros e os
armazene em um array. Em seguida, o usuário deve digitar um número para buscar
no array. O programa deve informar se o número está presente e em qual posição. */
import java.util.Scanner;

public class exe5 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];

        int qtd = numeros.length;

        for(int i=0; i<qtd; i++){
            System.out.println("digite os numeros: " + i);
            numeros[i] = sc.nextInt();
        }
        System.out.println("escolha o numero para buscar: ");
        int numero_escolhido = sc.nextInt();
        
        int posicao=-1;
        for(int i=0; i<qtd; i++){
            if(numeros[i]==numero_escolhido){
                System.out.println("presente");
                posicao = i;
            }
        }
        if(posicao == -1){
           System.out.println("não tem"); 
        }
        else{
            System.out.println("tem na posição: " + posicao); 
        }
        
    }
}
