
package recursividade;

/**
 *6. Inversão de String: Faça um método que receba uma String e a retorne invertida (Ex: "java" se torna "avaj").
 */
public class AtividadeRecursividade_06 {

    public static String stringReversa(String nome){
        char letraFinal = nome.charAt(0);
        String restante = nome.substring(1);
        if(nome.length() <= 1){
            return nome;
        }
        else return stringReversa(restante) + letraFinal;
    }
    
    public static void main(String args[]) {
        String nome = "Miragem";

        System.out.println(nome);
        nome = stringReversa(nome);
        System.out.println(nome);
    }
}
