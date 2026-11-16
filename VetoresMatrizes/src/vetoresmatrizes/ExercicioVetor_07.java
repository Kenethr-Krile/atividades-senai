
package vetoresmatrizes;

import java.util.Scanner;

public class ExercicioVetor_07 {

    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        int[] num = new int[10];
        int soma=0;
        
        for (int i = 0; i < 10; i++) {
            System.out.printf("Informe o %do numero da lista: ", i+1);
            num[i] = read.nextInt();
            soma += num[i];
        }
        for (int i = 0; i < 10; i++) {
            System.out.printf(" %d ",num[i]);
           
        }
        System.out.printf("\n\nA soma dos valores informados: %d\n", soma);
    }
}
