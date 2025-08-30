/*Exercício 11: construir um programa em Java que leia os valores de A, B e C e que imprima
“Não forma triângulo”, se um dos valores for maior que a soma dos outros 2, caso contrário,
imprimir “Forma triângulo”. */
import java.util.Scanner;
public class exe11_triangulo {
    
    public static void main(String arg[]){
        int lado1, lado2, lado3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro lado");
        lado1 = sc.nextInt();
        System.out.println("Digite o segundo lado");
        lado2 = sc.nextInt();
        System.out.println("Digite o terceiro lado");
        lado3 = sc.nextInt();

        System.out.println(verificador(lado1, lado2, lado3));
        sc.close();

    }
    public static String verificador(int lado1, int lado2, int lado3){
        if((lado1 + lado2)<=lado3){
            return "não é triangulo";
        }
        else if((lado2 + lado3)<=lado1){
            return "não é triangulo";
        }
        else if((lado3 + lado1)<=lado2){
            return "Não é triangulo";
        }
        else{
            return "É triangulo";
        }
    }
}
