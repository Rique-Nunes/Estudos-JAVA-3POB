/*Crie um programa que calcule o salário final de um funcionário, considerando um
bônus de acordo com sua categoria.*/

public class Funcionario{
    String nome;
    double salarioBase, salarioliquido;
    String categoria;

    public void calcularSalarioFinal(String tipo){
        switch (tipo) {
            case "A":
                salarioliquido = salarioBase + (salarioBase * 0.2);
                break;
            case "B":
                salarioliquido = salarioBase + (salarioBase * 0.1);
                break; 
            case "C":
                salarioliquido =  salarioBase;
                break;
            default: 
                salarioliquido = salarioBase;
                break;
        }
    }
    
    void exibirsalariobase(){
        System.out.println(salarioBase);
    }
    
    void exibirsalarioliquido(){
        System.out.println(salarioliquido);
    }
}