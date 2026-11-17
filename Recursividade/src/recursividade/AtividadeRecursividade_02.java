
package recursividade;

import java.util.Scanner;

/*
* 2. Contagem Regressiva: Escreva um método void que receba um inteiro n e imprima na tela os números de n até 1. Quando chegar a 0, imprima "Decolar!".
*/

public class AtividadeRecursividade_02 {

    public static int contagemRegressiva(int val){
        if(val <= 0){
            System.out.printf("--- Decolar !!! \n");
            return 0;
        }
        else{
            System.out.printf("--- %d !!\n", val);
            return contagemRegressiva(val - 1);
        }
    }
    
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        int val;
        
        System.out.printf("Informe um valor inteiro para contagem regressiva:");
        val = read.nextInt();
        contagemRegressiva(val);
    }
}
