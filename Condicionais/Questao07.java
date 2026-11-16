
package listaanexocondicional;

import java.util.Scanner;

/**
 *
 * @author Jose Fernandes dos Santos Neto
 */
public class Questao07 {
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        int numero;
        System.out.printf("Informe um valor: ");
        numero = read.nextInt();
        
        if(numero >=100 && numero <=200){
            System.out.printf("O numero se encontra entre 100 a 200\nNumero Escolhido: %d\n",numero);
        }
        else{
            System.out.printf("O numero se encontra fora do intervalo de 100 a 200\nNumero Escolhido: %d\n",numero);
        }
    }
}