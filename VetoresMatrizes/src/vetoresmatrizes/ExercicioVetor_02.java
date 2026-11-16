
package vetoresmatrizes;

import java.util.Scanner;

/**
 2. Calcular a média das 4 notas de 5 alunos e apresentar quem foi aprovado ou
reprovado
 */
public class ExercicioVetor_02 {

    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        String[] nomes = new String[5];
        float[][] notas = new float[5][4];
        float[] mediaAlunos = new float[5];
        float media=0;
        
        for (int i = 0; i < 5; i++){
            System.out.printf("Informe o nome do %do aluno:",i+1);
            nomes[i] = read.nextLine();
            for (int j = 0; j < 4; j++){
                System.out.printf("Informe a %da nota do aluno:",j+1);
                notas[i][j] = read.nextFloat();
                media += notas[i][j];
            }
            read.nextLine();
            mediaAlunos[i] = media;
            media = 0;    
        }
        for (int i = 0; i < 5; i++){
            System.out.printf("\n%s\n",nomes[i]);
            for (int j = 0; j < 4; j++){
                System.out.printf("Nota %d: %.1f ",j+1,notas[i][j]);
                
                }
            
            System.out.printf("\nMedia: %.1f",mediaAlunos[i]/4);
            if((mediaAlunos[i]/4) >= 7){
                System.out.println("\nAprovado\n");
                    
            }
            else{
                System.out.println("\nReprovado");
            }
        }
        
        
    }
}
