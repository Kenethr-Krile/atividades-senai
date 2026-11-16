
package functions;

import java.util.Scanner;

/*
 1- Escreva uma função que recebe as 3 notas de um aluno por parâmetro e uma
letra. Se a letra for A o procedimento calcula a média aritmética das notas do
aluno, se for P, a sua média ponderada (pesos: 5, 3 e 2). A média calculada
também deve retornar por parâmetro.
 */
public class ExercicioFuncao_01 {

    public static float calcularMedia (float nota1, float nota2, float nota3,char letra){
        float media=0;
        if(letra == 'a' || letra == 'A'){
            media = (nota1 + nota2 + nota3) / 3;
        }
        else if (letra == 'p' || letra == 'P'){
            media = ( ((nota1 * 5) + (nota2 * 3) + (nota3 * 2)) ) / 10;
        }
        return media;
    }
    public static void main(String[] args) {
       
        Scanner read = new Scanner(System.in);
        float nota1,nota2,nota3;
        float media;
        char letra;
        
        System.out.printf("Informe a primeira nota do aluno: ");
        nota1 = read.nextInt();
        System.out.printf("Informe a segunda nota do aluno: ");
        nota2 = read.nextInt();
        System.out.printf("Informe a terceira nota do aluno: ");
        nota3 = read.nextInt();
        System.out.printf("Informe o tipo de media:\n(P)onderada\n(A)ritmetica\n<: ");
        letra = read.next().charAt(0);
        media = calcularMedia(nota1,nota2,nota3,letra);
        System.out.printf("A media do aluno: %.1f\n", media);
       
    }
    
}
