/*Exercício 9: construir um programa em Java que leia as 2 notas de um aluno e que calcule,
armazene e imprima a média. Se a média for maior ou igual a 7, imprimir “Aprovado”, caso
contrário, realizar a leitura de uma terceira nota, que terá peso 2 e calcular, armazenar e imprimir
uma nova média. Se a nova média for maior ou igual a 6, imprimir “Aprovado”, caso contrário,
imprimir “Reprovado”. */

import java.util.Scanner;

public class exe9_aluno_aprovado {
    public static void main(String arg[]){
        float nota1, nota2;
        Scanner sc = new Scanner(System.in);

        System.out.println("digite a primeira nota");
        nota1 = sc.nextFloat();
        System.out.println("digite a segunda nota");
        nota2 = sc.nextFloat();
        
        System.out.println(resultado(nota1, nota2));
        sc.close();

    }   
    
    public static String resultado(float nota1, float nota2){
        float media = (nota1 + nota2) /2;
        float recuperar;
        if(media >=7){
            return "Aprovado com media" + media;
        }
        else if(media < 7){
            Scanner sc = new Scanner(System.in);
            System.out.println("digite a nota de recuperação: ");
            recuperar = sc.nextFloat();
            media = (media + (recuperar*2))/2;
            if(media >=6){
                sc.close();
                return "Aprovado com media" + media;
            }
            else{
                sc.close();
                return "Reprovado com media " +media;
            }
        }
        else{
            return "Erro";
        }
    }
}
