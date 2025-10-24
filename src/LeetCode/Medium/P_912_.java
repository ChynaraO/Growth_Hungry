package LeetCode.Medium;

import java.util.Arrays;

public class P_912_ {

    public static int[] sortArray(int[] nums) {

        int n = nums.length;
        for (int i = 0; i < n - 1; i++) { //5,2,3,1]
            boolean swap = false;
            for (int j = 0; j < n - i - 1; j++) { //5
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swap = true;
                }
            }
        if (!swap) break;
    }
    return nums;
}


    public static void main(String[] args) {
int [] nums = {5,1,1,2,0,0};
        System.out.println(Arrays.toString(sortArray(nums)));
    }
}
