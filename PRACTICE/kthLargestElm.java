package PRACTICE;

import java.util.PriorityQueue;
import java.util.Scanner;

public class kthLargestElm {

    public static int find_kth_element(int a[], int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < k; i++)
            pq.add(a[i]);

        for(int j = k; j < a.length; j++){
            if(pq.peek() < a[j]){
                pq.poll();
                pq.add(a[j]);
            }
        }

        return pq.peek();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = in.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter values of arr : ");
        for(int i = 0;i < n; i++)
            arr[i] = in.nextInt();
        System.out.print("Enter Kth element : ");
        int k  = in.nextInt();
        System.out.println("Kth largest element in array is : " + find_kth_element(arr, k));
        in.close();
    }
}
