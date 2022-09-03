
package Livro;

/**
 *
 * @author rhuan
 */

public class Livro {
    public String titulo;
    public String Editora;
    public int edicao;
    public int ano;
    public String autor;
    public int QtdeFolhas;
    public String ISBN;
    public String idioma;
    public boolean aberto;  
    
    public void estudar(){        
        if (this.aberto==false){
            System.out.println("Você não pode estudar, o livro está fechado");} 
            else {
            System.out.println("Bons estudos!");
        }
    }
    
    public void abrir() {
        this.aberto = true;       
    }
    
    public void fechar(){
        this.aberto = false;       
    }
    
    public void anotar(){
        if (this.aberto = false){
            System.out.println("Você precisa abrir antes de anotar");            
        } else {
            System.out.println("Anotando...");
        }         
    }
    
    public void status(){        
        System.out.println("Título: " + this.titulo);
        System.out.println("Editora: " + this.Editora);
        System.out.println("Edição: " + this.edicao);
        System.out.println("Ano: " + this.ano);
        System.out.println("Quantidade de folhas: " + this.QtdeFolhas);
        System.out.println("ISBN: " + this.ISBN);
        System.out.println("Idioma: " + this.idioma);
        if (aberto){
            System.out.println("O livro está aberto");
        } else {
            System.out.println("O livro está fechado");
        }       
        
    } 
}
