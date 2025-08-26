import java.util.Scanner;
public class DaviCasagrande_1329CaraCoroa {
   final static Scanner LER = new Scanner(System.in);
   
   public static void main(String[] args) {
   
    int n; 
        while(true){
    int j=0;   
    int m=0; 
    
    n=lernumInt();
            if((1<=n)&&(n<=10000)){
                for (int i = 0; i < n; i++) {
                int lendo=lernumInt();
                if(lendo==0){
                    m=m+1;
                }if(lendo==1){
                    j=j+1;
                }
                if((lendo<0)||(lendo>1)){
                    break;
                }
               
            } 
        }if(n==0){
                break;
            }System.out.printf("Mary won %d times and John won %d times",m ,j);
        }        
            
        
            
       
    }

 
            


    public static int lernumInt(){
        int v=LER.nextInt();
        return v;
    }
}