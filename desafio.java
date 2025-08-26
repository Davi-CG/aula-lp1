public class desafio {
    public static void main(String[] args) {
        int[]v1= new int[5];
        v1[0]=5;
        v1[1]=5;
        v1[2]=6;
        v1[3]=0;
        v1[4]=0;
        int[]v2= new int[5];
        v2[0]=0;
        v2[1]=0;
        v2[2]=4;
        v2[3]=0;
        v2[4]=0;
        int[]v3= new int[5];
        v3[0]=0;
        v3[1]=0;
        v3[2]=0;
        v3[3]=0;
        v3[4]=0;
        for (int i = 0; i < 5; i++) {
            if(v1[i]+v2[i]>=10){
                v3[i+1]=v1[i+1]+1;
                v3[i]=0;
            }else{
                v3[i]=v1[i];
            }
        }
 System.out.println(
v3[0]+v3[1]+v3[2]+v3[3]+v3[4] );






    }
}
