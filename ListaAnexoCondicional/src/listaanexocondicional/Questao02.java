
package listaanexocondicional;

import java.util.Scanner;

/**
 *
 * @author josé Fernandes dos Santos Neto
 */
public class Questao02 {
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        String nome;
        int anosCasada,sexo,estadoCivil;
        
        System.out.printf("Informe seu nome completo: ");
        nome = read.nextLine();
        System.out.printf("Qual o seu sexo:\n\n(0)Masculino\n(1)Feminino\n<:");
        sexo = read.nextInt();
        System.out.printf("Qual o seu estado civil: \n\n(0)Solteiro(a)\n(1)Casado(a)\n<:");
        estadoCivil = read.nextInt();
        
        if(estadoCivil == 1 && sexo == 1){
            System.out.printf("Quantos anos de casamento? : ");
            anosCasada = read.nextInt();
            System.out.printf("\n\nNome: %s \nSexo:Feminino \nEstado Civil: Casada \nAnos de Casamento: %d\n",nome,anosCasada);
        }
        else if(estadoCivil == 0 && sexo == 1){
            System.out.printf("\n\nNome: %s \nSexo:Feminino \nEstado Civil: Solteira \n",nome);
        }
        else if(estadoCivil == 0 && sexo == 0){
            System.out.printf("\n\nNome: %s \nSexo:Masculino \nEstado Civil: Solteiro \n",nome);
        }
        else if(estadoCivil == 1 && sexo == 0){
            System.out.printf("\n\nNome: %s \nSexo:Masculino \nEstado Civil: Casado \n",nome);
        }
        else{
            System.out.println("Nao foi possivel processar sua informacao.");
        }
       
        
    }
}
