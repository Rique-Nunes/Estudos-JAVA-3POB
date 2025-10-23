import java.util.Scanner;

public class GerenciadorElevador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int continua;
        Elevador elevador = new Elevador();

do{
            System.out.println("1-subir");
            System.out.println("2-descer");
            System.out.println("3-qual andar?");
            System.out.println("0-para sair");
            continua = sc.nextInt();
            
            switch (continua){
                case 1:
                    elevador.subir();
                    break;
                case 2:
                    elevador.descer();
                    break;
                case 3:
                    elevador.exibirandar();
                    break;
            }
        }
        while (continua !=0);

    }
}
