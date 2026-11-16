
package arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaExercicio_03 {
    public static void main(String[] args) {
        int soma = 0, multi = 0;
        Scanner read = new Scanner(System.in);
        List<Integer> inteiro = new ArrayList<>();
        
        System.out.printf("Informe 10 numeros inteiros:\n");
        for (int i = 0; i < 10; i++) {
            System.out.printf("<:");
            int valor = read.nextInt();
            inteiro.add(valor);
            if(valor % 2 == 0){
                if(multi == 0){
                    multi += valor;
                }
                else{
                    multi = multi * valor;
                }
            }
            else{
                soma += valor;
            }
        }
        System.out.println("A multiplicacao dos pares:" + multi);
        System.out.println("A soma dos Impares:" + soma);
    }
}
