import java.util.*;
public class desenhos {
    final static Scanner sc = new Scanner(System.in);
    final static String vermelho = "\u001B[31m";
    final static String amareloFundo = "\u001B[41m";
    final static String azul = "\u001B[34m";
    final static String branco = "\u001B[37m";
    final static String amarelo = "\u001B[33m";
    final static String preto = "\u001B[30m";
    final static String limpar = "\033[H\033[2J";
    public static void main(String[] args) {
        int caralinhos = sc.nextInt();
        bandeiras(caralinhos);
        System.out.println(" ");
    }
    public static void bandeiras(int caralinhos){
        if(caralinhos == 1){
        System.out.println(preto + "███████████");
        System.out.println(vermelho + "███████████");
        System.out.println(amarelo + "███████████");
        System.out.println(limpar);//Alemanha
        
        }else if(caralinhos == 2){
        System.out.println(branco + "███████████");
        System.out.println(azul+ "███████████");
        System.out.println(vermelho + "███████████");//Russia
        }else if (caralinhos == 3){
        System.out.println(vermelho + "███████████");
        System.out.println(vermelho + "█████" + amareloFundo + amarelo + "☭" + vermelho + "█████");
        System.out.println(vermelho + "███████████");//Socialismo
        }
    }
}
