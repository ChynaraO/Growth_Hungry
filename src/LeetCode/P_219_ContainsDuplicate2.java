package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class P_219_ContainsDuplicate2 {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            if(map.containsKey(nums[i]) && ((i - map.get(nums[i]) <= k))){
                return true;
            }
            else {
                map.put(nums[i], i);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] n = { 1, 2, 1,0};
        System.out.println(containsNearbyDuplicate(n,1));
    }
}
