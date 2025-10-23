import java.util.Scanner;

public class GerenciarAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Digite o nome do aluno: ");
        aluno.nome = sc.nextLine();
        do {
            System.out.println("Digite a nota do aluno: ");
            aluno.nota = sc.nextDouble();
        }
        while (aluno.validarNota() !=0 );

        System.out.println("Situação do aluno e: ");
        aluno.classificarAluno();
    }
}
