/*7. Cálculo do Perímetro e Área de um Retângulo
Faça um programa que solicite a base e a altura de um retângulo e exiba o seu perímetro e sua área.

Fórmulas:

Área = base × altura

Perímetro = 2 × (base + altura). */

import java.util.Scanner;

public class Perimetro_area {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite a base: ");
        float base = sc.nextFloat();
        System.out.println("digite a altura: ");
        float altura = sc.nextFloat();

        float perimetro = 2 * (base + altura);
        float area = base * altura;
        System.out.println("A area é " + area + " e o perimentro: " +perimetro);
        sc.close();
    }
}
