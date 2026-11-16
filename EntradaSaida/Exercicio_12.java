
package logicaunidade_i;

import java.util.Scanner;

public class Exercicio_12 {
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        float valorCustoProd,acrescimo,valorPercentual,valorTotal;
        System.out.printf("Informe o valor de custo do produto: ");
        valorCustoProd = read.nextFloat();
        System.out.printf("Informe o percentual de custo adicionado ao produto: ");
        acrescimo = read.nextFloat();
        valorPercentual = ((valorCustoProd / 100) * acrescimo);
        valorTotal = valorCustoProd + valorPercentual;
        System.out.printf("Valor de Custo do Produto: %.2f\nPercentual adicionado ao produto: %.1f%%\nValor do Percentual: %.2f \n\nValor da Venda: %.2f\n",valorCustoProd,acrescimo,valorPercentual,valorTotal);
        
    }
}
