
package listawhile;

import java.util.Scanner;

/**
 * @author nando
 */
public class ExercicioLoop_11 {

    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        int num,soma=0;
        do{
            System.out.printf("Informe o valor:");
            num = read.nextInt();
            soma = soma + num;
        } while(num != 0);
        System.out.printf("O valor da soma e %d\n", soma);
        
    }
}
