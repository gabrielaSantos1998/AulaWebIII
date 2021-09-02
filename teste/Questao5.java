import java.util.Scanner;

public class Questao5 {
 public static void main(String args[]) {
  Scanner ler = new Scanner(System.in);
  
  int valor;
  
  System.out.print("Digite um número: ");
  
  valor = ler.nextInt();
  
  if (valor>10) {
      System.out.print("O número digitado é maior que 10.");
  } else { 
      System.out.print("O número digitado é menor que 10.");
  }
  
  
 }
}