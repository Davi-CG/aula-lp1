import java.util.Scanner;
public class tryagulou {
    final static Scanner LER = new Scanner(System.in); 
    
public static void main(String[] args) {
tryagulo2();
}


public static void tryagulo(){
    System.out.println("digite o numero");
int num=lernumint(0);
 
    for(int l1=0;l1<num;l1++){
        System.out.println();
            for(int l2=0;l2<=l1;l2++){
           
            System.out.print(" *");
    }}


}



public static void tryagulo2(){
    System.out.println("digite o numero");
int num=lernumint(0);
 int i=0;
    for(int l1=0;l1<num;l1++){
        System.out.println();
            for(int l2=0;l2<=l1;l2++){
           i++;
            System.out.printf("%03d ", i);
    }}


}





    
    public static int lernumint(int num){
         num=LER.nextInt();
        return num;
    }
}