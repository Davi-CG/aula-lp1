import java.util.Scanner;

public class testandovetor{
final static Scanner LER = new Scanner(System.in);

public static void main(String[] args) {

int soma=0;
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




}

}







public static int lernumInt(){
    int v=LER.nextInt();
    return v;
}
}