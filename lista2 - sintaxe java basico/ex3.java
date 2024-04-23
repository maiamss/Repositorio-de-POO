// lista 2 ex3
public class ex3 {
     public static void main(String[] args) {
        int soma =0 ;
        int media =0;
        int cont = 0;
        for(int i=0; i<=100; i++){
            if(i%2!=0){
               soma+=i;
               cont++;
            }
        }
        media = soma/cont;
        System.out.print(media);
    }
}
