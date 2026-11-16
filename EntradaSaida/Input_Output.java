
package logicaunidade_i;

import java.util.Scanner;

public class Input_Output {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        float nota1, nota2, media;
        String nome;
        
        System.out.println("Digite seu nome: ");
        nome = read.nextLine();
        System.out.println("Digite a nota 1: ");
        nota1 = read.nextFloat();
        System.out.println("Digite a nota 2: ");
        nota2= read.nextFloat();
        media = (nota1+nota2) / 2;
        System.out.printf("A media das notas de %s : %.1f ", nome, media );
  
    }
}
