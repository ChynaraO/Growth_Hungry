package LeetCode;

public class P_70_Climbing_Stairs_ForLoop {
    /*
    You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Example 1:

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step

Constraints:

1 <= n <= 45
     */
    public static int climbStairs(int n) {
        if (n <= 2) return n;

        int oneStepBefore = 2; //n-1
        int twoStepsBefore = 1; //n-2
        int allWays = 0;

        for (int i = 3; i <= n; i++) {
            allWays = oneStepBefore + twoStepsBefore;
            twoStepsBefore = oneStepBefore;
            oneStepBefore = allWays;
        }
        return allWays;
    }

//    public static int climbStairs(int n) {
//        if(n==0 || n==1) return 1;
//
//        return climbStairs(n-1)+climbStairs(n-2);
        //climbStairs(int 4)
        // climbStairs(3)                                       climbStairs(2)
        // climbStairs(2)+climbStairs(1);                         climbStairs(1)+climbStairs(0);
        // climbStairs(2)                 climbStairs(1)          1              1
        // climbStairs(1)+climbStairs(0);         1
        //     1                1

//    }
    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }
}
