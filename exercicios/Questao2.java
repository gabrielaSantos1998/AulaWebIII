import java.util.Scanner;

public class Questao2 {
 public static void main(String args[]){
  Scanner ler = new Scanner(System.in);
  
  String nome;
  int idade;
  double ingresso;
  
  ingresso = 22.50;
  
  System.out.println("Qual é o seu nome?");
  
  nome = ler.nextLine(); 
  
  System.out.println("Quantos anos você tem?");
  
  idade = ler.nextInt();
  
  System.out.println("Valor do ingresso: " + ingresso + " R$");
  
  
  if (idade >= 60) {
    System.out.println("Pessoas com idade de 60 anos ou mais, pagam meia entrada!.");
  }else {
      System.out.println("Valor normal do ingresso!.");
  }
  
 }
}