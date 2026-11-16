
package exerciciocondicional;

import java.util.Scanner;

/**
 * @author Jose Fernandes dos Santos Neto
 */
public class ExercicioCondicional_05 {

    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        int num=0,soma=0;
        for (int i = 0 ; i < 10 ; i++){
            System.out.printf("Informe um numero inteiro: ");
            num = read.nextInt();
            soma = soma + num;   
        }
        System.out.println(soma);
    }       
}

