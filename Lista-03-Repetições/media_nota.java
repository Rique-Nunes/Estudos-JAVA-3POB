/*Exercício 4: Média de notas de uma turma

Descrição:
Desenvolva um programa que calcule a média das notas de uma turma, onde
o usuário informe quantos alunos há na turma e suas respectivas notas.
Requisitos:
• O programa deve solicitar a quantidade de alunos.
• Deve utilizar um loop for para receber as notas de cada aluno.
• Utilizar um acumulador para somar todas as notas.
• No final, exibir a média da turma. */
package lista3;
import java.util.Scanner;
public class media_nota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("quantidade de aluno: ");
        int qtd_aluno = sc.nextInt();
        int media_nota = 0;
        for (int i = 0; i < qtd_aluno; i++) {
            System.out.println("nota aluno "+ i + ":");
            media_nota += sc.nextInt();
        }
        System.out.println("media é "+media_nota/qtd_aluno);
        sc.close();
    }
}
