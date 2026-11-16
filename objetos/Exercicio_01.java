
package objetos;

import java.util.Scanner;

public class Exercicio_01 {

  
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        
        // Questão 1
        Produto martelo = new Produto();
        martelo.nome = "martelo";
        martelo.preco = 10;
        System.out.println(martelo.nome);
        System.out.printf("R$ %.2f\n\n",martelo.preco);
        
    }
}
