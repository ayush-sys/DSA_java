package SORTING;

import java.util.Scanner;

public class selectionSort {

    public static void selection_sort(int arr[], int n)
    {
        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // if(min_idx != 1)
            swap(arr, min_idx, i);
        }
    }

    public static void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
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
        selection_sort(a, n);
        System.out.println("Array after sorting : ");
        print_array(a, n);
        in.close();
    }
}
