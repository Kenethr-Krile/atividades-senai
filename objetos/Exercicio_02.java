
package objetos;

public class Exercicio_02 {

    public static void main(String args[]) {
        // Questão 2
        Cachorro husky = new Cachorro();
        husky.nome = "Robson";
        husky.raca = "Husky Siberiano";
        husky.idade = 6;
        
        husky.descrever();
        husky.latir();
        System.out.println("\n\n");        
        
    }
}
