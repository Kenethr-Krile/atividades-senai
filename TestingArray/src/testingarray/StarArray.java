
package testingarray;

import java.util.ArrayList;
import java.util.Scanner;

public class StarArray {
    ArrayList<ComposicaoQuimica> composicao = new ArrayList<>();
    
    String nome;
    float temperatura;
    float tamanho;
    double idade;
    int codigo;
    
    public String getName(){
        return nome;
    }
    public float getTemp(){
        return temperatura;
    }
    public float getSize(){
        return tamanho;
    }
    public double getAge(){
        return idade;
    }
    public int getCode(){
        return codigo;
    }
    public void exibirEstrela(){
        System.out.printf("\nCodigo: %d",codigo);
        System.out.printf("\nNome: %s",nome);
        System.out.printf("\nTemp: %.1fc",temperatura);
        System.out.printf("\nTamanho: %.1fkm",tamanho);
        System.out.printf("\nIdade: %.0f",idade);
        System.out.printf("\n----------------------------------------------------------\n");
        
        if  (composicao.isEmpty()){
            System.out.printf("\nNenhum elemento cadastrado.");
            System.out.printf("\n----------------------------------------------------------\n");
        }
        else{
            for(ComposicaoQuimica comp : composicao){
                comp.exibirComposicao();
                System.out.printf("\n----------------------------------------------------------\n");
            }
        }
    }
    
    public static class ComposicaoQuimica{
        String elemento;
        float qtdElemento;
        
        public void exibirComposicao(){
            System.out.printf("\nElemento: %s",elemento);
            System.out.printf("\nPorcentagem: %.1f%%",qtdElemento);
        }
    }
    
    public static int safelyGetCode(ArrayList<StarArray> listaEstrelas, Scanner read){
        
        while(true){
            int codigo = safelyGetInt(read);
            boolean codigoExiste = false;
            for(StarArray index : listaEstrelas){
                if(index.codigo == codigo ){
                    codigoExiste = true;
                    break;
                }
            }
            if(codigoExiste){
                System.out.printf("\nCodigo ja esta sendo utilizado em outra estrela, tente novamente!\n<:");
            }
            else{
                return codigo;
            }
        }   
    }
    
    public static void adicionarEstrela(Scanner read, ArrayList<StarArray> listaEstrelas){
        StarArray newStar = new StarArray();
        
        System.out.printf("\nInforme o codigo da Estrela para organizacao:");
        newStar.codigo = safelyGetCode(listaEstrelas,read);
        
        System.out.printf("\nInforme o nome da Estrela que deseja adicionar:");
        newStar.nome = safelyGetLine(read);
       
        System.out.printf("\nInforme a temperatura da Estrela que deseja adicionar:");
        newStar.temperatura = safelyGetFloat(read);
        
        System.out.printf("\nInforme o tamanho da Estrela que deseja adicionar:");
        newStar.tamanho = safelyGetFloat(read);
        
        System.out.printf("\nInforme a idade da Estrela que deseja adicionar:");
        newStar.idade = safelyGetDouble(read);
        
        System.out.printf("\n\nOK, agora informe quantos elementos quimicos sua estrela possui em sua composicao quimica:");
        
        int indexComposition = safelyGetInt(read);
        
        
        for (int i = 0; i < indexComposition; i++) {
            StarArray.ComposicaoQuimica infoElem = new StarArray.ComposicaoQuimica();
            
            System.out.printf("\n\nInforme o %do elemento quimico que a compoe:", i+1 );
            infoElem.elemento = safelyGetLine(read);
            System.out.printf("\nInforme a porcentagem do elemento em sua composicao:");
            infoElem.qtdElemento = safelyGetFloat(read);
            newStar.composicao.add(infoElem);
              
        }
        listaEstrelas.add(newStar);  
    }
    public static void exibirTotal(Scanner read, ArrayList<StarArray> listaEstrelas){
        System.out.printf("----- Informando todas as estrelas catalogadas! -----\n\n");
        if(listaEstrelas.isEmpty()){
            System.out.printf("\n ----- Lista Vazia -----");
        }
        else{
            System.out.printf("\n ----- Estrelas encontradas : %d -----", listaEstrelas.size());
        }
        for(StarArray listaEstrela: listaEstrelas){
            listaEstrela.exibirEstrela();   
        }
    }
    public static void exibirIndividual(Scanner read, ArrayList<StarArray> listaEstrelas){
        
        if ( listaEstrelas.isEmpty() == true ){
            System.out.printf("\n ---- Ainda nao existe estrela catalogada! ----");
        }
        else{
            System.out.printf("\nInforme o codigo da estrela que deseja localizar:");
            int codeSearch = safelyGetInt(read);
            StarArray estrelaEncontrada = null;
            
            for (StarArray listaEstrela : listaEstrelas) {
                if(codeSearch == listaEstrela.getCode()){
                    estrelaEncontrada = listaEstrela;
                    break;
                }
            }
            if (estrelaEncontrada != null) {
                System.out.printf("\nA estrela foi localizada na base de dados!\n");
                estrelaEncontrada.exibirEstrela();
            } 
            else {
                System.out.printf("\nEstrela nao encontrada!\n");
            }
            
        }    
    }
   
