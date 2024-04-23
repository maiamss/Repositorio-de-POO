/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista5;

/**
 *
 * @author maiar
 */
public class Endereco {
    
    private String rua;
    private String bairro; 
    private String cidade;
    private String estado;
    private String cep;
        
    //construtor
     public Endereco(String rua, String bairro, String cidade, String estado, String cep){
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }
    //getters
     public String getRua(){
        return rua;
    }
    public String getBairro(){
        return bairro;
    }
    public String getCidade(){
        return cidade;
    }
    public String getEstado(){
        return estado;
    }
    public String getCep(){
        return cep;
    }
    
    ////setters
    
    public void setRua(String rua){
        this.rua = rua;
    }
    public void setBairro(String bairro){
        this.bairro = bairro;
    }
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    public void setCep(String cep){
        this.cep = cep;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    }
    