package LeetCode;

import JavaIntensive.W4Class.zoo.Animal;

import java.util.Arrays;

public class P_977_SquaresOfASortedArray {
    public static int[] sortedSquares(int[] nums) {
        int pointer = nums.length-1;
        int right = nums.length-1;
        int left = 0;
        int[] res = new int[nums.length];
        while(0<=pointer){

        if(Math.abs(nums[right])>Math.abs(nums[left])){
                res[pointer--] = nums[right]*nums[right];
                right--;
            } else {
                res[pointer--] = nums[left]*nums[left];
                left++;
            }
        }
        return res;
    }

    public static void main(String[] args) {

        int[] nums = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
}
