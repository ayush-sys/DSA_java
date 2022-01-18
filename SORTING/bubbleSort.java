package SORTING;

import java.util.Scanner;

public class bubbleSort {

    public static void bubble_sort(int a[], int n) {
        boolean swapped = false;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-i-1; j++){
                if(a[j+1] < a[j]){
                    swapped = true;
                    swap(a, j, j+1);
                }
            }
            
            if(!swapped){
                break;
            }
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
        bubble_sort(a, n);
        System.out.println("Array after sorting : ");
        print_array(a, n);
        in.close();
    }
}
