package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class P_217_ContainsDuplicates {
    public static boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> numbers = new HashMap<>();
    //{1:2, 2:1 }
    boolean containsDuplicates = false;
        for(int i = 0; i<nums.length; i++){
        if(numbers.containsKey(nums[i])){
            numbers.put(nums[i], numbers.get(nums[i]) +1);
            containsDuplicates = true;
            break;
        } else{
            numbers.put(nums[i], 1);
        }
    }
        return containsDuplicates;
}

    public static void main(String[] args) {
       int[] nums = {1,2,3,4,5,3,2};
        System.out.println(containsDuplicate(nums));
    }
}