    public static void menuExibir(Scanner read, ArrayList listaEstrelas){
        int option=0;
        do{
            System.out.printf("\n\n |--- SISTEMA DE EXIBICAO ----| \n\n(1)Exibir todas as estrelas cadastradas\n(2)Exibir uma estrela especifica\n(3)retornar\n<:");
            option = safelyGetMenuOption(option,read);
            
            switch(option){
                case 1 -> exibirTotal(read, listaEstrelas);
                case 2 -> exibirIndividual(read, listaEstrelas);
                case 3 -> {
                }
            }
        } while (option != 3);
    }
    
    public static float safelyGetFloat(Scanner read){
        float tempVar;
        while(true){
            if( read.hasNextFloat() ){
                tempVar = read.nextFloat();
                read.nextLine();
                return tempVar;
            }
            else{
                read.next();
            }
            System.out.printf("Informacao incorreta, tente novamente!\n<:");
        }
    }
    public static String safelyGetLine(Scanner read){
        String tempVar;
        while(true){
            if( read.hasNextLine() ){
                tempVar = read.nextLine();
                return tempVar;
            }
            else{
                read.next();
            }
            System.out.printf("Informacao incorreta, tente novamente!\n<:");
        }
    }
    public static int safelyGetInt(Scanner read){
        int tempVar;
        while(true){
            if( read.hasNextInt() ){
                tempVar = read.nextInt();
                read.nextLine();
                return tempVar;
            }
            else{
                read.next();
            }
            System.out.printf("Informacao incorreta, tente novamente!\n<:");
        }
    }
    public static double safelyGetDouble(Scanner read){
        double tempVar;
        while(true){
            if( read.hasNextDouble() ){
                tempVar = read.nextDouble();
                read.nextLine();
                return tempVar;
            }
            else{
                read.next();
            }
            System.out.printf("Informacao incorreta, tente novamente!\n<:");
        }
    }
    public static int safelyGetMenuOption(int option,Scanner read){
        while(true){
            if ( read.hasNextInt() ){
                option = read.nextInt();
                read.nextLine();
                
                if(option >= 1 && option <= 3){
                    return option;
                }
               
            }
            else{
                read.next();
            }
            
            System.out.printf("\nInformacao incorreta, tente novamente!\n<:");
        }
    }
    
    
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        ArrayList<StarArray> listaEstrelas = new ArrayList<>();
        int option = 0;
        
        do{
            
            System.out.printf("\n\nMenu de Interacao\n\n(1)Adicionar nova estrela\n(2)Exibir Estrelas catalogadas\n(3)Sair\n<:"); 
            option = safelyGetMenuOption(option, read);
            
            switch(option){
                case 1 -> adicionarEstrela(read, listaEstrelas);
                case 2 -> menuExibir(read, listaEstrelas);
                case 3 -> System.out.printf("\n\n Programa Finalizado!\n\n");
            }

        }while(option != 3);
        
    }   
}
