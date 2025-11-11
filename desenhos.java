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
        System.out.println("==============================     Seja bem vindo ao Pixel Art !!!!!!    =========================================");
        System.out.printf("\nInforme o que voçe irá fazer:\n\n");
        System.out.println("1-Desenhar");
        System.out.println("2-Carregar");
        System.out.println("3-Salvar");
        System.out.println("4-");
        int opcaoSelec = sc.nextInt();
        if(opcaoSelec == 1){
            System.out.println("Opção desenhar selecionada!");
            System.out.printf("\nDica:\n Você irá desenhar utilizando números:\n o primeiro número será a posição Y (Compimento), o segundo será X (Largura), e o terçeiro será a cor ");
            System.out.printf("\nQuando estiver pronto, aperte espaço ( e enter para ler o espaço) para iniciar o (Obs: quadro é branco!)");
            //parte do davi, Gabriel é burro!!!
        }else if(opcaoSelec == 2){
            System.out.printf("\nSelecione a categoria que deseja carragar:\n\n");
            System.out.println("1-Bandeiras");
            System.out.println("2-carros");
            System.out.println("3-casas");
            int band = sc.nextInt();
            if(band == 1 ){
                System.out.println("bandeiras:");
                System.out.printf("\n1-Alemanha");
                System.out.printf("\n2-Russia");
                System.out.printf("\n3-França");
                System.out.printf("\n4-Bélgica");
                System.out.printf("\n5-Ucrânia");
                System.out.printf("\n6-");
                bandeiras(bandeira);
            }
        }else if(opcaoSelec == 3){

        }else if(opcaoSelec == 4){

        }
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

        }else if (bandeira == 5){
        System.out.println(azul + "█████████");
        System.out.println(amarelo + "█████████" + resetf);
        System.out.println();
        //ucránia
        
        }else if (bandeira == 3){
        System.out.println(azul + "███" + branco + "███" + vermelho + "███");
        System.out.println(azul + "███" + branco + "███"+ vermelho + "███");
        System.out.println(azul + "███" + branco + "███" + vermelho + "███" + resetf);
        System.out.println();
        //frança
        }else if 
        (bandeira == 4){
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
