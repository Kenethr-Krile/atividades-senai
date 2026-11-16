
package exerciciocondicional;

/**
 * @author Jose Fernandes dos Santos Neto
 */
public class ExercicioCondicional_07 {

    public static void main(String args[]) {
        
        int num=1,soma=0;
        for (int i = 1 ; i <= 500 ; i++){
            if(num % 3 == 0){
                soma = soma + num;    
            }
            num++;
            
        }
        System.out.printf("A soma: %d\n",soma);
    }
}
