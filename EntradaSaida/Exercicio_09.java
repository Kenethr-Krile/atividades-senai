
package logicaunidade_i;

import java.util.Scanner;


public class Exercicio_09 {

    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        String nomeAluno;
        float nota1,nota2,nota3,media;
        System.out.printf("Informe seu nome: ");
        nomeAluno = read.nextLine();
        System.out.printf("Digite a sua nota na primeira avaliacao: ");
        nota1 = read.nextFloat();
        System.out.printf("Digite a sua nota na segunda avaliacao: ");
        nota2 = read.nextFloat();
        System.out.printf("Digite a sua nota na terceira avaliacao: ");
        nota3 = read.nextFloat();
        media = (nota1+nota2+nota3) / 3;
        System.out.printf("Nome do Aluno: %s\nMedia: %.1f\n",nomeAluno,media);
        
    }
}
