package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P_1365_HashMap {
    public static  int[] smallerNumbersThanCurrent(int[] nums) {
        int [] res = new int[nums.length];
        Map<Integer, Integer> numSmallerThanTheCurrentNumber = new HashMap<>();
        int [] copyOfNums = nums.clone();
        Arrays.sort(copyOfNums);
        for(int i = 0; i< copyOfNums.length; i++){
            numSmallerThanTheCurrentNumber.putIfAbsent(copyOfNums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            res[i] = numSmallerThanTheCurrentNumber.get(nums[i]);
        }
        return res;

    }
    public static void main(String[] args) {
        int [] nums = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums))); //[4, 0, 1, 1, 3]
    }
}
