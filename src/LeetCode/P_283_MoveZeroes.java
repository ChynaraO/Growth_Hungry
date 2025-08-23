package LeetCode;

public class P_283_MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int index = 0;
        int i = 0;
        int l = nums.length;
        while(i<l){
            if(nums[i]!=0){
                nums[index++] = nums[i];
            }
            i++;
        }
        while(index<nums.length){
            nums[index++]=0;
        }
    }

    public static void main(String[] args) {
        int [] n = {0,1,0,3,12};
        moveZeroes(n);
    }
}
