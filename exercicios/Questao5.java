import java.util.Scanner;

public class Questao5 {
    public static void main(String args[]) {
     Scanner ler = new Scanner(System.in);
     
     int senha;
     
     System.out.println("Digite a senha de acesso:");
     
     senha = ler.nextInt();
     
     if(senha == 1234) {
         System.out.println("ACESSO PERMITIDO");
     }else{
         System.out.println("ACESSO NEGADO");
     }
    }
}