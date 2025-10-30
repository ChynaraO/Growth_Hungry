package LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class P_645_SetMismatch {
    public static int[] findErrorNums(int[] nums) {
        int [] res = new int[2];
        Set <Integer> hashset = new HashSet();
        int j = 1;
        Arrays.sort(nums);
        //2 2
        for(int i = 0; i<nums.length; i++){
            if(j != nums[i] && !hashset.contains(j)){
                res[1] = j;
            }
            if(hashset.contains(nums[i]))
                res[0] = nums[i];

            hashset.add(nums[i]);
            j++;

        }
        return res;
    }
    public static int[] findErrorNumsWithSet(int[] nums) {
        int [] res = new int[2];
        Set <Integer> hashset = new HashSet();
        int j = 1;
        //2 2
        for(int i = 0; i<nums.length; i++) {
            if (hashset.contains(nums[i])) { //missing
                res[0] = nums[i];
            }
            hashset.add(nums[i]);
        }
        for(; j<= nums.length; j++){
            if(!hashset.contains(j)){ //duplicate
                res[1] = j; break;}
        }
        return res;
    }

    public static void main(String[] args) {
        int []nums = {1,2,2,4}; //2,3
        int [] nums1={1,1};//1,2
        //Find the number that occurs twice and the number that is missing and return them in the form of an array.
        System.out.println(Arrays.toString(findErrorNumsWithSet(nums1)));
    }
}
