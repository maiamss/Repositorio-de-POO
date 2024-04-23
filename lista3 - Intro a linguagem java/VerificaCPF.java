
// lista 3 -  ex 4

import java.util.Scanner;
public class Main{
	public static void main(String[] args) { 
	    Scanner sc = new Scanner(System.in);
	    System.out.println("digite seu cpf: ");
	    String cpf= sc.nextLine();
	   char vetor[] = cpf.toCharArray();
	   
	  
	   if (vetor.length != 11) {
            System.out.println("CPF inválido. Deve conter 11 dígitos.");
            return; // Encerra o programa
        }
        
        //descobrindo o J
	    int soma =0;
	    char vetorj=0;
	    for(int cont = 0, i=10; i>1; i--){
	        soma += Character.getNumericValue(vetor[cont]) * i;
	        cont++;
	    }
	    if(soma%11 == 0 || soma%11 == 1){
	        vetorj = '0';
	    }else{
            vetorj = (char) ('0' + (11 - (soma % 11)));
	    }
	    
	    
	    //descobrindo o k
	    int somak = 0; 
	    char vetork =0;
	     for(int cont = 0, i=11; i>=2; i--){
	       somak += Character.getNumericValue(vetor[cont]) * i;
	       cont++;
	    }
	    if(somak%11 == 0 || somak%11 == 1){
	        vetork = '0';
	    }else{
	        vetork = (char) ('0' + (11 - (somak % 11)));
	    }

	    System.out.printf("Digito verificador j: %c%n", vetorj);
	    System.out.printf("Digito verificador k: %c%n", vetork);
	    
	    //verificando se o cpf é válido
	     if (vetorj == vetor[9] && vetork == vetor[10]) {
            System.out.println("CPF válido.");
        } else {
            System.out.println("CPF inválido.");
        }
	}
}