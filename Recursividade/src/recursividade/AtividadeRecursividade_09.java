
package recursividade;

import java.util.Scanner;

/*

9. Busca Binária Recursiva: Implemente o algoritmo de busca binária para encontrar um
número dentro de um array previamente ordenado. O método deve ajustar os índices inicio e
fim a cada chamada recursiva e retornar a posição do elemento (ou -1 se não for encontrado).
 
 */

public class AtividadeRecursividade_09 {
    public static int buscaBinaria(int inicio, int fim, int valorProcura, int[] valores){
      
            if(valores[inicio] == valorProcura){
                return inicio;
            }
            if(valores[fim] == valorProcura){
                return fim;
            }
            if(inicio >= fim){
                return -1;
            }
            
            return buscaBinaria(inicio + 1, fim - 1, valorProcura, valores);
        
        
    }
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        int[] valores = new int[15];
        int inicio = 0;
        int fim = valores.length - 1;
       
       
        for (int i = 0; i < valores.length; i++) {
            valores[i] = i * 2;
        }
        System.out.printf("Informe o valor que procura dentro da lista:");
        int valorProcura = read.nextInt();
        
        int resultado = buscaBinaria(inicio,fim,valorProcura,valores);
        
        if(resultado == -1){
            for (int i = 0; i < valores.length; i++) {
                System.out.printf("| %d |",valores[i]);
            }
            System.out.printf("\nValor nao foi encontrado na lista!!\n");
        }
        else{
            for (int i = 0; i < valores.length; i++) {
                System.out.printf("| %d |",valores[i]);
            }
            System.out.println("\nIndice: " + resultado);
        }
    }
}
