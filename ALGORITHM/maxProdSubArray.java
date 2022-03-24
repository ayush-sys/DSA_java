package ALGORITHM;

import java.util.Scanner;

// https://practice.geeksforgeeks.org/problems/maximum-product-subarray3604/1

// This is similar to Kadane's algo



public class maxProdSubArray {

    // Time complexity for this func : O(n^2)
    // Space complexity for this func: O(1)
    public static int find_max(int a[], int n){
        int result = a[0];
        for(int i = 0; i < n; i++){
            int currMax = a[i];
            for(int j = i + 1; j < n; j++){
                result = Math.max(result, currMax);
                currMax *= a[j];
            }
            result = Math.max(result, currMax);
        }

        return result;
    }


    // Optimised Solution
    // Time complexity for this func : O(n)
    // Space complexity for this func: O(1)
    public static int maxProduct(int a[], int n){
        int min_val = a[0], max_val = a[0], max_prod = a[0];
        for(int i = 0; i < n; i++){
            if(a[i] < 0){
                int temp = max_val;
                max_val = min_val;
                min_val = temp;
            }

            max_val = Math.max(max_val, (max_val * a[i]));
            min_val = Math.min(min_val, (min_val * a[i]));
            max_prod = Math.max(max_prod, max_val);
        }

        return max_prod;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = in.nextInt();
        int a[] = new int[n];
        System.out.print("Enter elements in array : ");
        for(int i = 0; i < n; i++)
            a[i] = in.nextInt();
        int res = find_max(a, n);
        System.out.println("Max sum in sub array : " + res);
        in.close();
    }    
}
