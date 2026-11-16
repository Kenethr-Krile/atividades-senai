
package logicaunidade_i;

import java.util.Scanner;


public class Exercicio_11 {

    
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        float valorCompra,compraParcelada;
        int parcelas;
        
        System.out.printf("Informe o valor da compra: ");
        valorCompra = read.nextFloat();
        System.out.printf("Opcoes de parcelamento de 1 a 5 parcelas: ");
        parcelas = read.nextInt();
        compraParcelada = (valorCompra / parcelas);
        System.out.printf("Valor da Compra: %.2f\nQuantidade de Parcelas: %d\nValor Mensal da Parcela: %.2f\n",valorCompra,parcelas,compraParcelada);
        
        
    }
}
