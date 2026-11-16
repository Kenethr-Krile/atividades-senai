
package vetoresmatrizes;

/**
 Crie um algoritmo que crie 3 matrizes. 2, 2X2 e 1 4x3. Adicione valores inteiros
nas duas primeiras matrizes aleatoriamente. A terceira matriz deve ser a soma do
valor do VetA[1][1] com VetB[1][1]
Exemplo: VetA[1][1] = 1 | VetB[1][1] = 5 | VetC[1][3] = 6 (soma de VetC[1][1]
+ VetC[1][2] = VetC[1][3]
 */
public class ExercicioVetor_05 {

    public static void main(String args[]) {
        int[][] vetA = new int[2][2];
        int[][] vetB = new int[2][2];
        int[][] vetC = new int[4][3];
        int linha=0;
        vetA[0][0] = 4;
        vetA[0][1] = 1;
        vetA[1][0] = 5;
        vetA[1][1] = 7;
        vetB[0][0] = 9;
        vetB[0][1] = 3;
        vetB[1][0] = 6;
        vetB[1][1] = 2;
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                vetC[linha][0] = vetA[i][j];
                vetC[linha][1] = vetB[i][j];
                vetC[linha][2] = vetA[i][j] + vetB[i][j];
                linha++;
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf(" %d ",vetC[i][j]);        
            }
            System.out.println("");
        }
        
    }
}

/*public class ExercicioVetor_05 {

    public static void main(String args[]) {
        int[][] matA = new int[3][3];
        int[][] matB = new int[3][3];
        int[][] matC = new int[9][3];
        matA[0][0]=1;
        matA[0][1]=2;
        matA[0][2]=3;
        matA[1][0]=4;
        matA[1][1]=5;
        matA[1][2]=6;
        matA[2][0]=7;
        matA[2][1]=8;
        matA[2][2]=9;
        matB[0][0]=9;
        matB[0][1]=8;
        matB[0][2]=7;
        matB[1][0]=6;
        matB[1][1]=5;
        matB[1][2]=4;
        matB[2][0]=3;
        matB[2][1]=2;
        matB[2][2]=1;
        
        int linha = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matC[linha][0] = matA[i][j];
                matC[linha][1] = matB[i][j];
                matC[linha][2] = matA[i][j]+ matB[i][j];
                linha++;
                
            }
        }
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf(" %d ",matC[i][j]);
            }
            System.out.println("");    
        }
        
    }
}
*/