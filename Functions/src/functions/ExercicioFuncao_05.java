
package functions;

import java.util.Scanner;

/*
5- Escreva uma função que recebe, por parâmetro, um valor inteiro e positivo e
retorna o somatório desse valor.
 */
public class ExercicioFuncao_05 {

    public static int somatorio(int num) {
        int contador = 0;
        
        for(int i = 0;  i <= num; i++){
           contador += i;    
        }
        return contador;
    }
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        int num, resultado;
        
        System.out.printf("Informe um valor inteiro e positivo: ");
        num = read.nextInt();
        resultado = somatorio(num);
        System.out.println("O somatorio do valor informado registra " + resultado);
        
    }
}
