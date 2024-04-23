//lista 2 ex 6
import java.util.Scanner;
public class ex6{
 
    public static void main(String[] args) {
     
       Scanner sc = new Scanner(System.in);
       System.out.println("digite uma frase: ");
        
        String frase = sc.nextLine();
        frase= frase.toUpperCase();
        System.out.print(frase);
    }
}