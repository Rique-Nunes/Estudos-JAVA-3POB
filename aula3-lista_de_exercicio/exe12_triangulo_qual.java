/*Exercício 12: construir um programa em Java que leia os valores de A, B e C e que imprima
“Não forma triângulo”, se um dos valores for maior que a soma dos outros 2, caso contrário,
imprimir qual é o tipo do triângulo, que pode ser “Equilátero”, se tiver os 3 lados iguais,
“Isósceles”, se tiver 2 lados iguais e “Escaleno”, se os 3 lados forem diferentes. */
import java.util.Scanner;
public class exe12_triangulo_qual {
    
    public static void main(String arg[]){
        int lado1, lado2, lado3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro lado");
        lado1 = sc.nextInt();
        System.out.println("Digite o segundo lado");
        lado2 = sc.nextInt();
        System.out.println("Digite o terceiro lado");
        lado3 = sc.nextInt();

        System.out.println(verificador_triangulo(lado1, lado2, lado3));
        sc.close();

    }
    public static String verificador_triangulo(int lado1, int lado2, int lado3){
        if((lado1 + lado2)<=lado3){
            return "Não é triangulo";
        }
        else if((lado2 + lado3)<=lado1){
            return "Não é triangulo";
        }
        else if((lado3 + lado1)<=lado2){
            return "Não é triangulo";
        }
        else{
            return tipo_triangulo(lado1, lado2, lado3);
        }
    }
    public static String tipo_triangulo(int lado1, int lado2, int lado3){
        if ((lado1 == lado2)  && (lado2 == lado3)) {
            return "É equilátero";
        }
        else if ((lado1 != lado2)  && (lado2 != lado3) && (lado1 != lado3) ) {
            return "É escaleno";
        }
        else{
            return "É isosceles";
        }
    }
}
