import java.util.Scanner;

public class Questao3 {
 public static void main(String args[]) {
     Scanner ler = new Scanner(System.in);
     
     double valor;
     
     System.out.print("Digite um número: ");
     
     valor = ler.nextDouble(); 
     
     System.out.println("O dobro do valor digitado é: " + valor * 2);
     
     System.out.println("O triplo do dobro do valor digitado é: " + (valor * 2) * 3);
     
     System.out.println("A metade do triplo do dobro do valor digitado é: " + ((valor * 2) * 3)/2);
     
     System.out.println("O quadrado do valor digitado é: " + Math.pow(valor,2));
     
     
 }
}