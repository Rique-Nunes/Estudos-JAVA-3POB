/*3. Conversão de Temperatura
Crie um programa que leia uma temperatura em graus Celsius e a converta para Fahrenheit.

Fórmula: F = (C × 9/5) + 32. */
import java.util.Scanner;
public class converter_fahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite em Celsius: ");
        float celsi = sc.nextFloat();

        float Fahrenheit = (celsi * (9/5))+32;
        System.out.println("temperatura:  " + Fahrenheit);
        sc.close();
    }
}
