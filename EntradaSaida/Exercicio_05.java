
package logicaunidade_i;

import java.util.Scanner;


public class Exercicio_05 {

   
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        String nome,sobrenome;
        System.out.printf("Digite o seu Primeiro Nome: ");
        nome = read.nextLine();
        System.out.printf("Digite o seu Sobrenome: ");
        sobrenome = read.nextLine();
        System.out.printf("Nome Completo: " + nome + " " + sobrenome + "\n");
        
        
    }
}
