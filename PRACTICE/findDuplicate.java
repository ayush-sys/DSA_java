package PRACTICE;

import java.util.*;

public class findDuplicate {


    // brute force method
    // public static int find_common(int a[], int n){
    //     Arrays.sort(a);
    //     int num = 0;
    //     for(int i = 0; i < n; i++){
    //         int ctr = 0;
    //         for(int j = i+1; j < n; j++)
    //             if(a[i] == a[j])
    //                 ctr++;
    //         if(ctr > 0)
    //             num = a[i];
    //     }

    //     return num;
    // }


    public static int find_common(int a[], int n){
        int slow = a[0], fast = a[0];
        do{
            slow = a[slow];
            fast = a[a[fast]];
        }while(slow != fast);

        fast = a[0];
        while(slow != fast){
            slow = a[slow];
            fast = a[fast];
        }

        return slow;
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
        int ans = find_common(a, n);
        System.out.println("Common element in the array : " + ans);
        in.close();
    }    
}
