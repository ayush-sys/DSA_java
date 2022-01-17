package ARRAY;


// Time complexity O(n)


public class reverse {

    // Iterative approach to solve given problem
	static void rvereseArray(int arr[])
    {
        int temp, start = 0, end = arr.length-1;
        while (start < end)
        {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }	

    // Recursive approach to solve given problem
    static void rverese_array(int arr[], int start, int end)
    {
        int temp;
        if (start >= end)
            return;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        rverese_array(arr, start+1, end-1);
    }


    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        for(int i = 0; i<arr.length; i++)
            System.out.print(arr[i] + " ");
        rvereseArray(arr);
        System.out.print("\nReversed array is \n");
        for(int i = 0; i<arr.length; i++)
            System.out.print(arr[i] + " ");
    }

}
    