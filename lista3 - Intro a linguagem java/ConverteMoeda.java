//lista 3 - ex 3

import java.util.Scanner;

public class ConverteMoeda {
 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um valor em real: ");
        double real = sc.nextDouble();
        
        double cruzeiroReal = real * 2750;
        double cruzeiro = cruzeiroReal * 1000;
        
        System.out.printf("O valor em Cruzeiro Real eh %.2f\n", cruzeiroReal);
        System.out.printf("O valor em Cruzeiro eh %.2f\n", cruzeiro);
    }
}

