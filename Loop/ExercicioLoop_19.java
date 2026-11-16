/**
 * 19. Foi feita uma pesquisa entre os habitantes de uma região. Foram coletados os dados de idade,
sexo (M/F) e salário. Faça um algoritmo que informe:
a) a média de salário do grupo;
b) maior e menor idade do grupo;
c) quantidade de homens com salário até R$ 2000,00.
 */

package exerciciocondicional;

import java.util.Scanner;


public class ExercicioCondicional_19 {

    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        int idade,sexo,opcao=0;
        int qtdHabitantes=0,qtdMaleSalary=0,maiorIdade=0,menorIdade=0;
        float salario,mediaSalario=0;
        
        do{
            System.out.printf("Informe sua idade:");
            idade = read.nextInt();
            do{
                System.out.printf("Informe seu sexo: \n(1)Masculino\n(2)Feminino\n<:");
                sexo = read.nextInt();
                if(sexo < 1 || sexo > 2){
                    System.out.println("Informacao incorreta, tente novamente!");
                }
            } while(sexo < 1 || sexo > 2);
            System.out.printf("Informe seu salario:");
            salario = read.nextFloat();
            mediaSalario += salario;
            if(idade < menorIdade || qtdHabitantes == 0){
                menorIdade = idade;
            }
            if(idade > maiorIdade || qtdHabitantes == 0){
                maiorIdade = idade;
            }
            if(sexo == 1 && salario <= 2000.00f){
                qtdMaleSalary++;
            }
            qtdHabitantes++;
            System.out.printf("Deseja inserir mais algum habitante ao banco de dados?\n(0)Nao\n(1)Sim\n<:");
            opcao = read.nextInt();
        } while (opcao !=0);
        mediaSalario = mediaSalario / qtdHabitantes;
        System.out.printf("\nA media Salarial do grupo de habitantes: %.2f",mediaSalario);
        System.out.printf("\nA maior idade do grupo: %d\nA menor idade do grupo:%d",maiorIdade,menorIdade);
        System.out.printf("\nA quantidade de habitantes do sexo masculino que recebem ate 2000,00: %d\n",qtdMaleSalary);
    }
}
