
package listawhile;

import java.util.Scanner;

/**
 * @author nando
 */
public class ExercicioLoop_12 {

    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        float altura, menorAltura=400, maiorAltura=0;
        float[] registro = new float[15];
        for (int i = 0 ; i < 15 ; i++){
            System.out.printf("Informe a %do altura(ex:1,70):",i+1);
            altura = read.nextFloat();
            if(altura > maiorAltura){
                maiorAltura = altura;
            }
            if(altura < menorAltura){
                menorAltura = altura;
            }
            registro[i] = altura;
        }
        for (int i = 0 ; i < 15 ; i++){
            System.out.println("Altura Registrada " + (i+1) + ": " + registro[i]); 
        }
        System.out.printf("Maior Altura: %.2f\n",maiorAltura);
        System.out.printf("Menor Altura: %.2f\n",menorAltura);
    }
}
