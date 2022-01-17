package ARRAY;

import java.util.*;

public class condn {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = in.nextInt();
        if(num < 5)
            System.out.println("You're a KID !");
        else
            System.out.println("You're an ADULT !");
        in.close();
    }
}
