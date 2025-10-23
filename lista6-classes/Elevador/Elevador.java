//Implemente um programa que simule o funcionamento básico de um elevador,
//permitindo subir, descer e exibir o andar atual.

public class Elevador {
    int andaratual = 0;
    int totalandar = 3;

    public void subir(){
        if(andaratual + 1 > totalandar){
            System.out.println("Já está no ultimo andar");
            return;    
        }
        andaratual++;
    }
    public void descer(){
        if(andaratual - 1 < 0){
            System.out.println("Já está no primeiro andar");
            return;    
        }
        andaratual--;
    }
    public void exibirandar(){
        System.out.println("O andar atual é" + andaratual);
    }
}
