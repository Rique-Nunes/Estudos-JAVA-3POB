/*Exercício 8: construir um programa em Java que leia a quantidade de disciplinas em que um
aluno não alcançou a média. Se a quantidade for igual a 0, imprimir “Aprovado”, se a quantidade
for menor ou igual a 5, imprimir “Recuperação” e se a quantidade for maior que 5, imprimir
“Reprovado”. */
import java.util.Scanner;

public class exe8_disciplinas {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int disciplinas;

        System.out.println("digite a quatidade de disciplinas em falta de média: ");
        disciplinas = sc.nextInt();
        System.out.println(verificador(disciplinas));
        sc.close();
    }
    public static String verificador(int disciplinas){
        if(disciplinas ==0){
            return "Aprovado";
        }
        else if(disciplinas <=5 ){
            return "Recuperação";
        }
        else{
            return "Reprovado";
        }
    }
}
