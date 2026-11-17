
package recursividade;

import java.util.Scanner;

/**
 *  4. Sequência de Fibonacci: Desenvolva um método que receba um índice n e retorne o n-ésimo termo da sequência de Fibonacci (0, 1, 1, 2, 3, 5, 8...).
 *     Este problema exige duas chamadas recursivas, pois f(n) = f(n-1) + f(n-2) .
 */ 

public class AtividadeRecursividade_04 {

    
    public static int seqFibonacci(int val){
        if (val == 0){
            return 0;
        }
        if(val == 1){
            return 1;
        }
        return seqFibonacci( val - 1 ) + seqFibonacci( val - 2);      
    }
    
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        int val;
        
        System.out.printf("Informe o indice para a sequencia de fibonacci:");
        val = read.nextInt();
        
        
        for (int i = 0; i <= val; i++) {
            int resultado = seqFibonacci(i);
            System.out.printf("| %d |",resultado);
        }
        
    }
}
