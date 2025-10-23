/*Crie um programa que leia uma nota de um aluno e verifique sua validade. Se for
válida, classifique o aluno conforme sua média.*/
public class Aluno {
    String nome;
    double nota;

    public int validarNota(){
        if(nota > 0 && nota < 10){
            return 0;
        }
        return 1;
    }
    public void classificarAluno(){
        if(nota>=7){
            System.out.println("Aprovado");
        }
        else if(nota < 7 & nota => 5){
         System.out.println("Recuperação");
        }
        else{
            System.out.println("Reprovado");
        }
    }
}
