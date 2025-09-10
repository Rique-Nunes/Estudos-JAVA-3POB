/*Crie um programa que solicite ao usuário inserir números em um
ArrayList<Double> até que ele digite -1. Depois, exiba a soma e a média dos
números inseridos (excluindo o -1). */
import java.util.ArrayList;
import java.util.Scanner;

public class exe3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> numeros = new ArrayList<>();
        double soma = 0;
        double contador = 0;
        double numero;
        while (true) { 
            System.out.println("Digite o número (Para parar = -1)");
            numero = sc.nextDouble();

            if(numero == -1){
                break;
            }

            numeros.add(numero);
        }
        int qtd = numeros.size();
        for(int i = 0; i < qtd; i++){
            soma += numeros.get(i);
        }
        double media = soma / qtd;

        System.out.println("media: " + media + " soma: " + soma);
        sc.close();
    }

    }
