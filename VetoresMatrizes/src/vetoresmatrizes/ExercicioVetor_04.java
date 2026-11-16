
package vetoresmatrizes;

/**
 Escreva uma matriz de 3X2, adicione valores e imprima após concluída, qual é o
maior valor e qual é sua posição na matriz.
 */
public class ExercicioVetor_04 {

    public static void main(String args[]) {
        int[][] valor = new int[3][2];
        int maiorValor=0,menorValor=0,linhaMaior=0,colunaMaior=0,linhaMenor=0,colunaMenor=0, index=0;
        valor[0][0]= 12391239;
        valor[0][1]= 65313231;
        valor[1][0]= 15213214;
        valor[1][1]= 71415412;
        valor[2][0]= 45324512;
        valor[2][1]= 1123412;
        
        for (int i = 0; i < 3; i++){
            for(int j = 0; j < 2; j++){
                if(maiorValor < valor[i][j] || index == 0){
                    maiorValor = valor[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                    
                }
                if(menorValor > valor[i][j] || index == 0){
                    menorValor = valor[i][j];
                    linhaMenor = i;
                    colunaMenor = j;
                    
                }  
                index++;
            }
        }
        System.out.printf("O maior valor registrado: %d\nEncontrado na linha: %d\nEncontrado na coluna: %d\n",maiorValor,linhaMaior+1,colunaMaior+1);
        System.out.printf("\nO menor valor registrado: %d\nEncontrado na linha: %d\nEncontrado na coluna: %d\n",menorValor,linhaMenor+1,colunaMenor+1);
    }
}
