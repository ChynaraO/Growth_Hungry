package LeetCode.Easy;

public class P_905_SortArraybyParity {
    public int[] sortArrayByParity(int[] nums) {
        int [] sorted = new int[nums.length];

        int evenIndex = 0;
        int oddIndex = nums.length-1;
        int i = 0;

        while(evenIndex <= oddIndex){
            if(nums[i] % 2 == 0){
                sorted[evenIndex++] = nums[i++];
            }else{
                sorted[oddIndex--] = nums[i++];
            }
        }
        return sorted;
    }
}
