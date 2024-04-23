//lista 2 ex 5

import java.util.Scanner;
public class ex5{
 
    public static void main(String[] args) {
 
       Scanner sc = new Scanner(System.in);
       
        float peso, alt, imc;
        System.out.printf("Informe seu peso: ");
        peso = sc.nextFloat();
        System.out.printf("Informe sua altura: ");
        alt = sc.nextFloat();
        imc = peso/(alt*alt);
        System.out.println("Seu IMC eh " + imc);
    }
}