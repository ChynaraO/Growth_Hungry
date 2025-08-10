package LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class P_349_IntersectionOfTwoArrays_Myself {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<Integer>();

        for(int i = 0; i<nums1.length; i++){
            for(int j = 0; j<nums2.length; j++){
                if(nums1[i]==nums2[j]){
                    set.add(nums1[i]);
                    break;
                }
            }
        }
        int len = set.size();
        int[] num = new int[len];
        int index = 0;
        for(int n : set){
            num[index++] = n;
        }
        return num;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,3,4};
        int[] num2 = {2,3,1};
        System.out.println(Arrays.toString(intersection(nums, num2)));
    }
}
