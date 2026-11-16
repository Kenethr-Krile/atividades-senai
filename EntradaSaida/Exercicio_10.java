
package logicaunidade_i;

import java.util.Scanner;

public class Exercicio_10 {
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        float valorInicial,rendimento,valorTotal;
        System.out.printf("Digite o valor que deseja depositar: ");
        valorInicial = read.nextFloat();
        rendimento = ((valorInicial / 1000) * 7);
        valorTotal = valorInicial + rendimento;
        System.out.printf("O valor depositado: %.2f\n\nPrevisao de Rendimento para o proximo mes: %.2f\nValor Total: %.2f\n",valorInicial,rendimento,valorTotal);
        
    }
}
