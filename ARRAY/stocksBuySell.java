package ARRAY;

import java.util.Scanner;

public class stocksBuySell {

    // public static int find_max_profit(int a[], int n){
    //     Brute force method

    //     int max_profit = 0;
    //     int aux[] = new int[n];
    //     aux[n-1] = a[n-1];
    //     for(int i = n-2; i >= 0; i--){
    //         if(a[i] >= aux[i+1])
    //             aux[i] = a[i];
    //         else
    //             aux[i] = aux[i+1];
    //     }

    //     for(int i = 0; i < n; i++){
    //         int temp = aux[i]-a[i];
    //         if(temp > max_profit)
    //             max_profit = temp;
    //     }
    //     return max_profit;

    //     // Time complexity of brute force approach : O(n)
    //     // Space complexity of brute force approach : O(n)
    // }

        public static int find_max_profit(int a[], int n){
            int max_profit = 0;
            int min_so_far = a[0];
            for(int i = 0; i < n; i++){
                min_so_far = Math.min(a[i], min_so_far);
                int profit = a[i] - min_so_far;
                max_profit = Math.max(profit, max_profit);
            }
            return max_profit;

            // Most optimized solution Time complexity : O(n)
            // Most optimized solution Space complexity : O(1)
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
