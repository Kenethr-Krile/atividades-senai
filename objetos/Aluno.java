
package objetos;

import java.util.Scanner;

public class Aluno {
    String nome;
    double nota1;
    double nota2;
    
    double calcularMedia(){
        double soma = 0;
        soma = nota1 + nota2;
        
        return soma;
    }
    void registrarAluno(){
        
        Scanner read = new Scanner(System.in);
        
        System.out.printf("Informe o nome do Aluno:");
        nome = read.nextLine();
        System.out.printf("Informe a primeira nota do Aluno:");
        nota1 = read.nextDouble();
        System.out.printf("Informe a segunda nota do Aluno:");
        nota2 = read.nextDouble();
        
        read.nextLine();
    }
}
