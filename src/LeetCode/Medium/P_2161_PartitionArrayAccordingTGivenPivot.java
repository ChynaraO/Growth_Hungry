package LeetCode.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P_2161_PartitionArrayAccordingTGivenPivot {
    public static int[] pivotArray(int[] nums, int pivot) {
        List<Integer> list = new ArrayList<>();
        for(int i : nums){
            if(i<pivot){
                list.add(i);
            }
        }
        for(int i : nums){
            if(i==pivot){
                list.add(i);
            }
        }
        for(int i : nums){
            if(i>pivot){
                list.add(i);
            }
        }
        int[] result = new int[list.size()];
        int j = 0;
        for(int i : list){
            result[j++] = i;
        }
        return result;
    }

    public static void main(String[] args) {
        int [] nums = {9,12,5,10,14,3,10};
        System.out.println(Arrays.toString(pivotArray(nums, 10)));
    }
}

