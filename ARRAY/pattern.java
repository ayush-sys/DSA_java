package ARRAY;

public class pattern {
    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {
            int ctr = i;
            while(ctr > 0){
                System.out.print(ctr + " ");
                ctr--;
            }
            System.out.println();
        }
    }
}
