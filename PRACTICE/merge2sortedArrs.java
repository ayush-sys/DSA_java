package PRACTICE;
import java.util.*;


// Merge 2 sorted arrays where n1 > n2
// Time complexity is O(n1*n2)
// Space complexity is O(1), i.e constant

public class merge2sortedArrs {

    public static void merge_arrays(int a1[], int n1, int a2[], int n2) {
        for(int i = 0; i < n1; i++){
          if(a1[i] > a2[0]){
               int temp = a1[i];
               a1[i] = a2[0];
               a2[0] = temp;
          }
          Arrays.sort(a2);
        }
    }

    static void printArray(int arr[])
	{
		for (int i = 0; i < arr.length; ++i)
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
        System.out.println("A1 array : ");
        printArray(a1);
        System.out.println("A2 array : ");
        printArray(a2);
        merge_arrays(a1,n1,a2,n2);
        System.out.println("After merged & sorted array1 : ");
        printArray(a1);
        System.out.println("After merged & sorted array2 : ");
        printArray(a2);
        in.close();
     }
}
