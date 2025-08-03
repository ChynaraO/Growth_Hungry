package LeetCode;

public class P_26_Myself {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int counter = 1;
        int pointer = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) { // 1 1
                nums[pointer] = nums[i];
            } else {
                nums[++pointer] = nums[i];
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
       int[] nums = {0,1,1,2,3,3};
        System.out.println(removeDuplicates(nums));
    }
}
