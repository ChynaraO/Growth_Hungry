package LeetCode;

import java.util.Arrays;

public class P_88_MergeSortedArray {
    public static int[] merged (int[]  nums1, int n, int[] nums2, int m){
        int i = n-1;
        int j = m-1;
        int k = m+n-1;
        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k--] = nums1[i--];
            } else{
                nums1[k--] = nums2[j--];
            }
        }
        while(j>=0){
            nums1[k--] = nums2[j--];
        }
        return nums1;
    }

    public static void main(String[] args) {
        int[] num = {1,1,1,0,0,0};
        int [] num2 = {2,3,4};
        System.out.println(Arrays.toString(merged(num, 3, num2,3)));
    }
}
