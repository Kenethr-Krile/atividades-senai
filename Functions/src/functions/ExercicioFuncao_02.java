
package functions;

import java.util.Scanner;

/*
 2- Faça uma função que recebe por parâmetro um valor inteiro e retorna o
valor lógico Verdadeiro caso o valor seja par e Falso em caso contrário.
 */
public class ExercicioFuncao_02 {
    
    public static boolean valorPar(int num) {
        return num % 2 == 0;
    }
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        int num;
        boolean result;
        System.out.printf("Informe o valor para teste:");
        num = read.nextInt();
        result = valorPar(num);
        if(result == false){
            System.out.println("O valor informado e impar");
        }
        else{
            System.out.println("O valor informado e par");
        }
    }
}
