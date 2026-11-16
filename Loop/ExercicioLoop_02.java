
package exerciciocondicional;

import java.util.Scanner;

/**
 * @author Jose Fernandes dos Santos Neto
 */
public class ExercicioCondicional_02 {

    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        int a,negativo = 0;
        for (int i = 0; i<5; i++){
            System.out.printf("Informe um valor: ");
            a = read.nextInt();
            if (a < 0){
                negativo +=1;
            }
            
        }
        System.out.printf("A quantidade de numeros negativos informados: %d\n",negativo);
    }
}
