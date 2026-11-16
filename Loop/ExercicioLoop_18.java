
package exerciciocondicional;

import java.util.Scanner;

/**
18. Foi realizada uma pesquisa de algumas características físicas da população de uma certa
região, a qual coletou os seguintes dados referentes a cada habitante para serem analisados:
- sexo (masculino e feminino)
- cor dos olhos (azuis, verdes ou castanhos)
- cor dos cabelos (louros, castanhos, pretos)
- idade
Faça um algoritmo que determine e escreva:
- a maior idade dos habitantes
- a quantidade de indivíduos do sexo feminino cuja idade está entre 18 e 35 anos inclusive e que
tenham olhos verdes e cabelos louros.
 */
public class ExercicioCondicional_18 {

    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        int sexo=0,corOlhos=0,corCabelos=0,idade=0,maiorIdade=0,qtdFemLove=0,opcao=0;
        do {
            do {
                System.out.printf("Informe seu sexo:\n(1)Masculino\n(2)Feminino\n<:");
                sexo = read.nextInt();
            } while(sexo < 1 || sexo > 2);
            do{
                System.out.printf("Informe a cor dos seus olhos:\n(1)Azuis\n(2)Verdes\n(3)Castanhos\n<:");
                corOlhos = read.nextInt();
            } while (corOlhos < 1 || corOlhos > 3);
            do {
                System.out.printf("Informe a cor do seu cabelo:\n(1)Louro\n(2)Castanho\n(3)Preto\n<:");
                corCabelos = read.nextInt();
            } while (corCabelos < 1 || corCabelos > 3);  
            System.out.printf("Informe sua idade:");
            idade = read.nextInt();
            if(maiorIdade < idade){
                maiorIdade = idade;

            }
            if(idade >= 18 && idade <= 35 && corOlhos == 2 && corCabelos == 1 && sexo == 2 ){
                qtdFemLove++;
            }
            System.out.printf("Deseja adicionar outro habitante a base de dados?\n(0)Nao\n(1)Sim\n<:");
            opcao = read.nextInt();
        } while(opcao != 0);
        System.out.printf("\n\nA maior idade entre os habitantes: %d\n",maiorIdade);
        System.out.printf("A quantidade de habitantes que possuem |Olhos Verdes/Cabelo Loiro/Idade entre 18 e 35/Feminino| sao: %d\n",qtdFemLove);
    }
}
