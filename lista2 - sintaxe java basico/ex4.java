
//lista 2 ex 4
import java.util.Scanner;
public class ex4 {
  
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int n[] = new int[3];
        for(int i=0; i<3; i++){
            System.out.printf("Informe um número: ");
            n[i] = sc.nextInt();
            soma += n[i];
        }
    
        System.out.print("A soma dos números digitados eh " + soma);
    }
}

