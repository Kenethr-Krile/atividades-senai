
package exerciciocondicional;



/**
 * @author Jose Fernandes dos Santos Neto
 */
public class ExercicioCondicional_01 {
    public static void main(String[] args) {
        float chicoAlt = 1.50f;
        float jucaAlt = 1.10f;
        int ano=0;
        
        while (jucaAlt <= chicoAlt){
            jucaAlt = jucaAlt + 0.03f;
            chicoAlt = chicoAlt + 0.02f;
            ano += 1;
        }
        System.out.printf("Altura de Juca:%.2f\nAltura de Chico:%.2f\nAnos Necessarios:%d\n",jucaAlt,chicoAlt,ano);
    }
    
}
