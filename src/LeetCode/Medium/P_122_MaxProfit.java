package LeetCode.Medium;

public class P_122_MaxProfit {
    public static int MaxProfit(int [] nums){
        int profit = 0;
       for(int i = 0; i<nums.length-1; i++){
           int buy = 0;

           if(nums[i]<nums[i+1]){
                buy = nums[i];
               if(i<nums.length-1 && buy<nums[i+1]){
                   profit = profit + (nums[i+1] - buy);
               }
           }
       }
        return profit;
    }
    public static int maxProfitFromShabbdan(int[] prices) {
        int profit=0;

        for(int i=1; i<prices.length; i++){
            if(prices[i]>prices[i-1]){
                profit += prices[i]-prices[i-1];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int [] nums = {7,1,5,3,6,4};
        int [] nums1 = {1,2,3,4,5};
        int [] nums2 = {7,6,4,3,1};

        System.out.println(MaxProfit(nums));//7
        System.out.println(MaxProfit(nums1));//4
        System.out.println(maxProfitFromShabbdan(nums2));//0
    }
}
