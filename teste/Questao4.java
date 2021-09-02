import java.util.Scanner;

public class Questao4 {
 public static void main(String args[]) {
    Scanner ler = new Scanner(System.in);
    
    String nome;
    double nota1;
    double nota2;
    
    System.out.println("Nome do Aluno(a):");
    
    nome = ler.nextLine();
    
    System.out.println("Primeira nota do Aluno(a):");
    
    nota1 = ler.nextDouble();
    
    System.out.println("Segunda nota do Aluno(a):");
    
    nota2 = ler.nextDouble();
    
    System.out.println("Média do Aluno(a): " + ((nota1 + nota2) * 2)/ 3);
 }
}
