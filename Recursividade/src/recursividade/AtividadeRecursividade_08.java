
package recursividade;

import java.util.Scanner;

/**
 *  8. Potenciação (Exponenciação): Crie um método que calcule xy (base x elevada à potência y ) usando apenas multiplicações e recursão.
 */
public class AtividadeRecursividade_08 {
   
    public static int potenciacao(int baseInicial,int base, int potencia){    
        if (potencia <= 1){
            return base;
        }
        else{
            return potenciacao(baseInicial, base * baseInicial, potencia - 1);
        }
    }
    public static void main(String args[]) { 
        Scanner read = new Scanner(System.in);
        System.out.printf("Informe o valor para a base do calculo:");
        int base = read.nextInt();
        System.out.printf("Informe a potencia para o calculo:");
        int potencia = read.nextInt();
        int baseInicial = base;
        
        
        System.out.println(potenciacao(baseInicial,base,potencia));
    }
}
