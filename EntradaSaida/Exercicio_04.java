
package logicaunidade_i;

import java.util.Scanner;


public class Exercicio_04 {
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        float dolar,real,cotacao;
        System.out.printf("Digite o valor em dolar: ");
        dolar = read.nextFloat();
        System.out.printf("Digite a cotacao atual para o real: ");
        cotacao = read.nextFloat();
        real = (dolar * cotacao);
        System.out.printf("O valor em Dolar: $:%.2f\nO valor em Real: R$:%.2f\n", dolar,real);
    }
}
