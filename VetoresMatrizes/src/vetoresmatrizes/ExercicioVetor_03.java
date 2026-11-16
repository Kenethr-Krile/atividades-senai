
package vetoresmatrizes;

import java.util.Scanner;

/**
 Crie uma matriz 4X3. Adicione, informações em seus valores. Depois, mostre
qual é o elemento armazenado em uma linha e coluna X solicitado pelo usuário.
 */
public class ExercicioVetor_03 {

    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        int[][] valores = new int[4][3];
        int linha,coluna,opcao=0;
        
        valores[0][0] = 1;
        valores[0][1] = 2;
        valores[0][2] = 3;
        valores[1][0] = 4;
        valores[1][1] = 5;
        valores[1][2] = 6;
        valores[2][0] = 7;
        valores[2][1] = 8;
        valores[2][2] = 9;
        valores[3][0] = 10;
        valores[3][1] = 11;
        valores[3][2] = 12;
        
        System.out.printf(" 0%d | 0%d | 0%d |\n 0%d | 0%d | 0%d |\n 0%d | 0%d | 0%d |\n %d | %d | %d |\n",valores[0][0],valores[0][1],valores[0][2],valores[1][0],valores[1][1],valores[1][2],valores[2][0],valores[2][1],valores[2][2],valores[3][0],valores[3][1],valores[3][2]);
        do{
            do{
                System.out.printf("Informe a linha que deseja procurar:");
                linha = read.nextInt();
                linha -=1;
            } while (linha > 4 || linha < 0);
            
            do{
                System.out.printf("Informe a coluna que deseja procurar:");
                coluna = read.nextInt();
                coluna -=1;
            } while (coluna > 3 || coluna < 0);
            
            System.out.printf("\nO valor do flerbens encontrado foi: %d",valores[linha][coluna]);
            System.out.printf("\n\nDeseja encontrar algum outro flerbens?\n(0)Nao\n(1)Sim\n<:");
            opcao = read.nextInt();
        } while (opcao != 0);
    }
    
}
