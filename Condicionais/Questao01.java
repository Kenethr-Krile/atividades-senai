
package listaanexocondicional;
/*Autor: José Fernandes dos Santos Neto*/
import java.util.Scanner;

public class Questao01 {
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        int A,B,C,soma;
        System.out.printf("Digite o valor de A: ");
        A = read.nextInt();
        System.out.printf("Digite o valor de B: ");
        B = read.nextInt();
        System.out.printf("Digite o valor de C: ");
        C = read.nextInt();
        soma = A + B;
        if(soma < C){
            System.out.printf("A soma de A+B e menor que C \nSoma: %d \nC: %d\n", soma, C);
        }
        else{
            System.out.printf("A soma de A+B e maior que C \nSoma: %d \nC: %d\n", soma, C);
        }
    }
}
