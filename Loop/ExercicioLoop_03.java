
package exerciciocondicional;

/*
 * @author Jose Fernandes dos Santos Neto
 */
public class ExercicioCondicional_03 {

    public static void main(String args[]) {
        int num = 1000,resto,qtd=0;
        for (int i = 1000; i < 2000; i++){
            resto = (num % 11);
            if(resto == 5){
                System.out.println(num);
                qtd +=1;
            }
            num += 1;
        }
        System.out.println(qtd);
    }
}
