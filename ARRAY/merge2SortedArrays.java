package ARRAY;

import java.util.Arrays;
import java.util.Scanner;

// This is a brute force approach to merge 2 sorted array
// time complexity O(N) + O(N) + nlogn + O(N)
// space complexity : O(n+m)

public class merge2SortedArrays {

    public static void merge_arrays(int a1[], int n1, int a2[], int n2){
        int n3 = n1 + n2;
        int a3[] = new int[n3];
        int ctr = 0;
        for(int i = 0; i < n1; i++, ctr++)
            a3[i] = a1[i];
        for(int j = 0; j < n2; j++, ctr++)
            a3[ctr] = a2[j];
        Arrays.sort(a3);
        System.out.println("Array A1");
        printArray(a1);
        System.out.println("Array A2");
        printArray(a2);
        System.out.println("Array A3 after merged & sorted");
        printArray(a3);
        
    }

    static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st array length : ");
        int n1 = in.nextInt();
        int a1[] = new int[n1];
        System.out.println("Enter element in 1st array : ");
        for(int i =0; i<n1;i++)
             a1[i] = in.nextInt();
        System.out.print("Enter 2nd array length : ");
        int n2 = in.nextInt();
        int a2[] = new int[n2];
        System.out.println("Enter element in 2nd array : ");
        for(int i =0; i<n2;i++)
             a2[i] = in.nextInt();
        merge_arrays(a1,n1,a2,n2);
        in.close();
    }
}
