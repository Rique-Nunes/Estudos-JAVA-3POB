/*Crie um programa que calcule o salário final de um funcionário, considerando um
bônus de acordo com sua categoria.*/

public class Funcionario{
    String nome;
    double salarioBase;
    String categoria;

    calcularSalarioFinal(String tipo){
        if(tipo == 'A'){
            salarioBase += salarioBase*0.2;
        }else if(tipo == 'B'){
            salarioBase += salarioBase*0.1;
        }
    }
}