package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class P_169_MajorityElementHashMap {
/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than
 ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 */
public  static int majorityElement(int[] nums) {
    Map<Integer, Integer> freq = new HashMap<>();
    for(int i : nums){
        freq.put(i, freq.getOrDefault(i, 0)+1);
    }
    for(Map.Entry<Integer,Integer> entry : freq.entrySet()){
        if(entry.getValue()> nums.length/2){
            return entry.getKey();
        }
    }
    return Integer.MIN_VALUE;
}

    public static void main(String[] args) {
        int[] n = {4,2,3,4,4,4};
        System.out.println(majorityElement(n));
    }
}
