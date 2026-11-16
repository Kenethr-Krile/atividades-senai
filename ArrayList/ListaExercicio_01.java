
package arraylist;
import java.util.ArrayList;
import java.util.List;

public class ListaExercicio_01 {
    
    public static void main(String[] args) {
        int maiorValor = 0;
        int posicao = 0;
        
        List<Integer> inteiros = new ArrayList<>();
        
        inteiros.add(4);
        inteiros.add(1);
        inteiros.add(3);
        inteiros.add(7);
        inteiros.add(13);
        inteiros.add(6);
        inteiros.add(-5);
        inteiros.add(9);
        
        for (int i = 0; i < inteiros.size(); i++) {
            if(inteiros.get(i) > maiorValor){
                maiorValor = inteiros.get(i);
                posicao = i;
            }
        }
        System.out.printf("Valor: %d\nPosicao:%d\n", maiorValor, posicao);
    }
}
