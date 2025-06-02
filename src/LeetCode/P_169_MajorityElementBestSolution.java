package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class P_169_MajorityElementBestSolution {
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
   int count = 0;
   int candidate = -1;
   for(int num: nums){
       if(count == 0) candidate = num;
       if (candidate == num) count++;
       else count--;
   } return candidate;
}

    public static void main(String[] args) {
        int[] n = {4,2,3,4,4,4};
        System.out.println(majorityElement(n));
    }
}
