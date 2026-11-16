
package av2;

import java.util.Scanner;

/*
Escreva um programa que leia um vetor de 10 números inteiros fornecidos pelo usuário e calcule e
exiba a soma dos números pares do vetor. (1 ponto)
 */

public class Av2Questao_01 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] vetInteiros = new int[10];
        int soma = 0;
        
        System.out.printf("Informe 10 numeros inteiros:\n");
        for (int i = 0; i < vetInteiros.length; i++) {
            System.out.printf("<:");
            vetInteiros[i] = read.nextInt();
            if (vetInteiros[i] % 2 == 0){
                soma += vetInteiros[i];
            }
        }
        System.out.println("Numeros Informados: ");
        for (int i = 0; i < vetInteiros.length; i++) {
            System.out.printf("| %d |", vetInteiros[i]);    
        }
        System.out.printf("\n\n");
        System.out.printf("Soma dos pares: %d\n", soma);
    }    
}
