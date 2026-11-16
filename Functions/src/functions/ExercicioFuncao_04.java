
package functions;

import java.util.Scanner;

/*
4- Faça uma função que recebe um valor inteiro e verifica se o valor é positivo
ou negativo. A função deve retornar um valor booleano.
 */
public class ExercicioFuncao_04 {

    public static boolean positivoNegativo(int num) {
        return num > 0;
    }
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        int num;
        boolean result;
        
        System.out.printf("Informe um valor:");
        num = read.nextInt();
        result = positivoNegativo(num);
        if(result == true){
            System.out.println("O valor informado registra positivo");
        }
        else{
            System.out.println("O valor informado registra negativo");
        }
    }
}
