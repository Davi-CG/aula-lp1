import java.util.Scanner;

public class pixelArt {
    final static Scanner LER = new Scanner(System.in);
    final static String amarelo = "\u001B[33m";
    final static String preto = "\u001B[30m";
    final static String vermelho = "\u001B[31m";
    final static String verde = "\u001B[32m";
    final static String azul = "\u001B[34m";
    final static String roxo = "\u001B[35m";
    final static String ciano = "\u001B[36m";
    final static String branco = "\u001B[37m";
    final static String amarelof = "\u001B[43m";
    final static String pretof = "\u001B[40m";
    final static String vermelhof = "\u001B[41m";
    final static String verdef = "\u001B[42m";
    final static String azulf = "\u001B[44m";
    final static String roxof = "\u001B[45m";
    final static String cianof = "\u001B[46m";
    final static String brancof = "\u001B[47m";
    final static String limpar = "\033[H\033[2J";

    public static void main(String[] args) {




    }


public static String coures(int n){
    String[] a = new String[17];
        a[0] = amarelo;
        a[1] = preto;
        a[2] = vermelho;
        a[3] = verde;
        a[4] = azul;
        a[5] = roxo;
        a[6] = ciano;
        a[7] = branco;
        a[8] = limpar;
        a[9]=amarelof;
        a[10]=pretof;
        a[11]=vermelhof;
        a[12]=verdef;
        a[13]=azulf;
        a[14]=roxof;
        a[15]=cianof;
        a[16]=brancof;
String A= a[n];
return A;
}

public static void imprimirtela(String[][] a, int c, int l){
    System.out.println(coures(8)); 
for (int j = 0; j < c; j++) {
            for (int i = 0; i < l; i++) {
              System.out.println(a[j][i]);   

            }
        }

}
public static void desenhar(){
   
}






    public static String[][] criarmatix(int c, int l) {

        String[][] a = new String[c][l];
        for (int j = 0; j < c; j++) {
            for (int i = 0; i < l; i++) {
                a[j][i] = "██";

            }
        }
        return a;
    }

    public static int lernumInt() {
        int v = LER.nextInt();
        return v;
    }

}
///só pra dar 100 linhas
/// eu preciso colocar aparte