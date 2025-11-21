package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class P_169_MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            //{             3:2, 2:1}
        }
        //                          3:2.       {3:2} {2:1}
        for(Map.Entry<Integer, Integer> pair : map.entrySet()){
            int value = pair.getValue(); // 2
            if(value > n/2){
                return pair.getKey();
            }
        }
        throw new IllegalArgumentException();

    }
}
