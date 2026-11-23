
package recursividade;


/**
 * 5. Soma de um Array: Crie um método que receba um array de inteiros e um índice (começando em 0). O método deve percorrer o array de forma recursiva e retornar a soma de todos os elementos. 
 */
public class AtividadeRecursividade_05 {
    static int soma = 0;
    
    
    public static int somaArray(int index, int[] numeros){
        
        if(index >= 9){
            return soma;
        }
        else{
            System.out.printf("|Valor atual: %d| |Soma: %d|",numeros[index], soma);
            soma += numeros[index];
            return somaArray(index + 1, numeros);
        }
        
    }
    public static void main(String args[]) {
        int index = 0;
        int resultado = 0;
        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            numeros[i] = i+1;
        }
        resultado = somaArray(index,numeros);
        System.out.println("\nO resultado da soma atual: " + resultado);
    }
}
