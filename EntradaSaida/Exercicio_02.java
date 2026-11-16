
package logicaunidade_i;

import java.util.Scanner;


public class Exercicio_02 {
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        String nome;
        float salario,comiPercentual,vendasTotal,salarioFinal;
        System.out.println("Digite o nome do vendedor: ");
        nome = read.nextLine();
        System.out.println("Digite o salario fixo do vendedor: ");
        salario = read.nextFloat();
        System.out.println("Digite o valor em reais da comissao: ");
        vendasTotal = read.nextFloat();
        salarioFinal = salario+vendasTotal;
        comiPercentual = ((vendasTotal / salario) * 100 );
        System.out.printf("Nome: %s \nSalario Fixo: %.2f\nValor da Comissao: %.2f\nPorcentagem da Comissao: %.2f%%\nSalario Final: %.2f",nome,salario,vendasTotal,comiPercentual,salarioFinal);
        
    }
}
