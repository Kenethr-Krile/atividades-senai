
package listawhile;

import java.util.Scanner;

/*
 * @author nando
 */
public class ExercicioLoop_20 {

    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        int num,qtdNum=0,par=0,impar=0,mediaPar=0,mediaGeral=0;
        
        do{
            do{
                System.out.printf("Informe um valor positivo ou digite (0) para finalizar:");
                num = read.nextInt();
            } while(num < 0);
            
            if(num != 0){
                mediaGeral = mediaGeral + num;
                if(num % 2 == 0){
                    par++;
                    mediaPar = mediaPar + num;
                    qtdNum++;
                }
                else{
                    impar++;
                    qtdNum++;
                }
            }
            else{
                System.out.println("Calculo Encerrado.");
            }
        } while(num != 0);
        mediaPar = mediaPar / par;
        mediaGeral = mediaGeral / qtdNum;
        System.out.printf("\nNumeros Pares: %d\nNumeros Impares:%d\nMedia de valores positivos:%d\nMedia Geral:%d\n",par,impar,mediaPar,mediaGeral);
    }
}

