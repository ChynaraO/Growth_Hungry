package LeetCode.Medium;

public class P_153 {
    public static int findMinInRotatedSortedArray(int[] nums){
        int n = nums.length;
        //empty nums
        if(nums==null || n==0) return 0;
        //just a single element
        if(n==1) return nums[0];
        //array was rotated n times=> same as not rotated
        if(nums[0]<nums[n-1]) return nums[0];

        //[4,5,6,7,0,1,2]
        int left = 0;
        int right = n-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            //if nums[middle] is the inflection point, return the nums[middle] ( where the function starts growing
            if(mid>0 && nums[mid] < nums[mid-1]) return nums[mid];
            if(nums[mid] > nums[right]) left = mid+1;
            else right = mid-1;
        }
        //shouldn't reach here;
        return -1;
    }

    public static void main(String[] args) {
        int [] nums = {2,3,4,0,1};
        System.out.println(findMinInRotatedSortedArray(nums));
    }
}
