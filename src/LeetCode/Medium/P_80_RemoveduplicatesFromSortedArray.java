package LeetCode.Medium;

public class P_80_RemoveduplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int position = 2;
        for(int i = 2; i<nums.length; i++) {
            if (nums[i] != nums[position-2]){
                nums[position++] = nums[i];
            }
        }
        return position;
    }

    public static void main(String[] args) {
       int[] nums = {1,1,1,2,2,3};
        System.out.println(removeDuplicates(nums));
    }
}
