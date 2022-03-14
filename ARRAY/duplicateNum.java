package ARRAY;

import java.util.Scanner;

public class duplicateNum {
    public static int find_duplicate_num(int a[], int n){
        int num = a[0];
        for(int i = 0; i < n; i++){
            int ctr = 0, val = a[i];
            for(int j = 0; j < n; j++){
                if(val == a[j])
                    ctr++;
            }

            if(ctr == 2)
                num = a[i];
        }

        return num;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = in.nextInt();
        int a[] = new int[n+1];
        System.out.println("Enter values for an array, range (1 to " + n + ")");
        for(int i = 0; i < n + 1; i++){
            int temp = in.nextInt();
            if(temp < n)
                a[i] = temp;
        }
        int res = find_duplicate_num(a,n+1);
        System.out.println("Common element : " + res);
        in.close();
    }   
}
