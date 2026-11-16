
package vetoresmatrizes;

import java.util.Scanner;

/**
 * 1. Escreva um algoritmo para receber dez nomes, armazena-los em um vetor e
em seguida exibi-los
 */
public class ExercicioVetor_01 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String[] nomes = new String[10];
        
        for (int i = 0; i < 10 ; i++){
            System.out.printf("Informe o %do nome:",i+1);
            nomes[i] = read.nextLine();
            
        }
        for (int i = 0; i< 10 ; i++){
            System.out.println(nomes[i]);
        }
    }
    
}
