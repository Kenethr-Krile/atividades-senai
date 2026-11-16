
package objetos;

import java.util.Scanner;

public class ContaSimples {
    Scanner read = new Scanner(System.in);
    
    String titular;
    double saldo;
    
    void depositar(double valor){
        System.out.printf("Informe o valor que deseja adicionar a sua conta:\n<:");
        valor = read.nextDouble();
        saldo += valor;
    }
    void exibirSaldo(){
        System.out.printf("Seu saldo atual: R$ %.2f\n",saldo);
    }
}
