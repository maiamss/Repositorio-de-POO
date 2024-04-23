/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista5;

/**
 *
 * @author maiar
 */
public class Carro {
    private String modelo;
    private String marca;
    private double velocidadeMaxima;
    private double velocidadeAtual;
    private int numeroMarchas;
    private int ano; 
    private Boolean possuiTetoSolar;
    private String cor;
    private int chassi;
    private Proprietario proprietario;
    private int numeroPortas;
    private Boolean cambio;

    public Carro (String modelo,String marca,double velocidadeMaxima,double velocidadeAtual,int ano, Boolean possuiTetoSolar,String cor,int chassi,Proprietario proprietario,
     int numeroPortas, Boolean cambio, int numeroMarchas){
    
       this.modelo = modelo;
       this.marca = marca;
       this.velocidadeMaxima = velocidadeMaxima;
       this.velocidadeAtual = velocidadeAtual;
       this.numeroMarchas = numeroMarchas;
       this.ano = ano;
       this.possuiTetoSolar = possuiTetoSolar;
       this.cor = cor;
       this.chassi = chassi;
       this.proprietario = proprietario;
       this.numeroPortas = numeroPortas;
       this.cambio = cambio;
    }
      

//getters
    public String getModelo(){
           return modelo;
       }
               
   public String getMarca(){
           return marca;
       }
       
    public double getVelocidadeMaxima(){
           return velocidadeMaxima;}
       
    public double getVelocidadeAtual(){
           return velocidadeAtual;}

    public int getNumeroMarchas() {
        return numeroMarchas;
    }

    public Boolean getCambio() {
        return cambio;
    }
      
       
    public int getAno(){
           return ano;}
       
    public Boolean getPossuiTetoSolar(){
         return possuiTetoSolar;}
       
    public String getCor(){
          return cor;}
      
    public Proprietario getProprietario(){
          return proprietario;}
      
    public int getNumeroPortas(){
           return numeroPortas; }
       
    public Boolean getPossuiCambio(){
         return cambio;}
       
    public int getChassi(){
         return chassi; }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public void setVelocidadeAtual(double velocidadeAtual){
        this.velocidadeAtual = velocidadeAtual;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void setNumeroMarchas(int numeroMarchas) {
        this.numeroMarchas = numeroMarchas;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setPossuiTetoSolar(Boolean possuiTetoSolar) {
        this.possuiTetoSolar = possuiTetoSolar;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setChassi(int chassi) {
        this.chassi = chassi;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public void setCambio(Boolean cambio) {
        this.cambio = cambio;
    }
    
    public void acelerar(){
        double v = getVelocidadeAtual();
        double va= getVelocidadeMaxima();
       if(v>= va){
            System.out.printf("O carro já esta em velocidade máxima");
       }else{
        setVelocidadeAtual(v+1);
        System.out.printf("Velocidade alterada pra %f", v+1);
       }
    }
    public void frear(){
       setVelocidadeAtual(0);
    }
    
    public void trocarMarcha(int marcha){ //aumenta a marcha em 1
        int n = getNumeroMarchas();
        double v = getVelocidadeAtual();
       
        if(marcha == -1){ //ré
            if(v >0){
                System.out.println("Nao eh possivel engatar a reh");
            }else{
                 setNumeroMarchas(marcha);}
        }else{
             if(n>=5){
                 System.out.println("O carro ja esta na marcha maxima");
             }else{ 
                setNumeroMarchas(marcha);
                System.out.printf("Marcha alterada para: %d",marcha);
             }
        }
    }
    public void reduzirMarcha(){
        int n = getNumeroMarchas();
        if(n<1){
            System.out.println("O carro ja esta na marcha minima"); 
        }else{
            setNumeroMarchas(n-1);
            System.out.printf("Marcha alterada para: %d",n-1); 
        }
    }
}


