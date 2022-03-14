package ARRAY;

import java.util.Scanner;

public class stocksBuySell2 {

    public static int find_max_profit(int a[], int n){
        int max_profit = 0;
        for(int i=1; i<n; i++) {
            if(a[i] > a[i-1])
                max_profit += (a[i] - a[i-1]);
        }
        return max_profit;
    }

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = in.nextInt();
        System.out.println("Enter array ");
        int a[] = new int[n];
        for(int i = 0;i < n; i++)
            a[i] = in.nextInt();

        int res = find_max_profit(a, n);
        System.out.println("Max profit : " + res);
        in.close();
    }
}
