
package objetos;

import java.util.Scanner;

public class Exercicio_04 {

    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        
        // Questão 4
        double valor = 0;
        ContaSimples lucasLuz = new ContaSimples();
        lucasLuz.titular = "Lucaz Luz";
        lucasLuz.saldo = 1.98;
        
        for (int i = 0; i < 3; i++) {
            lucasLuz.depositar(valor);
        }
        lucasLuz.exibirSaldo();
    }
}
