import java.util.Scanner;

public class Questao6 {
 public static void main(String args[]) {
    Scanner ler = new Scanner(System.in);
    
    String feminino;
    String masculino;
    String outro;

    feminino = "F";
    masculino = "M";
    
    System.out.println("Qual é o seu sexo:");
    outro = ler.nextLine();
    
    if((feminino == "F")||(masculino == "M")){
        System.out.println("Sexo Masculino ou Feminino.");
    }else{
        System.out.println("Terceiro sexo.");
    }
    
 }
}