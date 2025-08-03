package LeetCode;

public class P_27_Myself {
    public static int removeElement(int[] nums, int val) {
        int index = 0;
        int i = 0;
        while(i < nums.length){
            if(nums[i] != val){
                nums[index++] = nums[i];
            }
            i++;
        }
        return index;
    }

    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 4, 0};
        System.out.println(removeElement(nums, 2));
    }
}
