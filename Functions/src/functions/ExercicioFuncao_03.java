
package functions;

import java.util.Scanner;

/*
3- Faça uma função que recebe a idade de uma pessoa em anos, meses e dias
e retorna essa idade expressa em dias.
 */
public class ExercicioFuncao_03 {
    
    public static int idadeDias(int anos,int meses, int dias) {
        dias = ( (anos * 365) + (meses * 30) + dias);
        return dias;
    }
    
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        int anos,meses,dias,resultado;
        
        System.out.println("No questionamento a seguir informe sua idade em anos, quantos meses ja passaram ate seu proximo aniversario e por ultimo os valores que nao encaixarem em meses informe em dias.");
        System.out.printf("Informe quantos anos voce tem: ");
        anos = read.nextInt();
        System.out.printf("informe quantos meses:");
        meses = read.nextInt();
        System.out.printf("Informe quantos dias:");
        dias = read.nextInt();
        resultado = idadeDias(anos,meses,dias);
        System.out.println("A sua idade calculada em dias seria " + resultado);
        
    }
}
