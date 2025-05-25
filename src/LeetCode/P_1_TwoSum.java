package LeetCode;

import java.util.HashMap;

public class P_1_TwoSum {
    public static int[] TwoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];
            if (map.containsKey(compliment)) {
                return new int[]{map.get(compliment), i};
            } else {
                map.put(nums[i], i);
            }
        }

        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15, 7, 11};
        int target = 18;
        int[] result = TwoSum(nums, target);
        System.out.println(result[0] + " " + result[1]);
    }
}


