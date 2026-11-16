
package listawhile;

import java.util.Scanner;

/**
 * @author nando
 */
public class ExercicioLoop_16 {

    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        float salario,maiorSalario = 0,salarioTotal=0,mediaSalario=0,porcentagemSalario,salarioBaixo=0,qtdSalario=0;
        int filho,qtdFilhos=0,filhosTotal=0,mediaFilhos=0,opcao;
        do{
            System.out.printf("Informe o seu salario:");
            salario = read.nextFloat();
            qtdSalario++;
            salarioTotal = salarioTotal + salario;
            System.out.printf("Informe a quantidade de filhos:");
            filho = read.nextInt();
            filhosTotal = filhosTotal + filho;
            qtdFilhos++; 
            if (salario > maiorSalario){
                maiorSalario = salario;
            }
            if(salario <= 1000.00){
                salarioBaixo++;
            }
            System.out.printf("Deseja inserir os dados de outro usuario?\n(0)Nao\n(1)Sim\n<:");
            opcao = read.nextInt();
        } while(opcao != 0);
        mediaFilhos = filhosTotal / qtdFilhos;
        mediaSalario = salarioTotal / qtdSalario;
        porcentagemSalario = (salarioBaixo / qtdSalario) * 100;
        System.out.printf("media salarial da populacao: %.2f\nmedia de filhos da populacao: %d\npercentual de pessoas com salario abaixo de 1000,00: %.1f%%\nMaior salario entre a populacao:%.2f\n",mediaSalario,mediaFilhos,porcentagemSalario,maiorSalario);
    }
}
