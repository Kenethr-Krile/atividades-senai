
package av2;

import java.util.Scanner;

/*
a) Crie uma classe chamada Produto com os atributos: código (inteiro), nome (string) e preço (float).

d) Implemente uma função ou método para atualizar o preço de um produto buscando-o através do
seu código.
*/

public class Produto {
    int codigo;
    String nome;
    float preco;

    void exibirProdutos(){
        
        System.out.printf("\nCodigo: %d", codigo);
        System.out.printf("\nNome: %s", nome);
        System.out.printf("\nPreco: %.2f", preco);
    }
    void substituirPreco(){
        Scanner read = new Scanner(System.in);
        
        System.out.printf("\n\nInforme o novo preco para o produto:");
        preco = read.nextFloat();
    }
}
