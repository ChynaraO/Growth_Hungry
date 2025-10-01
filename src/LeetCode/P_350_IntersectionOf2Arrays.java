package LeetCode;

import java.util.*;

public class P_350_IntersectionOf2Arrays {
        public  static int[] intersect(int[] nums1, int[] nums2) {
            Map<Integer, Integer> map = new HashMap<>();
            List<Integer> resultList = new ArrayList<>();

            // Count frequencies in nums1
            for (int num : nums1) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }

            // Match with nums2
            for (int num : nums2) {
                if (map.containsKey(num) && map.get(num) > 0) {
                    resultList.add(num);
                    map.put(num, map.get(num) - 1); // decrement count
                }
            }

            // Convert List -> int[]
            int[] result = new int[resultList.size()];
            for (int i = 0; i < resultList.size(); i++) {
                result[i] = resultList.get(i);
            }
            return result;
        }


    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1, 5};
        int[] nums2 = {2, 2};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }
    public static int [] num (int[] nums1, int[] nums2){
         Map<Integer, Integer> map = new HashMap<>();
         List<Integer> result = new ArrayList<>();

         for (int num: nums1){
             map.put(num, map.getOrDefault(num, 0) + 1);
         }

         for (int num: nums2){
             if(map.containsKey(num) && map.get(num) > 0){
                 result.add(num);
                 map.put(num, map.get(num) - 1);
             }
         }
//         int [] res = new int[result.size()];
//         for (int i = 0; i<result.size(); i++){
//             res[i] = result.get(i);
//         }
        return result.stream().mapToInt(i -> i).toArray();
    }

}
