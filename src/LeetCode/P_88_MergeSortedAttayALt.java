package LeetCode;

import java.util.Arrays;

public class P_88_MergeSortedAttayALt {
    public static int []  merge(int[] nums1, int m, int[] nums2, int n) {
        int position = (n+m)-1;
        int ml = m-1;
        int nl = n-1;


        while(ml>=0 && nl>=0){
            if(nums1[ml] >= nums2[nl]){
                nums1[position--] = nums1[ml--];
            } else {
                nums1[position--] = nums2[nl--];
            }
        }
        while(nl>=0){
            nums1[position] = nums2[nl];
            position--;
            nl--;
        }
        System.out.println();
return nums1;
    }

    public static void main(String[] args) {
//        int[] nums1 = {1,2,3,0,0,0}; //m = 3,
        int[] nums1 = {}; //m = 3,
//                int [] nums2 = {2,5,6};// n = 3
        int [] nums2 = {1};// n = 3
        System.out.println(Arrays.toString(merge(nums1, 0, nums2, 1)));
    }
}
