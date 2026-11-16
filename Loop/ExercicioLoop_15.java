
package listawhile;

import java.util.Scanner;

/**
 * @author nando
 */
public class ExercicioLoop_15 {

    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        int num,resultado;
        do{
            System.out.printf("Informe um valor de 1 a 10:");
            num = read.nextInt();
        } while(num < 1 || num > 10);
        
        for (int i = 0 ; i < 10; i++){
            resultado = num * i;
            System.out.println(num + " x " + i + "= " + resultado); 
        }
    }
}
