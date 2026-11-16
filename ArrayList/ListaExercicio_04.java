
package arraylist;

import java.util.ArrayList;
import java.util.List;

public class ListaExercicio_04 {
    public static void main(String[] args) {
        
        List<Integer> inteiro = new ArrayList<>();
       
        inteiro.add(1);
        inteiro.add(2);
        inteiro.add(3);
        inteiro.add(4);
        inteiro.add(5);
        
        int inverter = inteiro.size() - 1;
        
        for (int i = 0; i < inteiro.size() ; i++) {
            System.out.println(inteiro.get(i));
        }
        System.out.printf("\n\n");
        for (int i = 0; i < inteiro.size() / 2; i++) {
            int temp = inteiro.get(i);
            inteiro.set(i,inteiro.get(inverter));
            inteiro.set(inverter, temp);
            inverter--;
        }
        for (int i = 0; i < inteiro.size() ; i++) {
            System.out.println(inteiro.get(i));
        }
    }
}
