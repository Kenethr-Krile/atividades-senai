
package listaanexocondicional;

import java.util.Scanner;

/**
 *
 * @author José Fernandes dos Santos Neto
 */
public class Questao06 {
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        float nota1,nota2,media;
        System.out.printf("Informe sua primeira nota: ");
        nota1 = read.nextFloat();
        System.out.printf("Informe sua segunda nota: ");
        nota2 = read.nextFloat();
        media = (nota1 + nota2) / 2;
        if(media >= 7){
            System.out.printf("Aprovado \nMedia: %.1f",media);
        }
        else if (media >=5 && media < 7){
            System.out.printf("Em Recuperacao \nMedia: %.1f",media);
        }
        else{
            System.out.printf("Reprovado \nMedia: %.1f",media);
        }
    }
}
