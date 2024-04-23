//lista 7 ex 1
package lista7_ex1;

public class Ponto2D {
    private double coordX;
    private double coordY;
    
    public Ponto2D(double coordX, double coordY){
        this.coordX = coordX;
        this.coordY = coordY;
    }
    // Sobrescrevendo o método toString()
    @Override
    
    public String toString(){
         return "coordenada X: " + coordX + "\ncoordenada Y: " + coordY;
     }
}
     
   
 
       
