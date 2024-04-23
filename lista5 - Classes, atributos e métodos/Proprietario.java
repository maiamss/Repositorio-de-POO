/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista5;
import java.util.Calendar;

public class Proprietario {
    private String nome;
    private String cpf;
    private String rg;
    private Calendar dataNascimento;
    private Endereco endereco;
    
    
    //construtor
    public Proprietario(String nome, String cpf, String rg, Calendar dataNascimento, Endereco endereco){
        this.nome= nome;
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }
   
    //getters
    public String getNome(){
        return nome;
    }
    public String getCpf(){
        return cpf;
    }
    public String getRg(){
        return rg;
    }
    public Calendar getDataNascimento(){
        return dataNascimento;
    }
    
   
    
    //setters
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setDataNascimenyp(Calendar dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    
}
   
