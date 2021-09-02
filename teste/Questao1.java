import java.util.Scanner;

public class Questao1 {
    
 public static void main (String args[]) {
     Scanner ler = new Scanner(System.in);
     String nome; 
     int idade;
     
     System.out.println("Digite seu nome:"); 
     nome = ler.nextLine();  
     
     System.out.println("Digite sua idade:");
     idade = ler.nextInt(); 
     
     System.out.println("Seu nome é:"+nome);
     
     System.out.println("Você tem " + idade + " anos.");
     
 }
}