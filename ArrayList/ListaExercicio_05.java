
package arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaExercicio_05 {
    public static void main(String[] args) {
        int divisor = 0;
       
        Scanner read = new Scanner(System.in);
        List<Integer> inteiro = new ArrayList<>();
        
        System.out.println("Informe 10 numeros inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("<:");
            int valor = read.nextInt();
            inteiro.add(valor);            
        }
        
        System.out.printf("Informe um valor inteiro e positivo:");
        divisor = read.nextInt();
        System.out.printf("Numeros divisiveis por %d:\n", divisor);
        for (int i = 0; i < inteiro.size(); i++) {  
            if (inteiro.get(i) % divisor == 0){
                System.out.printf("| %d |", inteiro.get(i));
            }
        }
        System.out.printf("\n\n");
        System.out.printf("Resultado dessas divisoes:\n");
        for (int i = 0; i < inteiro.size(); i++) {
            if(inteiro.get(i) % divisor == 0){
                System.out.printf("| %d |", inteiro.get(i) / divisor);    
            }    
        }
    }
}
