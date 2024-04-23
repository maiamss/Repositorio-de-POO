
package lista7.ex2;


public class Onibus extends Veiculo {


    
     @Override
    public void ligar(){
        super.ligar();
        System.out.print("Onibus ligado");
    }
     @Override
    public void desligar(){
       super.desligar();
       System.out.print("Onibus desligado");
    }


}
