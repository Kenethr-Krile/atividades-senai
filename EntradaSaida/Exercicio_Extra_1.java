
package logicaunidade_i;

import java.util.Scanner;


public class Exercicio_Extra_1 {
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        int A,B,transicao;
        System.out.printf("Digite o valor A: ");
        A = read.nextInt();
        System.out.printf("Digite o valor B: ");
        B = read.nextInt();
        System.out.printf("o Valor de A:%d\no Valor de B:%d\n",A,B);
        transicao = A;
        A = B;
        B = transicao;
        System.out.printf("o novo Valor de A:%d\no novo Valor de B:%d\n",A,B);
    }
}
