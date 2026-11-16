
package listaanexocondicional;

import java.util.Scanner;

/**
 *
 * @author José Fernandes dos Santos Neto
 */
public class Questao03 {

    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        int A,B,C;
        System.out.printf("Informe o valor de A:");
        A = read.nextInt();
        System.out.printf("Informe o valor de B:");
        B = read.nextInt();
        if(A == B){
            C = A + B;
        }
        else{
            C = A * B;
        }
        System.out.printf("O valor de C: %d\n", C);
    }
}
