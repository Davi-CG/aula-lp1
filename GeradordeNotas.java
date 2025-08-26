import java.util.Scanner;
public class GeradordeNotas {
    final static Scanner LER = new Scanner(System.in);
public static void main(String[] args) {
   
  

}

 public static int lernotas(){
    int tamanho=lernumint();
    int[]a= new int[tamanho];
    int soma=0;
  for(int i=0;i<tamanho;i++){
    a[i]=lernumint();
soma+=a[i];
}return soma;
}
public static void media(int soma){
int
}



public static int lernumint(){
    int num=LER.nextInt();
    return num;
}
}
