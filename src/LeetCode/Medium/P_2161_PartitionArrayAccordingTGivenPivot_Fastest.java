package LeetCode.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P_2161_PartitionArrayAccordingTGivenPivot_Fastest {
    public static int[] pivotArray(int[] nums, int pivot) {
            int[] numsResult = new int[nums.length];

            int freqPivot = 0;
            int insertposition = 0;
            for(int i:nums){
                if(i<pivot){
                    numsResult[insertposition++] = i;
                } else if(i==pivot){
                    freqPivot++;
                }
            }
            while(freqPivot>0){
                numsResult[insertposition++] = pivot;
                freqPivot--;
            }
            for(int i : nums){
                if(i>pivot){
                    numsResult[insertposition++]= i;
                }
            }
            return numsResult;
    }

    public static void main(String[] args) {
        int [] nums = {9,12,5,10,14,3,10};
        System.out.println(Arrays.toString(pivotArray(nums, 10)));
    }
}

