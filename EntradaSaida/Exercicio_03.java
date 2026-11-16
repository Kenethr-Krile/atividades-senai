
package logicaunidade_i;

import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in); 
        float Celsius,Fahrenheit;
        System.out.printf("Informe a temperatura em Celsius: ");
        Celsius = read.nextFloat();
        Fahrenheit = ((9 * Celsius) + 160) / 5;
        System.out.printf("Temperatura em Celsius: %.2f \nTemperatura em Fahrenheit: %.2f ", Celsius, Fahrenheit);
    }
}
