import java.util.Scanner;
public class impares {
    final static Scanner LER = new Scanner(System.in);

public static void main(String[] args) {
    int n=lernumint();
  
    for(int i=0;i<n;i++){
        int x=lernumint();
        int y=lernumint();
        int j=0;
        while(x<y-1){
           x++;
            if(x%2==1){
                j=j+x;
            }
        } System.out.println(j);
        
    }



}
public static int lernumint(){
   int num=LER.nextInt();
    return num;
}

}