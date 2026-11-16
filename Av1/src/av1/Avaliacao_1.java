
package av1;

import java.util.Scanner;

/*
1. Criando o menu interativo (0,5 pontos)
Crie um menu interativo que deverá ficar em loop até que o usuário deseje encerrar, contendo as opções
abaixo:
1- Cadastrar pedido
2- Exibir valor total dos pedidos
3- Exibir clientes com pedidos acima de um valor determinado
4- Relatório final
5- Sair
Para cada opção escolhida, o sistema deve direcionar para a função correspondente.

2. Definindo uma struct para o pedido (0,5 pontos)
Crie uma struct chamada Pedido que contenha os seguintes campos:
• cliente (máximo 50 caracteres);
• codigoPedido (máximo 10 caracteres);
• valores [3] (um vetor de 3 posições para armazenar o valor de até três pratos pedidos pelo cliente).

3. Função de cadastro de pedidos (0,5 pontos)
Implemente uma função chamada cadastrarPedido que receba como parâmetro um vetor de pedidos. A
função deverá:
• Solicitar o nome do cliente, o código do pedido e os valores de até três prato;
• Armazenar essas informações no vetor de pedidos;
• Verificar se ainda há espaço no vetor antes de cadastrar um pedido, caso não haja espaço, o sistema
deverá informar ao usuário e retornar para o menu inicial.

4. Calculando o valor total do pedido (1 ponto)
Implemente uma função chamada calcularTotalPedido que receba os valores dos pratos de um pedido
e retorne o valor total.
Utilize essa função em uma nova função chamada exibirValoresTotais, que exiba o valor total de todos
os pedidos cadastrados.

5. Classificação de pedidos acima de um valor determinado (1 ponto)
Implemente uma função chamada classificarPedidos que, com base no valor total do pedido, exiba
uma lista de todos os clientes cujos pedidos tenham um valor acima de um determinado valor informado
pelo usuário.

6. Relatório final (1,5 pontos)
Crie uma função gerarRelatorio que exiba:
• A quantidade total de pedidos cadastrados;
• O nome do cliente com o maior valor total de pedido;
• O nome do cliente com o menor valor total de pedido.
 */
public class Avaliacao_1 {
    public static int gerarRelatorio(int quantidadePedidos, String cliente[], float vetorSoma[]) {
        float maiorValor=0,menorValor=0;
        String maiorCliente = "a",menorCliente = "b";
        System.out.println("A quantidade total de pedidos cadastrados: " + quantidadePedidos);
        for (int i = 0; i < cliente.length; i++) {
            if(maiorValor < vetorSoma[i] || i == 0){
                maiorValor = vetorSoma[i];
                maiorCliente = cliente[i];
            }
            if(menorValor > vetorSoma[i] || i == 0){
                menorValor = vetorSoma[i];
                menorCliente = cliente[i];
            }
        }
        System.out.println("O cliente com o maior valor total de pedido:" + maiorCliente + "\nO valor do pedido:" + maiorValor);
        System.out.println("O cliente com o menor valor total de pedido:" + menorCliente + "\nO valor do pedido:" + menorValor);
        return 0;
    }
    
    public static void classificarPedidos(float vetorSoma[], String cliente[]) {
        Scanner read = new Scanner(System.in);
        float valor;
        
        System.out.printf("Informe o valor de checagem (Mostraremos todos os clientes com valores de pedido acima do solicitado):");
        valor = read.nextFloat();
        for (int i = 0; i < cliente.length; i++) {
            if(vetorSoma [i] > valor){
                System.out.printf("Cliente: %s\nValor do Pedido: %.2f\n",cliente[i],vetorSoma[i]);
            }
        }
    }
    public static int calcularTotalPedido(String cliente[], float valorPrato[][], float vetorSoma[]) {
       
        for (int i = 0; i < cliente.length; i++) {
            for (int j = 0; j < 3; j++) {
                if (cliente[i] == null){
                return 0;    
                }
                else{
                vetorSoma[i] += valorPrato[i][j];    
                }
                
            }
        }
        return 0;
    }
    public static int exibirValoresTotais(float vetorSoma[],String cliente[]) {
        for (int i = 0; i < cliente.length; i++) {
            if(cliente[i] == null){
                return 0;
            }
            else {
                System.out.printf("Cliente %d: %.2f\n",i+1, vetorSoma[i]);
            }
        }
        return 0;
    }
    public static int cadastrarPedido(String cliente[], int codigoPedido[], float valorPrato[][]) {
        Scanner read = new Scanner(System.in);
        int index = 0, escolha=0, quantidadePedidos=0, proximoCliente=0;
        
        for (int i = 0; i < cliente.length; i++) {
            
            System.out.printf("Informe o nome do %do cliente:",i+1);
            cliente[i] = read.nextLine();
            System.out.printf("Informe o codigo do pedido:");
            codigoPedido[i] = read.nextInt();
            do{
                 System.out.printf("Informe o valor do %do prato:",index+1);
                 valorPrato[i][index] = read.nextInt();
                 index++;
                 if (index < 3){
                    System.out.printf("o Cliente deseja mais alguma coisa?\n(1)Sim\n(2)Nao\n<:");
                    escolha = read.nextInt();
                 }
                 if (escolha == 2){
                     index = 3;
                 }
            } while(index < 3);
            index = 0;
        quantidadePedidos++;
            System.out.printf("Deseja cadastrar mais algum cliente?\n(1)Sim\n(2)Nao\n<:");
            proximoCliente = read.nextInt();
            if (proximoCliente == 2){
                i = cliente.length + 1;
            }
            
        
                       
        read.nextLine();               
        } 
        return quantidadePedidos;
    }
 
    public static void menuInterativo() {
        Scanner read = new Scanner(System.in);
        int menu = 0, quantidadePedidos = 0;
        String[] cliente = new String [25];
        int[] codigoPedido = new int [25];
        float[][] valorPrato = new float [25][3];
        float[] vetorSoma = new float[25];
        do{
        System.out.printf("\n  RESTAURANTE TESTE\n\n(1)Cadastrar Pedido\n(2)Exibir Valor total dos pedidos\n(3)Exibir clientes com pedido acima de um valor determinado\n(4)Relatorio Final\n(5)Sair\n<:");
        menu = read.nextInt();    
            
            
            switch(menu){
                case 1:
                    quantidadePedidos = cadastrarPedido(cliente,codigoPedido,valorPrato);
                    System.out.printf("Pedidos: %d\n\n", quantidadePedidos);
                    calcularTotalPedido(cliente,valorPrato,vetorSoma);
                    break;
                case 2:
                    exibirValoresTotais(vetorSoma, cliente);
                    break;
                case 3:
                    classificarPedidos(vetorSoma,cliente);
                    break;
                case 4:
                    gerarRelatorio(quantidadePedidos,cliente,vetorSoma);
                    break;
                case 5:
                    System.out.printf("Sistema teste finalizado\n");
                    break;
            }
        } while (menu != 5);
    }
    
    public static void main(String[] args) {
        menuInterativo();
        
    }
    
}
