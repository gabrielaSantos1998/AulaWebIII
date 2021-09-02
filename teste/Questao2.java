import java.util.Scanner;

public class Questao2 {
    public static void main (String args[]) {
     Scanner ler = new Scanner(System.in);
     
     int valor;
     int valor2;
     int valor3;
     
     System.out.println("Digite um número:");
     
     valor = ler.nextInt();
     
     System.out.println("Digite outro número:");
     
     valor2 = ler.nextInt();
     
     System.out.println("Digite mais um número:");
     
     valor3 = ler.nextInt();
     
     System.out.print("O resultado dos números digitados é: " + valor * valor2 * valor3);
    }
}