package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class P_228_SummaryRanges {
    public static List<String> summaryRanges(int[] nums) {
        List<String> ranges = new ArrayList<>();
        if(nums.length == 0) return ranges;
        int start = nums[0];
        int end = -1;
        for(int i = 1; i< nums.length; i++){
            if(nums[i] != nums[i-1]+1){
                end = nums[i-1];
                if(start != end){
                    ranges.add(Integer.toString(start) + "->" + Integer.toString(end));
                } else {
                    ranges.add(Integer.toString(start));
                }
                start = nums[i];
            }
        }
        end = nums[nums.length-1];
        if(start != end){
            ranges.add(Integer.toString(start) + "->" + Integer.toString(end));
        } else{
            ranges.add(Integer.toString(start) );
        }
//            ranges.add(start == end ? Integer.toString(start) : Integer.toString(start) + "->" + Integer.toString(end));
        return ranges;
    }


    public static void main(String[] args) {
        int [] nums = {1,2,4,5,7,9};
        System.out.println(summaryRanges(nums));
    }
}
