
package exerciciocondicional;

import java.util.Scanner;

/**
 * @author Jose Fernandes dos Santos Neto
 */
public class ExercicioCondicional_04 {

    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        int num=1,media=0,contador=-1;
        
        while(num != 0){
            System.out.printf("Digite 0 para finalizar\nDigite qualquer outro numero para continuar o calculo\n<: ");
            num = read.nextInt();
            if (num % 2 == 0){
                media = media + num;
                contador++;
            }
            
        }
        media = media / contador;
        System.out.printf("A media dos numeros informados: %d\nA quantidade de numeros pares informados:%d\n",media,contador);
    }
}
