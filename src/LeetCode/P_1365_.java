package LeetCode;

import java.util.Arrays;

public class P_1365_ {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int [] res = new int [nums.length];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j] && i != j) {
                    count++;
                }
            }
            res[i] = count;
            count = 0;
        }
        return res;
    }

    public static void main(String[] args) {
        int [] nums = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums))); //[4, 0, 1, 1, 3]
    }
}
