
package lista7.ex2;


public class Veiculo {
    
    private Boolean ligado;
    
    public void ligar(){
        this.ligado = true;
    }
    
    public void desligar(){
        this.ligado = false;
    }

    //getter
    public Boolean isLigado() {
        return ligado;
    }
    
    
   
}
