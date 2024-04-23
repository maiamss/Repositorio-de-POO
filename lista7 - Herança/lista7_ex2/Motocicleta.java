
package lista7.ex2;


public class Motocicleta extends Veiculo {

 @Override
    public void ligar(){
        super.ligar();
        System.out.print("Motocicleta ligado");
    }
     @Override
    public void desligar(){
       super.desligar();
       System.out.print("Motocicleta desligado");
    }


}
