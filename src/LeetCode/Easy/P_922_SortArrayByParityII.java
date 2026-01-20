package LeetCode.Easy;

import java.util.Arrays;

public class P_922_SortArrayByParityII {
//    public static int[] sortArrayByParityII(int[] nums) {
//    int i = 0;
//    int j = 1;
//    int l = nums.length;
//
//    while (i<l && j<l){
//
//        while(i<l && nums[i] % 2 == 0){ // if a value on even position is even check the next even position
//            i+=2;
//        }
//        while(j<l && nums[j] % 2 == 1){
//            j+=2;
//        }
//        // if a value on even position is odd or on the odd position is even
//        if(i<l && j<l){
//            swap(nums, i, j);
//        }
//    }
//    return nums;
//    }
//    public static void swap(int[] nums, int i,int j){
//        int temp = nums[i];
//        nums[i] = nums[j];
//        nums[j] = temp;
//    }

    public static void main(String[] args) {
        int [] n = {1,4,4,2,5,3};
        System.out.println(Arrays.toString(sortArrayByParityII(n)));
    }
    public static int[] sortArrayByParityII(int[] nums) {
        int evenPos = 0;
        int oddPos = 1;
        int l = nums.length;
        while(evenPos<l && oddPos<l){
            while(evenPos<l && nums[evenPos] % 2 == 0){
                evenPos+=2;
            }
            while (oddPos<l && nums[oddPos] % 2 != 0){
                oddPos+=2;
            }
            if(evenPos<l && oddPos<l){
                swap(nums, evenPos, oddPos);
            }
        }
        return nums;
    }
    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
