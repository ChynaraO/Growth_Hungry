package Hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class P09092025 {
    public static void main(String[] args) {
        int [] nums = {1,3,4,5,6,3,9}; //k=9
        //    1 = 4+5
        // 2 =6+3
        //3 =9
//        System.out.println(numsOfSubarrays(nums, 9));
        System.out.println(numsOfSubarraysWithHashMap(nums, 9));
        int [] n1 = {1,2,3,0,0,0};
        int[] n2 = {2,5,6};
        int []l = {1,2,3,4,5,6,7};

    }
    public static int numsOfSubarrays(int[] nums, int k){
        int count = 0;

        for(int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j<nums.length; j++){
                System.out.println("i: " + nums[i]);
                System.out.println("j: " + nums[j]);
                sum+=nums[j];
                if(sum == k){
                    count++;
                    System.out.println("count: " + count);
                }
            }
        }

        return count;
    }
    public static int numsOfSubarraysWithHashMap(int[] nums, int k){
        int count = 0;
        HashMap <Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int currentSum = 0;
       // {1,3,4,5,6,3,9}
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            System.out.println("CurrentSum: "+ currentSum);
            int targetSum = currentSum - k;
            System.out.println("targetSum: " + targetSum);
            if(map.containsKey(targetSum)){
                count+= map.get(targetSum);
            }
            map.put(currentSum, map.getOrDefault(currentSum, 0)+1);
        }
        System.out.println("count: " + count);
        return count;
    }
    public int[] intersect(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int i = 0, j = 0, k = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        while (i < l1 && j < l2) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                nums1[k++] = nums1[i++];
                j++;
            }
        }
        return Arrays.copyOfRange(nums1, 0, k);
    }/*

Input: nums1 = [4,9,9], nums2 = [9,4,9,8,4]
                4,5,  9
                4,4,8,9,9
Output: [4,9]
Explanation: [9,4] is also accepted.
     */
}
