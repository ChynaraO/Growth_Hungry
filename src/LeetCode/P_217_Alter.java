package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class P_217_Alter {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numsC = new HashSet<>();
        for(int num : nums){
            if(!numsC.add(num)){
                return true;
            }
        }
        return false;
    }
}
