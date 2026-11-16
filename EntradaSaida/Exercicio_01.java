
package logicaunidade_i;

import java.util.Scanner;


public class Exercicio_01 {
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        float salarioMinimo,salarioAtual,qtdSalarios,porcento;
        String cargo;
        System.out.println("Digite seu Cargo: ");
        cargo = read.nextLine();
        System.out.println("Digite seu Salario Atual: ");
        salarioAtual = read.nextFloat();
        System.out.println("Digite o valor do Salario Minimo: ");
        salarioMinimo = read.nextFloat();
        qtdSalarios = (salarioAtual / salarioMinimo);
        System.out.printf("O Cargo: %s \nValor mensal recebido em salarios minimos: %.1f\n", cargo, qtdSalarios);
        porcento = (qtdSalarios * 100);
        System.out.printf("Porcentagem: %.2f%%\n", porcento);
    }
}
