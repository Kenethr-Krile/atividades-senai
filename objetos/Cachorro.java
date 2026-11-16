
package objetos;

public class Cachorro {
    String nome;
    String raca;
    int idade;
    
    void latir(){
        System.out.printf("O cachorro %s latiu (Au au!)\n",nome); 
    }
    void descrever(){
        System.out.printf("Nome:%s\nRaca:%s\nIdade:%d\n",nome,raca,idade);
    }
}
