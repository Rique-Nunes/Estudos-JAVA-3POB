/*Crie um programa que solicite ao usuário inserir quantos números desejar em
um ArrayList<Integer>. Em seguida, ordene os números em ordem crescente e
exiba a lista ordenada. */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class exe5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int numero = 0;
        String texto = "sim";

        while (texto.equalsIgnoreCase("sim")) {
            System.out.println("Digite o número: ");
            numero = sc.nextInt();

            numeros.add(numero);
            sc.nextLine();
            System.out.println("continua? ");
            texto = sc.nextLine();
        }
        int qtd = numeros.size();

        Collections.sort(numeros);

        for(int i = 0; i<qtd; i++){
            System.out.println(numeros.get(i));
        }

        sc.close();
    }

    }