package SORTING;

import java.util.Scanner;

public class insertionSort {
    
    public static void insertion_sort(int a[], int n) {
        for (int i = 1; i < n; i++) {
            int temp = a[i];
            int j = i-1;
            while(j>=0 && a[j]>temp){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = temp;
        }
    }

    public static void print_array(int a[], int n) {
        for(int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i = 0; i<n; i++)
            a[i] = in.nextInt();
        System.out.println("Array before sorting : ");
        print_array(a, n);
        insertion_sort(a, n);
        System.out.println("Array after sorting : ");
        print_array(a, n);
        in.close();
    }
}
