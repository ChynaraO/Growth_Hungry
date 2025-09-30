package LeetCode.Medium;

import java.util.HashSet;
import java.util.Set;

public class P_128_LongestConsequtiveSequence {
    public static int longestConsecutive(int[] nums) {
        Set<Integer> numbers = new HashSet<>();
        for(int n : nums){
            numbers.add(n);
        }
        int longest_streak = 0;
        for(int num : numbers){
            if(!numbers.contains(num-1)){
                int start = num;
                int end = num;
                while(numbers.contains(end+1)){
                    end++;
                }
                longest_streak = Math.max(longest_streak, (end-start+1));
            }
        }
        return longest_streak;
}

    public static void main(String[] args) {
        int [] nums = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));
    }
}
