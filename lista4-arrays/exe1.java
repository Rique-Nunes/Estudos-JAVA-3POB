/*Crie um programa que solicite ao usuário 5 números inteiros e armazene-os em
um array. Após isso, o programa deve exibir o maior e o menor número do array. */
import java.util.Scanner;

public class exe1 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int maior = 0, menor = 9999;
        int[] numeros = new int[5];

        for(int i=0; i<numeros.length; i++){
        System.out.println("Escreva o número: " + i);
            numeros[i] = sc.nextInt();
        }

        for(int i=0; i<numeros.length; i++){
        if(numeros[i] > maior){
                maior = numeros[i];
            }
        if(numeros[i] < menor){
                menor = numeros[i];
            }
        }
        System.out.println("maior : " + maior + " menor: " + menor);
        sc.close();
    }
}
