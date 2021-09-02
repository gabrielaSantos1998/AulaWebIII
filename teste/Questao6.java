import java.util.Scanner;

public class Questao6 {
  public static void main(String args[]) {
    Scanner ler = new Scanner(System.in);
    
    int valor;
    
    System.out.print("Digite um número: ");
    
    valor = ler.nextInt();
    
    if ((valor % 2) == 0) {
       System.out.println("O número digitado é par."); 
        
    } else {
       System.out.println("O número digitado é ímpar");
    }
  }
} 