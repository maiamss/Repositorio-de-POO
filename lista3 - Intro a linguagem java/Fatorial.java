
// lista 3 exercicio 1 - fatorial

import java.util.Scanner;

public class Fatorial {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Digite um numero: ");
	    int fat = sc.nextInt();
	    int x = fat;
	    long fatx = 1;
	    
	       while (fat > 1) {
            fatx *= fat;
            fat--;
            }
	        
		 System.out.printf("O fatorial de %d eh %d%n", x, fatx);
	}
}