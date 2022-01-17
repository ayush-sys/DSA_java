package ARRAY;

// time complexity : O(n)

public class ksort {
    static int sort_arr(int[] arr, int key){
        for(int i = 0; i < arr.length; i++)
            for(int j = i+1; j < arr.length; j++){
                int temp = 0;
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        return (arr[key-1]);
    }
    public static void main(String[] args) {
        int arr[] = {32, 14, 76, 89, 15, 90, 34, 9};
        System.out.println("Kth smalllest element :" + sort_arr(arr, 3));
    }
}
