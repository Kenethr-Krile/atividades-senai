
package listawhile;

import java.util.Scanner;

/**
 * @author nando
 */
public class ExercicioLoop_13 {

    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        float num,media,acumulo=0;
        int positivo=0,negativo=0,contador=0;
        do {
            System.out.printf("Informe um valor:");
            num = read.nextFloat();
            if(num > 0){
                positivo++;
                contador++;
            }
            else if(num < 0){
                negativo++;
                contador++;
            }
            acumulo = acumulo + num;
        } while (num != 0);
        media = acumulo / contador;
        System.out.printf("\nA quantidade de numeros positivos: %d\nA quantidade de numeros negativos: %d\n\nA media dos valores: %.2f\n",positivo,negativo,media);
    }
}
