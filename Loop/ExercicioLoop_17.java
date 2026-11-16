
package listawhile;

import java.util.Scanner;

/**
 * @author nando
 */
public class ExercicioLoop_17 {
    
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        int opcao,candidato1=0,candidato2=0,candidato3=0,candidato4=0,nulo=0,branco=0,totalVotos=0;
        
        do{
            System.out.printf("Escolha uma das opcoes abaixo:\n(0)Sair\n(1)Candidato 1\n(2)Candidato 2\n(3)Candidato 3\n(4)Candidato 4\n(5)Voto nulo\n(6)Voto em branco\n<:");
            opcao = read.nextInt();
            switch (opcao){
                case 1:
                    candidato1++;
                    break;
                case 2:
                    candidato2++;
                    break;
                case 3:
                    candidato3++;
                    break;
                case 4:
                    candidato4++;
                    break;
                case 5:
                    nulo++;
                    break;
                case 6:
                    branco++;
                    break;

            }
        } while(opcao != 0);
        totalVotos = candidato1+candidato2+candidato3+candidato4+nulo+branco;
        System.out.printf("O total de votos dessa eleicao: %d\nO total de votos do Candidato 1: %d\nO total de votos do Candidato 2: %d\nO total de votos do Candidato 3: %d\nO total de votos do Candidato 4: %d\nO total de votos nulo: %d\nO total de votos em branco: %d\n",totalVotos,candidato1,candidato2,candidato3,candidato4,nulo,branco);
    }
}
