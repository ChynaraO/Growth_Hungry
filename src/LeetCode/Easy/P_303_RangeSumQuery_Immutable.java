package LeetCode.Easy;

   class P_303_RangeSumQuery_Immutable {
       int[] prefix;

       public P_303_RangeSumQuery_Immutable(int[] nums) {
           int n = nums.length;
           prefix = new int[n + 1];
           prefix[0] = 0;
           for (int i = 1; i <= n; i++) {
               prefix[i] = prefix[i - 1] + nums[i - 1];
           }
       }

       public int sumRange(int left, int right) {
           left++;
           right++;
           return prefix[right] - prefix[left - 1];
       }
   public static class ain{
        public static void main(String[] args) {
            // Example:
            P_303_RangeSumQuery_Immutable obj = new P_303_RangeSumQuery_Immutable(new int[]{-2, 0, 3, -5, 2, -1});
            int sum1 = obj.sumRange(0, 2); // returns 1  ( -2 + 0 + 3 )
            int sum2 = obj.sumRange(2, 5); // returns -1 ( 3 + -5 + 2 + -1 )
            int sum3 = obj.sumRange(0, 5); // returns -3 ( sum of whole array )
            System.out.println(sum1);
            System.out.println(sum2);
            System.out.println(sum3);
        }
    }

}
