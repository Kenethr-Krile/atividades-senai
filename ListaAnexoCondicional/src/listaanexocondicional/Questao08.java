
package listaanexocondicional;

import java.util.Scanner;

/**
 * @author Jose Fernandes dos Santos Neto
 */
public class Questao08 {

    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        float IMC,peso,altura;
        System.out.printf("Informe seu peso em KG (Exemplo: 59,5):");
        peso = read.nextFloat();
        System.out.printf("Informe sua Altura em M (Exemplo: 1,75):");
        altura = read.nextFloat();
        IMC = (peso / (altura * altura));
        if(IMC < 20){
            System.out.printf("IMC: %.1f \nAbaixo do Peso\n ",IMC);
        }
        else if(IMC >= 20 && IMC < 25){
            System.out.printf("IMC: %.1f \nPeso Normal\n ",IMC);
        }
        else if(IMC >= 25 && IMC < 30){
            System.out.printf("IMC: %.1f \nSobre Peso\n ",IMC);
        }
        else if(IMC >= 30 && IMC < 40){
            System.out.printf("IMC: %.1f \nObeso\n ",IMC);
        }
        else{
            System.out.printf("IMC: %.1f \nObeso Morbido\n ",IMC);
        }
    }
}
