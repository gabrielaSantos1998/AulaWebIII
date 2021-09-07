import java.util.Scanner;

public class Questao4 {
 public static void main(String args[]) {
    Scanner ler = new Scanner(System.in);
    
    String nome;
    String disciplina;
    double nota1;
    double nota2;
    double nota3;
    double frequencia;
    double media;
    System.out.println("Nome do aluno(a):");
    nome = ler.nextLine();
    
    System.out.println("Disciplina do Aluno(a):");
    disciplina = ler.nextLine();
    
    System.out.println("Primeira nota do Aluno(a):");
    nota1 = ler.nextDouble();
    
    System.out.println("Segunda nota do Aluno(a):");
    nota2 = ler.nextDouble();
    
    System.out.println("Terceira nota do Aluno(a):");
    nota3 = ler.nextDouble();
    
    System.out.println("Frequência do Aluno(a):");
    frequencia = ler.nextDouble();
    
    System.out.println("Média do Aluno(a): " + (nota1 + nota2 + nota3) / 3);
    
    System.out.println("Escreva a Média final do Aluno(a) aqui:");
    media = ler.nextDouble();
    
    if ((media >= 6)&&(frequencia >= 75)) {
        System.out.println("Aluno(a) está APROVADO(A).");
    }else {
        System.out.println("Aluno(a) está REPROVADO(A)");
    }
    

 }
}