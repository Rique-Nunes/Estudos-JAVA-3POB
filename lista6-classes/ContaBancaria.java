import java.util.Scanner;

public class ContaBancaria{
     String titular;
     double saldo =0;

    public void depositar(double valor){
        saldo += valor;
    }
    
    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Erro: Saldo insuficiente ou valor de saque inválido.");
        }
    }
    
    public void exibirSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo atual: R$ " + saldo);
    }
}