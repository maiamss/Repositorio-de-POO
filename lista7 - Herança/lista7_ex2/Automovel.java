
package lista7.ex2;


public class Automovel extends Veiculo {

  
     @Override
    public void ligar(){
        super.ligar();
        System.out.print("Automóvel ligado");
    }
     @Override
    public void desligar(){
       super.desligar();
       System.out.print("Automóvel desligado");
    }


}
