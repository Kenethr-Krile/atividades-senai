
package recursividade;

/**
 * 7. Detector de Palíndromos: Verifique de forma recursiva se uma palavra é um palíndromo (lê-se da mesma forma de trás para frente, como "radar" ou "arara"). Retorne um valor boolean . 
 */

public class AtividadeRecursividade_07 {
    
    public static boolean checandoPalindromo(int inicio, int fim, String nome){
        if (inicio >= fim){
            return true;
        }
        if (nome.charAt(inicio) != nome.charAt(fim)){
            return false;
        }
        return checandoPalindromo (inicio + 1,fim - 1,nome);
    }
    
    public static void main(String[] args) {
        String nome = "reviver";
        int inicio = 0;
        int fim = nome.length() - 1;
        boolean resultado = checandoPalindromo(inicio,fim,nome);
        
        if(resultado == true){
            System.out.println("A palavra informada e palindromo.");
        }
        else{
            System.out.println("A palavra informada nao e um palindromo.");
        }
    }
    

}
