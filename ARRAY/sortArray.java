package ARRAY;

public class sortArray {
    public static void sort(int a[]){
        int n = a.length, low = 0, mid = 0, high = n-1;
        while(mid <= high){
            if(a[mid] == 0){
                int temp = a[low];
                a[low] = a[mid];
                a[mid] = temp;
                low++;
                mid--;
            }
            else if(a[mid] == 1)
                mid++;
            else{
                int temp = a[mid];
                a[mid] = a[high];
                a[high] = temp;
                high--;
            }
        }
    }
    public static void main(String[] args) {
        int a[] = {0, 2, 1, 2, 0};
        for(int i=0;i<a.length;i++)
            System.out.print(a[i] + " ");
        System.out.println();
        sort(a);
        for(int i=0;i<a.length;i++)
            System.out.print(a[i] + " ");
    }
}
