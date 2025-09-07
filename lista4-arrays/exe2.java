/*Desenvolva um programa que peça ao usuário para inserir 4 notas e armazene-as
em um array. Depois, o programa deve calcular e exibir a média das notas. */

import java.util.Scanner;

public class exe2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float[] notas = new float[4];

        for(int i=0; i<notas.length; i++){
            System.out.println("digite nota: " + i);
            notas[i] = sc.nextInt();
        }
        float media_simples=0;
        for(int i=0; i<notas.length; i++){
            media_simples += notas[i];
        }
        media_simples /= notas.length;
        System.out.println("media: " + media_simples);
        sc.close();
    }
}
