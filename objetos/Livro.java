
package objetos;

public class Livro {
    String titulo;
    String autor;
    int numeroPaginas;
    
    void descrever(){
        System.out.printf("Titulo:%s\nAutor:%s\nNumero de Paginas:%d\n\n",titulo,autor,numeroPaginas);
    }
}
