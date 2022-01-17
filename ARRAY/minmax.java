package ARRAY;

// time complexity : O(n)

public class minmax{
    static class Pair{
        int min, max;
    }
    static Pair getMinMax(int[] arr){
        int n = arr.length;
        Pair minmax = new Pair();
        if(n == 1){
            minmax.max = arr[0];
            minmax.min = arr[0];
        }

        if(arr[0] > arr[1]){
            minmax.max = arr[0];
            minmax.min = arr[1];
        }else{
            minmax.max = arr[1];
            minmax.min = arr[0];
        }

        for(int i=2;i<n;i++){
            if(arr[i] > minmax.max)
                minmax.max = arr[i];
            else if(arr[i] < minmax.min)
                minmax.min = arr[i];
        }
        return minmax;
    }
    public static void main(String[] args) {
        int[] arr = {12, 140, 76, 900, 24, 98, 678};
        Pair minmax = getMinMax(arr);
        System.out.println("Max : " + minmax.max);
        System.out.println("Min : " + minmax.min);
    }
}
