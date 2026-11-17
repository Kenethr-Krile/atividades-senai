
package recursividade;

import java.util.Scanner;

/**
 *3. Soma de Números Naturais: Crie uma função que receba um número n e retorne a soma de todos os números de 1 até n (Ex: se n = 4 , retorna 1 + 2 + 3 + 4 = 10 ).
 */
public class AtividadeRecursividade_03 {
    
    
    public static int somaRecursiva(int val, int start, int soma){
        
        if(start > val){
            System.out.printf(" = %d\n", soma);
            return soma;
        }
        else{
            if (start > val-1){
                System.out.printf("%d",start);
            }
            else{
                System.out.printf("%d + ",start);
            }
            soma = soma + start;
            return somaRecursiva(val, start + 1, soma);    
        }
    }
    
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        int val;
        int start = 1;
        int soma = 0;
        
        
        System.out.printf("Informe um valor para demonstracao de soma:");
        val = read.nextInt();
        
        somaRecursiva(val, start, soma);
    }
}
