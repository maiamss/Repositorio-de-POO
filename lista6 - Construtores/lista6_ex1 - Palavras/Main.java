//lista 6 exercicio 1

package lista6_ex1;

import java.util.Scanner;

public class Main{
    public static void main(String [] args){
       
       Scanner sc = new Scanner(System.in);
       System.out.print("Digite um numero: ");
       int p1 = sc.nextInt();
       sc.nextLine();
       System.out.print("Digite um palavra: ");
       String p2 = sc.nextLine();
       
       Texto texto1 = new Texto(p1, p2);
       
       System.out.println(texto1.imprime());
    }
    
}