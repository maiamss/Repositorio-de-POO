
// lista 3 -  ex 2
    
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Digite um numero: ");
	    int x = sc.nextInt();
	    int n1 = 0, n2 = 1, prox = 0, n=x;
	   
	    if(n==1){
	        prox =0;
	    }else if(n==2){
	        prox = 1;
	    }else{
	       while (x != 2) {
            prox = n1 + n2;
            n1 = n2;
            n2 = prox;
            x--;
            }
	    }
		 System.out.printf("O %d° valor da sequencia Fibonacci eh %d%n", n, prox);
	}
}
