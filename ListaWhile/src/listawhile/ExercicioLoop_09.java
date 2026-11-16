
package listawhile;

import java.util.Scanner;

/**
 * @author Jose Fernandes dos Santos Neto
 */
public class ExercicioLoop_09 {

    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        float resultado=0,acumulo=0,num1,num2;
        int opcao,recomeco = 1;
        do {
            if (recomeco == 1){
                System.out.printf("Informe um valor:");
                num1 = read.nextFloat();
            }
            else {
                num1 = acumulo;
            }
            System.out.printf("Informe um valor:");
            num2 = read.nextFloat();
            System.out.println("Escolha a operacao a ser realizada\n(1)Adicao\n(2)Subtracao\n(3)Multiplicacao\n(4)Divisao\n<:");
            opcao = read.nextInt();
            switch(opcao){
                case 1 -> resultado = num1 + num2;
                case 2 -> resultado = num1 - num2;
                case 3 -> resultado = num1 * num2;
                case 4 -> resultado = num1 / num2;       
            }
            acumulo = resultado;
            System.out.printf("o resultado do calculo foi %.1f",resultado);
            System.out.printf("\nDeseja continuar a realizar calculos?\n(0)Sim e desejo utilizar o resultado atual\n(1)Sim, mas desejo comecar do zero\n(2)Nao\n<:");
            recomeco = read.nextInt();
        } while(recomeco == 0 || recomeco == 1);
        System.out.println("Calculadora finalizada!");
        
    }
}
