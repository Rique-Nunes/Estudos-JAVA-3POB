/*Crie um programa que solicite ao usuário inserir quantos números desejar em
um ArrayList<Integer>. Em seguida, ordene os números em ordem crescente e
exiba a lista ordenada. */

import java.util.ArrayList;
import java.util.Scanner;

public class exe5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> numeros = new ArrayList<>();
        double soma = 0;
        double contador = 0;
        String texto = "sim";

        while (texto.equalsIgnoreCase("sim")) {
            System.out.println("Digite o número (Para parar = -1)");
            numero = sc.nextDouble();

            if(numero == -1){
                break;
            }

            numeros.add(numero);
        }
        int qtd = numeros.size();



        sc.close();
    }

    }