package ALGORITHM;

import java.util.Scanner;

// https://practice.geeksforgeeks.org/problems/kadanes-algorithm/0

// this question uses Kadane's algortihm
// Time complexity : O(n)
// Space complexity : O(n)


public class maxSumSubArray {

    public static int find_max(int a[], int n){
        int maxSum = Integer.MIN_VALUE, currSum = 0;
        for(int i = 0; i < n; i++){
            currSum += a[i];
            if(currSum > maxSum)
                maxSum = currSum;
            if(currSum < 0)
                currSum = 0;
        }
        return maxSum;
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
