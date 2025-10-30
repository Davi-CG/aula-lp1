import java.util.Scanner;

public class testandovetor{
final static Scanner LER = new Scanner(System.in);

public static void main(String[] args) {

parte2();

}








public static void imprimirveytot(int[] vetot){
  for (int i = 0; i < vetot.length; i++) {
      System.out.println(vetot[i]);
  }
  
  
}

public static void coucatenatvetot(int[] vetot1,int[] outrovetot){
int[] vetot3= new int[vetot1.length+outrovetot.length];
for (int i = 0; i < vetot1.length; i++) {
    vetot3[i]= vetot1[i];
}
for (int i = 0; i < +outrovetot.length ; i++) {
  vetot3[i+vetot1.length]= vetot1[i];
}

}








public static void parte2(){
int n=6;
int numero=5;
    int[]v=criarvetot(n);
for (int i = 0; i < n-1; i++) {
 if(v[i]>numero) {System.out.println(v[i]);} 
 

}

}






  public static int[] criarvetot(int n){
int[]a=new int[n];
    for (int i = 0; i < n; i++) {
    a[i]=lernumInt();
    
}return a;

  }  

  public static int[] criarvetotAleatoriu(int n,int mv){
    int[]a=new int[n];
        for (int i = 0; i < n; i++) {
        a[i]= (int) (Math.random() *mv);
        
    }return a;
    
      }  











public static void parte1(){int soma=0;
int tamanho=5;  
int[]a= new int[tamanho];
a[0]=10;
a[1]=20;
a[2]=30;
a[3]=40;
a[4]=50;
for(int i=0;i<tamanho;i++){
soma=soma+a[i];
System.out.println(a[i]+" "+soma+" "+i);




}}





public static int lernumInt(){
    int v=LER.nextInt();
    return v;
}
}