package LeetCode.Medium;

import java.util.Arrays;

public class P_75_SortColors_Faster {
    public static void sortColors(int[] nums) {
       int position = 0;
       for(int i = 0; i < nums.length; i++){
           if(nums[i] == 0) swap(nums, i, position++);
       }
       for(int i = position; i < nums.length; i++){
           if(nums[i] == 1) swap(nums, i, position++);
       }
        System.out.println(Arrays.toString(nums));
    }
    private static void swap (int [] nums, int start, int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;

    }

    public static void main(String[] args) {
        int [] nums1 = {2,0,2,1,1,0};
        sortColors(nums1);
    }
}
