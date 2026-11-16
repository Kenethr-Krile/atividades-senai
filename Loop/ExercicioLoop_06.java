
package exerciciocondicional;

import java.util.Scanner;

/**
 * @author Jose Fernandes dos Santos Neto
 */
public class ExercicioCondicional_06 {

    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        char sex;
        do {
            System.out.printf("Informe seu sexo (M)(F)(I):");
            sex = read.next().charAt(0);
            sex = Character.toUpperCase(sex);
            if(sex != 'M' && sex != 'F' && sex != 'I'){
                System.out.printf("Informacao incorreta, tente novamente\n");
            }
        } while(sex != 'M' && sex != 'F' && sex != 'I');
        System.out.println("Sexo Informado: " + sex);
    }
}
