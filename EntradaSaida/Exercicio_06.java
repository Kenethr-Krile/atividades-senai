
package logicaunidade_i;

import java.util.Scanner;


public class Exercicio_06 {

   
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        float A,B,soma;
        System.out.printf("Insira o primeiro numero da soma: ");
        A = read.nextFloat();
        System.out.printf("Insira o segundo numero da soma: ");
        B = read.nextFloat();
        soma = A+B;
        System.out.printf("O resultado da soma: %.1f\n",soma);
        
    }
}
