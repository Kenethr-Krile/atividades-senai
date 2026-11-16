
package listaanexocondicional;

import java.util.Scanner;

/**
 * @author José Fernandes dos Santos Neto
 */
public class Questao10 {

    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        float salario,financiamento,salarioMulti;
        System.out.printf("Informe seu Salario Mensal: ");
        salario = read.nextFloat();
        System.out.printf("Informe o valor que pretende financiar: ");
        financiamento = read.nextFloat();
        salarioMulti = salario * 5;
        if(financiamento <= salarioMulti){
            System.out.printf("Financiamento Concedido\nSalario: %.2f \nFinanciamento Solicitado: %.2f\nLimite de Credito: %.2f\n",salario,financiamento,salarioMulti);
        }
        else{
            System.out.printf("Financiamento Negado\nSalario: %.2f \nFinanciamento Solicitado: %.2f\nLimite de Credito: %.2f\n",salario,financiamento,salarioMulti);
        }
    }
}
