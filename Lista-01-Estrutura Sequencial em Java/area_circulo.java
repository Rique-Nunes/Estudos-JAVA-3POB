/*Desenvolva um programa que leia o raio de um círculo e calcule sua área.

Fórmula: Área = π * raio²

Considere π = 3.14159. */
import java.util.Scanner;

public class area_circulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o raio do circulo: ");
        float raio = sc.nextFloat();
        float pi = 3.14159f;
        float area = pi * (raio *raio);
        System.out.println("A area é " + area);
        sc.close();
    }
}
