import java.util.Scanner;

public class testandomatriz {
    final static Scanner LER = new Scanner(System.in);
    final static String amarelo = "\u001B[43m";
    final static String preto = "\u001B[40m";
    final static String vermelho = "\u001B[41m";
    final static String verde = "\u001B[42m";
    final static String azul = "\u001B[44m";
    final static String roxo = "\u001B[45m";
    final static String ciano = "\u001B[46m";
    final static String branco = "\u001B[47m";
    final static String limpar = "\033[H\033[2J";

    public static void main(String[] args) {
        int c = lernumInt();
        int l = lernumInt();
        int matriz[][] = criarmatix(c, l);
        int somat = somatotalmatix(matriz, c, l);

        String[] a = new String[8];
        a[0] = amarelo;
        a[1] = preto;
        a[2] = vermelho;
        a[3] = verde;
        a[4] = azul;
        a[5] = roxo;
        a[6] = ciano;
        a[7] = branco;
      while(true){  System.out.println(a[(int) (Math.random() * 8)]);
        System.out.println(matriz[(int) (Math.random() * c)][(int) (Math.random() * l)]);}
    }

    public static void voidem() {

    }

    public static int somatotalmatix(int[][] a, int c, int l) {
        int soma = 0;
        for (int j = 0; j < c; j++) {
            for (int i = 0; i < l; i++) {
                soma = soma + a[j][i];

            }

        }
        return soma;
    }

    public static int[][] criarmatix(int c, int l) {

        int[][] a = new int[c][l];
        for (int j = 0; j < c; j++) {
            for (int i = 0; i < l; i++) {
                a[j][i] = lernumInt();

            }
        }
        return a;
    }

    public static int lernumInt() {
        int v = LER.nextInt();
        return v;
    }

}
// eu odeio isso T-T
