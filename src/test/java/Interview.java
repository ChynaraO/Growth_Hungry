import java.util.HashMap;

public class Interview {
    /*
Given an array of integers and a target sum, find two numbers
 in the array that add up to the target. Return their indices.

  EXAMPLE:     //0, 1, 2,   3
  Input: nums = [11,2, 7, 11, 15], target = 9
 Output: [0, 1]
 Explanation: nums[0] + nums[1] = 2 + 7 = 9
 */
    public static int[] twoSumHashMap(int [] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        //key: number value, value: index of the number
        for(int i = 0; i< nums.length; i++){ //iterate through each number
            int complement = target - nums[i]; // to find the difference 9-2 = 7
            if(map.containsKey(complement)){ // check the map it already has the number we need
                return new int[]{map.get(complement), i}; //return index of complement and current index
            } else {
                map.put(nums[i], i ); // add a number to the map and its index
               // {11:0, 2:1,
            }
        }
        return new int[]{-1, -1};
    }
    //brute force time : O(n^2), space: O(1)
    //optimized time   : O(n),   space: O(n)

}
