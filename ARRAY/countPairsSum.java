package ARRAY;

import java.util.Scanner;

public class countPairsSum {


    public static int find_sumPair( int A[], int n, int K){
        int ctr = 0;
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if(A[i] + A[j] == K)
                    ctr++;

        return ctr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = in.nextInt();
        System.out.print("Enter k : ");
        int k = in.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements in array : ");
        for(int i = 0; i < n; i++)
            arr[i] = in.nextInt();
        int res = find_sumPair(arr, n, k);
        System.out.println(res);
        in.close();
    }
}


// Time complexity is O(n^2)
