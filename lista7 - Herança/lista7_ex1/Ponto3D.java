//lista 7 ex 1
package lista7_ex1;

public class Ponto3D extends Ponto2D{
    private double coordZ;
    
    public Ponto3D(double coordX, double coordY, double coordZ ){
        super(coordX, coordY);
        this.coordZ = coordZ;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\ncoordenada Z: " + coordZ ;
    }
}
