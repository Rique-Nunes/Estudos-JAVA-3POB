/*Crie um programa que simule um caixa eletrônico, permitindo saques apenas em
múltiplos de R$ 10 e garantindo que o saldo seja suficiente. */
public class Caixa {
    double saldo = 1000.0;

    public void sacar(double valor){
        
        if ((valor % 10) != 0){
            System.out.println("Valor inválido. Saque apenas múltiplos de R$ 10.");
            return;
        }
        
        if (valor > saldo) {
            System.out.println("Saldo insuficiente. Seu saldo atual é: " + saldo);
            return;
        }

        saldo = saldo - valor;
        System.out.println("Saque de R$" + valor + " realizado. Saldo restante: " + saldo);
    }
        
    public void exibirSaldo(){
        System.out.println("o saldo atual é: " + saldo);
    }
}