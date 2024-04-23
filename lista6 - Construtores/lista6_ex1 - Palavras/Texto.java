//lista 6 exercicio 1

package lista6_ex1;


public class Texto{
    private String palavras;
    
        public Texto(String palavras){
            this.palavras = palavras;
        }
        
        public Texto(int p1, String p2){
            if(p1 == 0){
                this.palavras = null;
            }else if(p1>= p2.length()){
                this.palavras = p2;
            }else{
                this.palavras = p2.substring(0, p1);
            }
        }
       
        public String imprime(){
            return this.palavras;
        }
        
}