import java.util.Scanner;
public class DaviCasagrande_1547Adivinha {
final static Scanner LER = new Scanner(System.in);
   public static void main(String[] args) {
    int num=lernumInt();
    for(int i=0;i<num;i++){
caso();
    }



   }
        
 public static void caso(){
int qtdAlunos=lernumInt();
int numeroE=lernumInt();
int maisproximo=0;
int vencedor=0;
for(int i=1;i<=qtdAlunos;i++){
int n=lernumInt();
if (maisproximo==0 && n!=numeroE) {
    maisproximo=numeroE-n;
}
if(maisproximo<0){
maisproximo=maisproximo*-1;
}
if((numeroE-n)<maisproximo){
    maisproximo=n;
    vencedor=i;
}
}System.out.println(vencedor);


 }





        public static int lernumInt(){
            int v=LER.nextInt();
            return v;
        }

}
