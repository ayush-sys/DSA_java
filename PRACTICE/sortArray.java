package PRACTICE;


// this is a variation of dutch national flag problem
// sort arrays of 0's, 1's & 2's
// practice link : https://leetcode.com/problems/sort-colors/


public class sortArray {

    //brute force appraoch, time complex: O(n) + O(n) & space complex: O(1)
    public static int[] sort_array(int[] nums){
        int res[] = new int[3];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0)
                res[0]++;
            if(nums[i] == 1)
                res[1]++;
            if(nums[i] == 2)
                res[2]++;
        }

        for (int i = 0; i < res[0]; i++)
            nums[i] = 0;
 
        // Putting the 1's in the array after the 0's.
        for (int i = res[0]; i < ( res[0] + res[1]); i++)
            nums[i] = 1;
 
        // Putting the 2's in the array after the 1's
        for (int i = (res[0] + res[1]); i < nums.length; i++)
            nums[i] = 2;

        return nums;
    }


    // Optimized approach, time complexity: O(N) & space complexity: O(1)
    public static void opt_sort_array(int[] nums){
        int low = 0, mid = 0, high = nums.length - 1;
        while(mid <= high){
            switch(nums[mid]){
                case 0:{
                    int temp = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp;
                    mid++;
                    low++;
                    break;
                }
                case 1:{
                    mid++;
                    break;
                }
                case 2:{
                    int temp = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = temp;
                    high--;
                    break;
                }
            }
        }
    }


    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 0, 1, 2, 1, 2, 0};
        // int[] res_nums = sort_array(nums);
        // for (int i = 0; i < res_nums.length; i++) {
        //     System.out.print(res_nums[i] + " ");
        // }

        System.out.println("Array before sorting : ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        opt_sort_array(nums);
        System.out.println("Array after sorting : ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
