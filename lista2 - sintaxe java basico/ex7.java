//lista 2 ex 7

import java.util.Scanner;
public class ex7{
 
    public static void main(String[] args) {
     
       Scanner sc = new Scanner(System.in);
       System.out.println("digite seu nome completo: ");
        
        String frase = sc.nextLine();
        String[] textoSeparado = frase.split(" ");

        
        String firstName = textoSeparado[0];
        String lastName = textoSeparado[textoSeparado.length - 1];
        
        System.out.println(firstName + " " + lastName);
    }
}