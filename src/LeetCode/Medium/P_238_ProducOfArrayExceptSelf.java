package LeetCode.Medium;

import java.util.Arrays;

public class P_238_ProducOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
    int n = nums.length;
    int[] answer = new int[n];
    for(int i = 0; i<n; i++){
        int productExceptSelf = 1;
        for(int j = 0; j<n; j++) {

            if (i != j) {
                productExceptSelf *= nums[j];
            }
        }
        answer[i] = productExceptSelf;
    }
    return answer;
    }
    public static int[] productExceptSelf1(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
       //   1 2 3 4
        // [1,2,3,4]
        // prefix_mul = 1, 2, 6,24
        //suffix_mul =24,24,12, 4
        //answer [i] = prefix_mul[i-1] * suffix_mul[i+1]
        //answer[1] = prefix_mul[0] * suffix_mul[2]
        //answer[1] = 1*12 =12 correct
        //answer[0] =
        int[] prefix_mul = new int[n];
        prefix_mul[0] = nums[0];
        for(int i = 1; i<n; i++){
            prefix_mul[i] =
                    prefix_mul[i-1] *
                            nums[i];
        }
        int [] suffix_mul = new int[n];
        suffix_mul[n-1] = nums[n-1];
        for (int i = n-2; i>=0; i--){
            suffix_mul[i] = suffix_mul[i+1] * nums[i];
        }
        answer[0] = suffix_mul[1];
        answer[n-1] = prefix_mul[n-2];
        for (int i = 1; i<n-1; i++){
            answer[i] = prefix_mul[i-1] * suffix_mul[i+1];
        }
        return answer;
    }
    public static int[] productExceptSelf2(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        int product_all = 1;
        for(int x : nums){
            product_all *= x;
        }
        for (int i = 0; i< n; i++){
            answer[i] = product_all / nums[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
        //[24, 12, 8, 6]
    }
}
