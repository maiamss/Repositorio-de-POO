
package lista7.ex2;


public class Main {

   public static void main(String []args){
       Automovel automovel = new Automovel();
        Motocicleta motocicleta = new Motocicleta();
        Onibus onibus = new Onibus();

        automovel.ligar();
        System.out.println("Automóvel está ligado? " + automovel.isLigado());
        automovel.desligar();
        System.out.println("Automóvel está ligado? " + automovel.isLigado());

        motocicleta.ligar();
        System.out.println("Motocicleta está ligada? " + motocicleta.isLigado());
        motocicleta.desligar();
        System.out.println("Motocicleta está ligada? " + motocicleta.isLigado());

        onibus.ligar();
        System.out.println("Ônibus está ligado? " + onibus.isLigado());
        onibus.desligar();
        System.out.println("Ônibus está ligado? " + onibus.isLigado());

       
   }
    
}
