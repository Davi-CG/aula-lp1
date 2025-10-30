public class taubada {

public static void main(String[] args) {
oras();

}


public static void oras(){
    for(int ora=0;ora <24;ora ++){
        for(int min=0;min <60;min ++){
            for(int seg=0;seg <60;seg ++){
System.out.printf("%02d : %02d : %02d\n",ora,min,seg);

}}}}


public static void plakas(){
for(int n4=0;n4 <10; n4++){
    for(int n3=0;n3 <10; n3++){
        for(int n2=0;n2 <10; n2++){
            for(int n1=0;n1 <10; n1++){
                System.out.printf("abc-%d%d%d%d\n",n4,n3,n2,n1);
    }}}}
}

}