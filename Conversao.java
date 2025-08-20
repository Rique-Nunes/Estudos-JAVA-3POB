import java.util.Scanner;
public class Conversao {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em farhreit: ");
        double farhreit = sc.nextDouble();

        double celsuis = (5.0 / 9.0) * (farhreit -32);

        System.out.println("A temperatura em celsuis é: " + celsuis);

        sc.close();
    }
}
