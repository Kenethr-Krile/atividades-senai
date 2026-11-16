
package arraylist;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaExercicio_02 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        List<Integer> inteiro = new ArrayList<>();
        int soma=0;
        
        System.out.println("Informe 10 inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("<:");
            int valor = read.nextInt();
            inteiro.add(valor);
            soma += valor;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(inteiro.get(i));
        }
        System.out.printf("O valor da soma: %d\n\n", soma);
    }
}
