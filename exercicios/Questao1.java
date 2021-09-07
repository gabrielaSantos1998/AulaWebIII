import java.util.Scanner;

public class Questao1 {
 public static void main(String args[]) {
  Scanner ler = new Scanner(System.in);
  
  int livro;
  double valor;
  
  
  
  System.out.println("Bom dia!. Quantos livros deseja?");
  
  livro = ler.nextInt(); 
  
  System.out.println("Levando mais de 5 livros, você recebe desconto de 50%.");
  System.out.println("O cliente escolheu levar " + livro + " Livros. Total da compra: ");
  valor = ler.nextDouble();
  
  if (livro > 5) {
      System.out.println("O valor com desconto é " + (valor-(valor * 0.50)));
  } else {
       System.out.println("O valor sem desconto é " + valor);
    }
  
 
 }
}
