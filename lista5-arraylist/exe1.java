/*Crie um programa que permita ao usuário inserir quantos números desejar em
um ArrayList<Integer>. Após a inserção, o programa deve exibir todos os números
digitados. */
import java.util.ArrayList;
import java.util.Scanner;

public class exe1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int number;
        String texto = "sim";

        while (texto.equalsIgnoreCase("sim")) {
            System.out.println("digite: ");
            number = sc.nextInt();
            numeros.add(number);
            sc.nextLine();
            System.out.println("continua? ");
            texto = sc.nextLine();
        }

        for(int i = 0; i<numeros.size(); i++){
            System.out.println(numeros.get(i));
        }
        sc.close();
    }
}
