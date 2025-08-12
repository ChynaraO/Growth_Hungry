package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P_350_IntersectionOfTwoArraysIIAlternate {
        public static int[] intersect(int[] nums1, int[] nums2) {
            int l1 = nums1.length;
            int l2 = nums2.length;
            Arrays.sort(nums1);
            Arrays.sort(nums2);
            List<Integer> list = new ArrayList<>();
            int i = 0, j=0, k=0;

            while(i<l1 && j<l2){
                if(nums1[i] < nums2[j]){
                    i++;
                } else if (nums1[i] > nums2[j]) {
                    j++;
                } else {
                    nums1[k++] = nums1[i++];
                    j++;
                }
            }
            return Arrays.copyOfRange(nums1, 0, k);
        }


    public static void main(String[] args) {
            int[] nums1 = {1,2,2};
            int[] nums2 = {1,1,2};
        System.out.println(Arrays.toString(intersect(nums1,nums2)));
    }
}
