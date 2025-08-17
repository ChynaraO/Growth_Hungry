package LeetCode.Medium;

import java.util.Arrays;

public class P_75_SortColors {
    public static void sortColors(int[] nums) {
        int ZeroPos = 0;
        int TwosPos = nums.length - 1;
        int i = 0;
        while (i <= TwosPos) {
            if (nums[i] == 0) {
                swap(nums, ZeroPos, i);
                ZeroPos++;
                i++;
            } else if (nums[i] == 1) {
                i++;
            } else {
                swap(nums, i, TwosPos);
                TwosPos--;
            }
        }
    }

    public static void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 0, 0, 1};
        sortColors(nums); //0 0 1 1 2 2
    }
}
