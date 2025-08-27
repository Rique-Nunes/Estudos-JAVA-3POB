import java.util.Scanner;

    public class converteDistancia {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            

            System.out.println("digite o valor em quilometros");
            double km = scanner.nextDouble();

            double metros = km *1000;

            System.out.println("o Valor em metros e " + metros);
            scanner.close();
        }
    }
