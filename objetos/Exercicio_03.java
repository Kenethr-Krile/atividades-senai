
package objetos;

import java.util.Scanner;

public class Exercicio_03 {

    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        
        // Questão 3
        Livro[] livros = new Livro[3];
        for (int i = 0; i < 3; i++) {
            
            livros[i] = new Livro();
            
            System.out.printf("Informe o titulo do %do livro:",i+1);
            livros[i].titulo = read.nextLine();
            System.out.printf("Informe o autor do %do livro:",i+1);
            livros[i].autor = read.nextLine();
            System.out.printf("Informe o numero de páginas do %do livro:",i+1);
            livros[i].numeroPaginas = read.nextInt();
            read.nextLine();
        }
        System.out.println("\n\n");
        for (int i = 0; i < 3; i++) {
            livros[i].descrever();
        }
    }
}
