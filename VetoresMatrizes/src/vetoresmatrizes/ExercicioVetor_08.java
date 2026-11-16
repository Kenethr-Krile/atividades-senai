
package vetoresmatrizes;

import java.util.Scanner;

public class ExercicioVetor_08 {

    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        double[] num = new double[10];
        double divisor;
        
        for (int i = 0; i < 10; i++) {
            do{
                System.out.printf("Informe o %do valor da lista:", i+1);
                num[i] = read.nextDouble();            
                if(num[i] % 1 != 0){
                    System.out.println("valor informado se encontra incorreto, tente novamente com um numero inteiro!");
                }
            } while (num[i] % 1 != 0);
        }
        System.out.printf("\nOs valores informados foram:\n");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%.0f ",num[i]);
        }
        do{
            System.out.printf("\n\ninforme um valor positivo e inteiro: ");
            divisor = read.nextDouble();
            if(divisor < 0 || divisor % 1 != 0){
                System.out.println("valor informado nao atende os criterios, tente novamente com um numero positivo ou inteiro!");
            }
        } while (divisor < 0 || divisor % 1 != 0);
        System.out.printf("\nOs valores divisiveis por %.0f sao:\n", divisor);
        for (int i = 0; i < 10; i++) {
            if (num[i] % divisor == 0){
                System.out.printf("%.0f ",num[i]);
            }    
        }
        System.out.println("");
    }   
}
