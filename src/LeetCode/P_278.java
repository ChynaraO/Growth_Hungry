package LeetCode;

public class P_278 {
    public int firstBadVersion(int [] nums){
        int left = 0;
        int right = nums.length-1;
        int answer = -1;
        while(left<=right){
            int mid = left + (right - left)/2;
            if(!isBadVersion(nums[mid])){
                left = mid+1;
            } else{
                answer = nums[mid];
                right = mid-1;
            }
        }
        return answer;
    }
    boolean isBadVersion(int n){
        if(n==4){
            return true;
        } else{
            return false;
        }
    }
}
