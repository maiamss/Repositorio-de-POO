
// lista 6 - exercicio 3

public class CalculadoraSimples {
    private float valorFloatUm;
    private float valorFloatDois;
    
    public CalculadoraSimples(int valorFloatUm, int valorFloatDois ){
        this.valorFloatUm = (int)valorFloatUm;
        this.valorFloatDois = (int)valorFloatDois;
    }

    public CalculadoraSimples(float valorFloatUm, float valorFloatDois) {
        this.valorFloatUm = valorFloatUm;
        this.valorFloatDois = valorFloatDois;
    }
    
    public void printSoma(){
        System.out.println(this.valorFloatUm + this.valorFloatDois);   
    }
    
    public void printSubtracao(){
        System.out.println(this.valorFloatUm - this.valorFloatDois);   
    }
}
