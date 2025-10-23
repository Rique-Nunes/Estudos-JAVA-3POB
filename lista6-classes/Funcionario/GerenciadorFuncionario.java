import java.util.Scanner;

public class GerenciadorFuncionario{
    public static void main(String args[]){

        int continua=0;
        double valor;
        Scanner sc = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.println("Diga o nome do funcionario: ");
        funcionario.nome = sc.nextLine();
        System.out.println("diga o salário inicial do funcionario: ");
        funcionario.salarioBase = sc.nextDouble();

        sc.nextLine(); 

        System.out.println("Digite o tipo de bonus A, B ou C");
        String texto = sc.nextLine();
        funcionario.calcularSalarioFinal(texto);


        System.out.print("Salario base é: ");
        funcionario.exibirsalariobase();

        System.out.print("Salario líquido: ");
        funcionario.exibirsalarioliquido(); 
    }
}