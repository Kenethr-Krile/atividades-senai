
package listaanexocondicional;

import java.util.Scanner;

/**
 *
 * @author José Fernandes dos Santos Neto
 */
public class Questao05 {
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        int A,B,resultado,operacao;
        System.out.printf("Informe o valor de A:");
        A = read.nextInt();
        System.out.printf("Informe o valor de B:");
        B = read.nextInt();
        System.out.println("Qual operacao deseja realizar?\n\n(0)Soma\n(1)Subtracao\n(2)Multiplicacao\n(3)Divisao\n<:");
        operacao = read.nextInt();
        if(operacao == 0){
            resultado = A + B;
            System.out.printf("O resultado da operacao escolhida: %d\n",resultado);
        }
        else if(operacao == 1){
            resultado = A - B;
            System.out.printf("O resultado da operacao escolhida: %d\n",resultado);
        }
        else if(operacao == 2){
            resultado = A * B;
            System.out.printf("O resultado da operacao escolhida: %d\n",resultado);
        }
        else if(operacao == 3){
            resultado = A / B;
            System.out.printf("O resultado da operacao escolhida: %d\n",resultado);
        }
        else{
            System.out.println("Escolha Inexistente");
            System.exit(0);
        }
        
    }
}
