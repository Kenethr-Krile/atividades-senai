package logicaunidade_i;

import java.util.Scanner;

public class Exercicio_08 {
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        float consumoMedio,distTotal,combGasto; // variaveis do programa
        System.out.printf("Informe a distancia total percorrida: ");
        distTotal = read.nextFloat(); // leitura da distancia total
        System.out.printf("Informe o combustivel total gasto: ");
        combGasto = read.nextFloat(); // leitura do combustivel gasto
        consumoMedio = (distTotal / combGasto);
        System.out.printf("Consumo medio do automovel: %.2f(Km/l)", consumoMedio);
         
    }
}
