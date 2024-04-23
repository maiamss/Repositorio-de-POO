//lista 6 exercicio 2

public class Circulo {
    private int centroX;
    private int centroY;
    private float raio;
    
  
    //explorando sobrecarga de construtores
    public Circulo(int centroX, int centroY, float raio ){
        this.centroX = centroX;
        this.centroY = centroY;
        this.raio = raio;
    }
    
    public Circulo(float raio){
        this.raio = raio;
        this.centroX = 0;
        this.centroY = 0;
    }

    //explorando sobrecarga de métodos 

    public void setX(int centroX) {
        this.centroX = centroX;
    }

    public void setY(int centroY) {
        this.centroY = centroY;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }
   
    
    public void setX(String centroX) {
        this.centroX = Integer.parseInt(centroX);
    }

    public void setY(String centroY) {
        this.centroY = Integer.parseInt(centroY);
    }

    public void setRaio(String raio) {
        this.raio = Float.parseFloat(raio);
    }
    
  
        
    }

