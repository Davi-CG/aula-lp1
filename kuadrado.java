import java.util.Scanner;
public class kuadrado {
     final static Scanner LER = new Scanner(System.in);
public static void main(String[] args) {
   kradado2();
}



public static void kradado2(){
    System.out.println("digite o numero");
    int num=lernumint(0);
        int i= 2;   
        for(int l1=0;l1<num;l1++){
            System.out.println();
                for(int l2=0;l2<num;l2++){
              
                System.out.printf("%02d ", (int) Math.pow(i,l1+l2));
        }}
}

public static void kradado(){
    System.out.println("digite o numero");
int num=lernumint(0);
    int i= 0;   
    for(int l1=0;l1<num;l1++){
        System.out.println();
            for(int l2=0;l2<num;l2++){
           i++;
            System.out.printf("%02d ",i);
    }}


}


public static int lernumint(int num){
    num=LER.nextInt();
    return num;
}

}