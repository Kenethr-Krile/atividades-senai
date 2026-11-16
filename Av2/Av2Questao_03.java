
package av2;

import java.util.Scanner;

/*

3. Desenvolva um programa que gerencie o cadastro de produtos utilizando classes e objetos. (1,5 ponto)

a) Crie uma classe chamada Produto com os atributos: código (inteiro), nome (string) e preço (float).

b) Leia as informações de 3 produtos, instanciando os objetos e armazenando-os em um vetor (ou
lista).

c) Exiba os produtos cadastrados com formato organizado (sugere-se a criação de um método na
classe para a exibição dos dados).

d) Implemente uma função ou método para atualizar o preço de um produto buscando-o através do
seu código.

*/
public class Av2Questao_03 {
    
    static void atualizarPreco(Produto[] produtoLoja){
        Scanner read = new Scanner(System.in);
        int codigoTroca;
        
        System.out.printf("Informe o codigo do produto:");
        codigoTroca = read.nextInt();
        for (int i = 0; i < produtoLoja.length; i++) {
            if(produtoLoja[i].codigo == codigoTroca){
                System.out.println("Produto localizado");
                produtoLoja[i].exibirProdutos();
                produtoLoja[i].substituirPreco();
                System.out.println("Preco foi atualizado!");
                produtoLoja[i].exibirProdutos();
            }
        }
        
    }
    
    static void exibicao(Produto[] produtoLoja){
        
        for (int i = 0; i < produtoLoja.length; i++) {
            System.out.printf("\n\nProduto cadastrado %d:", i+1);
            produtoLoja[i].exibirProdutos();
        }
    }
    
    static void menu(Produto[] produtoLoja){
        Scanner read = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.printf("\n\nMenu interativo:\n(1)Exibir produtos cadastrados\n(2)Atualizar preco de um produto\n(3)Sair\n<:");
            opcao = read.nextInt();
            switch(opcao) {
                case 1 -> exibicao(produtoLoja);
                case 2 -> atualizarPreco(produtoLoja);
                case 3 -> System.out.printf("Programa finalizado!!\n\n");
            }
        } while (opcao != 3);
    }
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Produto[] produtoLoja = new Produto[3];
        
        for (int i = 0; i < produtoLoja.length; i++) {
            produtoLoja[i] = new Produto();
            System.out.printf("Informe o codigo do produto:");
            produtoLoja[i].codigo = read.nextInt();
            read.nextLine();
            System.out.printf("Informe o nome do produto:"); 
            produtoLoja[i].nome = read.nextLine();
            System.out.printf("Informe o preco do produto:");
            produtoLoja[i].preco = read.nextFloat();
        }
        menu(produtoLoja);    
    }
}
