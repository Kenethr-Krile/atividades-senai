
package listawhile;

import java.util.Scanner;

/*
 * @author nando
 */
public class ExercicioLoop_10 {

    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        int num,soma=0;
        for(int i = 0 ; i < 20 ; i++ ){
            System.out.printf("Informe o valor numero %d:",i+1);
            num = read.nextInt();
            if (num > 0){
                soma = soma + num;
            }
        }
        System.out.printf("O valor total e %d\n",soma);
    }
}
