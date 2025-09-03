/*8. Cálculo do Volume de uma Esfera
Crie um programa que leia o raio de uma esfera e calcule o seu volume.

Fórmula: V = (4/3) * π * raio³.

Use π = 3.14159. */
import java.util.Scanner;

public class volume_esfera {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o raio da esfera: ");
        float raio = sc.nextFloat();
        float pi = 3.14159f;
        float v = (4f/3f) * pi * (raio *raio *raio);
        System.out.println("A volumo é " + v);
        sc.close();
    }
}
