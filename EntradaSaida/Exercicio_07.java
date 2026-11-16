
package logicaunidade_i;

import java.util.Scanner;


public class Exercicio_07 {
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        int A,B,soma,sub,multi,div,resto;
        System.out.printf("Digite o primeiro numero: ");
        A = read.nextInt();
        System.out.printf("Digite o segundo numero: ");
        B = read.nextInt();
        soma = A + B;
        sub = A - B;
        div = A / B;
        resto = A % B;
        multi = A * B;
        System.out.printf("Soma: %d\nSubtracao: %d\nMultiplicao: %d\nDivisao:%d Resto:%d\n",soma,sub,multi,div,resto);
    }
}
