package vetoresmatrizes;

import java.util.Scanner;

public class ExercicioVetor_10 {

    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        int[] vetor = new int [10];
        int produto=0, soma=0;
        
        for (int i = 0; i < 10; i++) {
            System.out.printf("Informe o %do valor:", i+1);
            vetor[i] = read.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if(vetor[i] % 2 == 0 && produto != 0){
                produto = produto * vetor[i];
            }
            if(vetor[i] % 2 !=0){
                soma = soma + vetor[i];
            }
            if(vetor[i] % 2 == 0 && produto == 0){
                produto = vetor[i];
            }
            
        }
        System.out.println(produto);
        System.out.println(soma);
    }
}