
package vetoresmatrizes;

import java.util.Scanner;

public class ExercicioVetor_09 {

    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        int[] vetor1 = new int [5];
        int[] vetorInverso1 = new int[5];
        int index=0;
        
        for (int i = 0; i < 5; i++) {
            System.out.printf("Informe o %do valor:", i+1);
            vetor1[i] = read.nextInt();
        }
        
        System.out.println("Os valores registrados:");
        
        for (int i = 0; i < 5; i++) {
            System.out.printf("%d ", vetor1[i]);
          
        }
        
        for (int i = 4; i >= 0; i--) {
            vetorInverso1[i] = vetor1[index];
            index++;
        }
        
        System.out.println("\nOs valores registrados em ordem inversa:");
        
        for (int i = 0; i < 5; i++) {
            System.out.printf("%d ", vetorInverso1[i]);
        }
        System.out.println("");
    }
}
