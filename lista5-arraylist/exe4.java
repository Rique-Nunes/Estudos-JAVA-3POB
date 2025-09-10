/*Desenvolva um programa que solicite ao usuário inserir 10 números inteiros em
um ArrayList<Integer>. Depois, peça ao usuário para digitar um número e informe
quantas vezes esse número aparece na lista. */

import java.util.ArrayList;
import java.util.Scanner;

public class exe4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int contador = 0;
        int numero;
        for(int i = 0; i < 3; i++) { 
            System.out.println("Digite o número ");
            numero = sc.nextInt();

            numeros.add(numero);
        }
        int qtd = numeros.size();
            System.out.println("Digite o número  quer procurar: ");
            numero = sc.nextInt();

        for(int i = 0; i < qtd; i++){
            if(numeros.get(i) == numero){
                contador++;
                break;
            }
        }
        System.out.println("media: " + contador);

        sc.close();
    }

    }
