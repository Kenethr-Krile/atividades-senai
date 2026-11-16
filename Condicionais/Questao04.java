
package listaanexocondicional;

import java.util.Scanner;

/**
 *
 * @author José Fernandes dos Santos Neto
 */
public class Questao04 {
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        float nota1,nota2,media;
        System.out.printf("Informe sua primeira nota: ");
        nota1 = read.nextFloat();
        System.out.printf("Informe sua segunda nota: ");
        nota2 = read.nextFloat();
        media = (nota1+nota2) / 2;
        if(media >= 5){
            System.out.printf("Parabens voce esta aprovado:\nMedia:%.1f\n",media);    
        }
        else{
            System.out.printf("Infelizmente voce foi reprovado: \nMedia:%.1f\n",media);
    }
    }
}
