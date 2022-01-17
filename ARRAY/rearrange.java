package ARRAY;

public class rearrange {
    static void rearrange_array(int a[]){
        int n=a.length, j=0, temp;
        for(int i=0; i<n; i++){
            if(a[i] < 0){
                if(i!=j){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int a[] =  { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
        System.out.println("Before rearrange");
        for(int i=0; i<a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
        rearrange_array(a);
        System.out.println("After rearrange");
        for(int i=0; i<a.length; i++)
            System.out.print(a[i] + " ");
    }
}
