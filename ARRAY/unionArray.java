package ARRAY;


public class unionArray {

    static int print_union(int a[], int b[]){
        int m = a.length, n = b.length, i = 0, j = 0;
        while(i < m && j < n){
            if(a[i] < b[j])
                System.out.print(a[i++] + " ");
            else if(b[j] < a[i])
                System.out.print(b[j++] + " ");
            else{
                System.out.print(b[j++] + " ");
                i++;
            }
        }
        while(i < m)
            System.out.print(a[i++] + " ");
        while(j < n)
            System.out.print(b[j++] + " ");
        return 0;
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6}, b[] = {2,3,5,7};
        for(int i = 0; i<a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
        for(int i = 0; i<b.length; i++)
            System.out.print(b[i] + " ");
        System.out.println("After union : ");
        print_union(a, b);
    }
}
