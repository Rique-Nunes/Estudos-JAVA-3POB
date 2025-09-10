/*Escreva um programa que solicite ao usuário inserir 5 nomes em um
ArrayList<String>. Em seguida, peça para o usuário informar um nome para ser
removido da lista. Exiba a lista após a remoção. */
import java.util.ArrayList;
import java.util.Scanner;

public class exe2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        String teste = "sim";

        while(teste.equalsIgnoreCase("sim")){
            System.out.println("digite um nome: ");
            String name = sc.nextLine();
            nomes.add(name);
            System.out.println("deseja continuar? ");
            teste = sc.nextLine();
        }
        System.out.println("qual nome deseja remover? ");
        String removeName = sc.nextLine();
        nomes.remove(removeName);
        System.out.println(nomes);
        sc.close();
    }
}
