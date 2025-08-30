/*
Exercício 1: construir um programa em Java que leia a idade de uma pessoa e imprima “Maior
de idade”, se a idade lida for maior ou igual a 18.
*/

import java.util.Scanner;
public class exe1_maioridade_1{

    public static void main(String args[]){
        int idade;
        Scanner sc = new Scanner(System.in);
        System.out.println("digite a sua idade: ");
        idade = sc.nextInt();
        
        if(idade>=18){
            System.out.println("É de maior");
        }
        sc.close();
    }

}