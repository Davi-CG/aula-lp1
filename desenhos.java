import java.util.*;
public class desenhos {
    final static Scanner sc = new Scanner(System.in);
    final static String vermelho = "\u001B[31m";
    final static String vermelhof = "\u001B[41m";
    final static String azul = "\u001B[34m";
    final static String branco = "\u001B[37m";
    final static String brancof = "\u001B[47m";
    final static String amarelo = "\u001B[33m";
    final static String preto = "\u001B[30m";
    final static String limpar = "\033[H\033[2J";
    final static String pretof = "\u001B[40m";
    final static String resetf = "\u001B[0m";
    public static void main(String[] args) {
        
        int bandeira = 0;System.out.println();System.out.println();
        System.out.println("==============================     Seja bem vindo ao Pixel Art vagabundo!!!!!!    =========================================");
        System.out.println("");
        bandeiras(bandeira);
    }
    public static void bandeiras(int bandeira){
        while(true){
            bandeira=lernumInt();
            if(bandeira == 1){
        System.out.println(preto + "███████████");
        System.out.println(vermelho + "███████████");
        System.out.println(amarelo + "███████████" + resetf);
        bandeira = 0;
        //Alemanha
    
        }else if(bandeira == 2){
        System.out.println(branco + "███████████");
        System.out.println(azul+ "███████████");
        System.out.println(vermelho + "███████████" + resetf);
        System.out.println();
        //Russia

        }else if (bandeira == 3){
        System.out.println(vermelho+ "███████████");
        System.out.println(vermelho + "█████" + vermelhof + amarelo + "☭" + vermelho + "█████"+ resetf);
        System.out.println(vermelho + "███████████" + branco + resetf);
        System.out.println();
        //Socialismo
        
        }else if (bandeira == 4){
        System.out.println(azul + "███" + branco + "███" + vermelho + "███");
        System.out.println(azul + "███" + branco + "███"+ vermelho + "███");
        System.out.println(azul + "███" + branco + "███" + vermelho + "███" + resetf);
        System.out.println();
        //frança
        }else if 
        (bandeira == 5){
        System.out.println(preto + "███" + amarelo + "███" + vermelho + "███");
        System.out.println(preto + "███" + amarelo + "███"+ vermelho + "███");
        System.out.println(preto + "███" + amarelo + "███" + vermelho + "███" + resetf);
        System.out.println();
        //bélgica

        }
        if(bandeira>=10){
            break;
        }
    }
        
       
    } public static int lernumInt(){
        int v=sc.nextInt();
        return v;
    }
}
