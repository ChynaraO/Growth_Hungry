package JavaIntensive.W6_HW;

public class TwoSum {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 2, 11, 15};
        int target = 9;

        // Call the twoSum method
        int[] result = twoSum(numbers, target);

        // Print the result
        System.out.println("Numbers found: " + result[0] + " and " + result[1]);
    }
        public static int[] twoSum(int[] nums, int target) {
            int [] result = new int[2];
            for(int i = 0; i<nums.length-1; i++){
                if((nums[i]+nums[i+1])==target){
                    result[0] = nums[i];
                    result[1] = nums[i+1];
                }
            }
                return result;
        }

}
