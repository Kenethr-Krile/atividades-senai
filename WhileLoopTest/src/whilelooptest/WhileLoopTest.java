
package whilelooptest;

import java.util.Scanner;

/*
 * @author Jose Fernandes dos Santos Neto
 */
public class WhileLoopTest {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num1,num2,resultado,operacao=5;
        
        while (operacao < 0 || operacao > 3 ){
            System.out.printf("Informe o valor de A:");
            num1 = read.nextInt();
            System.out.printf("Informe o valor de B:");
            num2 = read.nextInt();
            System.out.printf("Qual operacao deseja realizar?\n\n(0)Soma\n(1)Subtracao\n(2)Multiplicacao\n(3)Divisao\n<:");
            operacao = read.nextInt();
            switch (operacao) {
                case 0:
                    resultado = num1+num2;
                    System.out.printf("O resultado da operacao escolhida: %d\n",resultado);
                    break;
                case 1:
                    resultado = num1 - num2;
                    System.out.printf("O resultado da operacao escolhida: %d\n",resultado);
                    break;
                case 2:
                    resultado = num1 * num2;
                    System.out.printf("O resultado da operacao escolhida: %d\n",resultado);
                    break;
                case 3:
                    resultado = num1 / num2;
                    System.out.printf("O resultado da operacao escolhida: %d\n",resultado);
                    break;
                default:
                    System.out.println("Escolha Inexistente\n");
                    break;
            }
            if (operacao >= 0 && operacao <= 3 ){
                System.out.printf("\n\nDeseja Continuar calculando?\n(5)Continuar\n(0)Sair\n<:");
                operacao = read.nextInt();
            }
            
        }
        System.out.println("\nObrigado por usar nosso programa teste!");
    }
}
