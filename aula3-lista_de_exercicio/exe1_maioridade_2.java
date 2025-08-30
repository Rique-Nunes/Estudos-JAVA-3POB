/*
Exercício 1: construir um programa em Java que leia a idade de uma pessoa e imprima “Maior
de idade”, se a idade lida for maior ou igual a 18.
*/

import java.util.Scanner;
public class exe1_maioridade_2{

    public static void main(String args[]){
        int idade;
        Scanner sc = new Scanner(System.in);
        System.out.println("digite a sua idade: ");
        idade = sc.nextInt();
        String texto = maioridade(idade);
        System.out.println("O garoto " + texto);

        sc.close();
    }


    public static String maioridade(int idade){
        if(idade>=18){
            return "É de maior";
        }
        else{
            return "É de menor";
        }
    }
}