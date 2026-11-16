
package listaanexocondicional;

import java.util.Scanner;

/**
 * @author José Fernandes dos Santos Neto
 */
public class Questao09 {

    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        int idade;
        System.out.printf("Nadador, informe sua idade:");
        idade = read.nextInt();
        if(idade >=5 && idade <= 7){
            System.out.printf("Idade do Nadador: %d\nCategoria: Infantil A\n",idade);
        }
        else if(idade >=8 && idade <=10){
            System.out.printf("Idade do Nadador: %d\nCategoria: Infantil B\n",idade);
        }
        else if(idade >=11 && idade <=13){
            System.out.printf("Idade do Nadador: %d\nCategoria: Juvenil A\n",idade);
        }
        else if(idade >=14 && idade <=17){
            System.out.printf("Idade do Nadador: %d\nCategoria: Juvenil B\n",idade);
        }
        else if(idade >=18 && idade <=25){
            System.out.printf("Idade do Nadador: %d\nCategoria: Senior\n",idade);
        }
        else{
            System.out.println("Idade fora da faixa etaria");
            System.exit(0);
        }
    }
}
