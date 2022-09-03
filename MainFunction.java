
package Livro;

/**
 * @author rhuan
 */

import java.util.Scanner; 

public class MainFunction {
      
    public static void main (String[] args){  
    
      Scanner entrada = new Scanner(System.in);

      Livro L1 = new Livro();
      System.out.println("***********CADASTRO DE NOVO LIVRO*******");   
      System.out.print("Digite o título do livro: ");
      L1.titulo = entrada.nextLine();
      System.out.print("Digite a editora do livro: ");
      L1.Editora = entrada.nextLine();
      System.out.print("Digite a edição do livro: ");
      L1.edicao = entrada.nextInt();
      System.out.print("Digite o ano do livro: ");
      L1.ano = entrada.nextInt();
      System.out.print("Digite o autor do livro: ");
      entrada.nextLine();
      L1.autor = entrada.nextLine();
      System.out.print("Digite a quantidade de folhas do livro: ");
      L1.QtdeFolhas = entrada.nextInt();
      System.out.print("Digite o ISBN do respectivo livro: ");
      entrada.nextLine();
      L1.ISBN = entrada.nextLine();
      System.out.print("Digite o idioma do livro: ");
      L1.idioma = entrada.nextLine();      
      System.out.println("LIVRO CADASTRADO. PRONTO PARA USO!");    
      
      L1.fechar();        
      L1.estudar();
      System.out.println("***********STATUS*******");
      L1.status();
      System.out.println("**************************");
}

}