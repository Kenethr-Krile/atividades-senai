
package av2;

import java.util.Scanner;

/*
Implemente uma função chamada calcularFatorial que receba um número inteiro e retorne o seu
fatorial. No programa principal, peça ao usuário para informar um número e exiba o fatorial
utilizando a função. (1,5 ponto)
 */

public class Av2Questao_04 {
    
    static int calcularFatorial(int valorFatorial){
        int resultado = 0;
        for (int i = valorFatorial; i > 0; i--) {
            if(resultado == 0){
                resultado = i;
            }
            else{
                resultado = resultado * i;
            }
        }     
        return resultado;
    }
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int valorFatorial;
        int fatorial;
        
        System.out.printf("Informe o numero inteiro para fatorial: ");
        valorFatorial = read.nextInt();
        fatorial = calcularFatorial(valorFatorial);
        System.out.println(fatorial);
    }
}
