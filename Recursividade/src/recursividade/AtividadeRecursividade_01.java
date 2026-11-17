
package recursividade;

import java.util.Scanner;
/*
* 1. Fatorial Clássico: Crie um método que receba um número inteiro positivo n e retorne o seu fatorial (Ex: 5! = 5 * 4 * 3 * 2 * 1 = 120).
*/

public class AtividadeRecursividade_01 {

    public static int fatorial(int fat){
        if(fat <= 1){
            return 1;
        }
        else{
            return fat * fatorial(fat - 1);
        } 
    }
    
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        int fat,resultado;
        
        System.out.printf("Informe o valor para calculo do fatorial:");
        fat = read.nextInt();
        
        resultado = fatorial(fat);
        
        System.out.printf("Informe o fatorial de %d se registra como %d.", fat, resultado);
        
    }
}
