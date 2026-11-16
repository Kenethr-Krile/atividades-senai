
package av2;

import java.util.Scanner;

/*
Implemente um programa que leia a idade de 5 pessoas e classifique cada idade nas categorias abaixo
e exiba a quantidade total em cada uma: (1 ponto)
a) Criança: 0 a 12 anos
b) Adolescente: 13 a 17 anos
c) Adulto: 18 a 59 anos
d) Idoso: 60 anos ou mais
 */

public class Av2Questao_02 {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);    
        int[] idadePessoa = new int[5];
        int qttChild = 0,qttTeen = 0,qttAdult = 0,qttOld = 0;
        for (int i = 0; i < idadePessoa.length; i++) {
            System.out.printf("Informe a idade da %da pessoa:", i+1);
            idadePessoa[i] = read.nextInt();
            
            if(idadePessoa[i] < 0){
                do{
                    System.out.println("Idade impossivel, tente novamente!");
                    System.out.printf("Informe a idade da %da pessoa", i+1);
                    idadePessoa[i] = read.nextInt();
                } while (idadePessoa[i] < 0);
            }
            else if(idadePessoa[i] >= 0 && idadePessoa[i] <= 12){
                qttChild +=1;
            }
            else if(idadePessoa[i] >= 13 && idadePessoa[i] <= 17){
                qttTeen +=1;
            }
            else if(idadePessoa[i] >= 18 && idadePessoa[i] <= 59){
                qttAdult +=1;
            }
            else{
                qttOld +=1;
            }
        }
        System.out.println("\nIdades informadas:");
        for (int i = 0; i < idadePessoa.length; i++) {
            System.out.printf("| %d | ",idadePessoa[i]);
        }
        System.out.printf("\n\nA classificacao final representada:\nCriancas:%d\nAdolescentes:%d\nAdulto:%d\nIdoso:%d\n\n",qttChild,qttTeen,qttAdult,qttOld);
    }    
}
