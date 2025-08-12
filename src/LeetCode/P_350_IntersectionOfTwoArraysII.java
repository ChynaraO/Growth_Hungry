package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P_350_IntersectionOfTwoArraysII {
        public static int[] intersect(int[] nums1, int[] nums2) {
            int[] min = (nums1.length <= nums2.length) ? nums1 : nums2;
            int[] max = nums1.length > nums2.length ? nums1 : nums2;
            List<Integer> list = new ArrayList<>();
            int index = 0;

            for(int i = 0; i<min.length; i++){
                for(int j = 0; j<max.length; j++){
                    if(min[i]==max[j] ){
                        list.add(max[j]);
                        max[j] = -1;
                        break;
                    }
                }
            }
            int listsize = list.size();
            int [] numsarray = new int[listsize];
            int i = 0;
            for(int n : list){
                numsarray[i++] = n;
            }
            return numsarray;
        }


    public static void main(String[] args) {
            int[] nums1 = {1,2};
            int[] nums2 = {1,1};
        System.out.println(Arrays.toString(intersect(nums1,nums2)));
    }
}
