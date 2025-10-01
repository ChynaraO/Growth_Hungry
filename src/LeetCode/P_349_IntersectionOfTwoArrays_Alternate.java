package LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class P_349_IntersectionOfTwoArrays_Alternate {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<>();


        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (set1.contains(nums2[i])) {
                set2.add(nums2[i]);
            }
        }

        int[] num = new int[set1.size()];
        int index = 0;
        for (Integer n : set2) {
            num[index++] = n;
        }
        return num;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3, 4};
        int[] num2 = {2, 3, 1};
        System.out.println(Arrays.toString(intersection(nums, num2)));
        System.out.println(Arrays.toString(res(nums, num2)));
    }

    public static int[] res(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        Set<Integer> setForFirstArr = new HashSet<Integer>();
        Set<Integer> result = new HashSet<Integer>();

        for (int i = 0; i < m; i++) {
            setForFirstArr.add(nums1[i]);
        }
        for (int j = 0; j < n; j++) {
            if (setForFirstArr.contains(nums2[j])) {
                result.add(nums2[j]);
            }
        }
        int[] res = new int[result.size()];
        int index = 0;
        for (Integer num : result) {
            res[index++] = num;
        }
        return res;
}
}
