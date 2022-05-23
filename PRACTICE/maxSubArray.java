package PRACTICE;

import java.util.Scanner;

//Find maximum sum of a subarray in a given array.
// Time complexity: O(n)
// Space complexity: O(1), i'e constant


public class maxSubArray {

    public static int maxSumSubArray(int a[], int n){
        int maxSum = 0, currSum = 0;
        for(int i = 0; i < n; i++){
            currSum += a[i];
            if(currSum > maxSum)
                maxSum = currSum;
            if(currSum < 0)
                currSum = 0;
        }

        return maxSum;
    }

    public static void printArray(int arr[])
	{
		for (int i = 0; i < arr.length; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array length : ");
        int n = in.nextInt();
        int a[] = new int[n];
        System.out.println("Enter values in an array : ");
        for(int i = 0; i < n; i++){
            a[i] = in.nextInt();
        }
        printArray(a);
        int ans = maxSumSubArray(a, n);
        System.out.println("Max sum = " + ans);
        in.close();
    }    
}
