
package exerciciocondicional;

import java.util.Scanner;

/**
 * @author Jose Fernandes dos Santos Neto
 */
public class ExercicioCondicional_08 {

    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        int a,fatorial = 0;
        System.out.printf("informe o valor de A: ");
        a = read.nextInt();
        fatorial = a;
        for (int i = a ; i > 0 ; i--){
            if(a > 1){
                fatorial = fatorial * (a-1);
            }
            if(a > 1){
                System.out.printf("%dx",i);
            }
            else{
                System.out.printf("%d",i);
            }
            a--;
        }
        System.out.printf("=%d\n",fatorial);
        
    }
}
