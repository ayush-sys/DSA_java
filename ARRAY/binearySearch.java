package ARRAY;

/**
 * binearySearch
 */
public class binearySearch {

    static int binary_search(int[] a, int key){
        int mid, start = 0, end = a.length;

        while(start <= end){
            mid = (start + end) / 2;
            if(a[mid] == key)
                return 1;
            if(a[mid] < key){
                start = mid + 1;
            }else{
                end = mid -1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int a[] = {10,23,45,70,90,100,111, 123}, key = 45;
        if(binary_search(a, key) == 1)
            System.out.println("No found");
        else 
            System.out.println("No not found !");
    }
}