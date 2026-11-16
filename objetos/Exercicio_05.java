
package objetos;

import java.util.Scanner;

public class Exercicio_05 {
    
    public static void mediaAluno(){
        
        Scanner read = new Scanner(System.in);
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        String maiorAluno;
        double maiorMedia;
        
        aluno1.registrarAluno();
        aluno2.registrarAluno();
        
        maiorMedia = aluno1.calcularMedia();
        maiorAluno = aluno1.nome;
        if(maiorMedia < aluno2.calcularMedia()){
            maiorMedia = aluno2.calcularMedia();
            maiorAluno = aluno2.nome;
        }
        System.out.printf("O aluno com a maior media: %s\nMedia do Aluno: %.1f\n",maiorAluno,maiorMedia);
    }
    
    
    public static void main(String args[]) {
        mediaAluno();
    }
}
