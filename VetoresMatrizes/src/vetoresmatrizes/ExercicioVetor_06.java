
package vetoresmatrizes;

import java.util.Scanner;

public class ExercicioVetor_06 {

    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        int[] num = new int [8];
        int maiorValor=0,posicao=0;
        
        for (int i = 0; i < 8; i++) {
            System.out.printf("Informe o %do numero da lista:",i+1);
            num[i] = read.nextInt(); 
            if (maiorValor < num[i] || i == 0){
                maiorValor = num[i];
                posicao = i+1;
            }
        }
        for (int i = 0; i < 8; i++) {
            System.out.printf("\n %d ",num[i]);
        }
        System.out.printf("\n\nO maior valor da lista: %d\nA posicao na lista: %d\n",maiorValor,posicao);
      
        
    }
}
