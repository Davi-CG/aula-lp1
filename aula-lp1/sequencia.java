public class sequencia {

    public static void main(String[] args) {
        int j = 60;
        for (int i = 1; i <= 37; i = i + 3) {

            System.out.printf("I=%d J=%d", i, j);
            j = j - 5;
            System.out.println();
        }
    }

}
