package LeetCode;

public class P_69_SqrtXAlter {
    /*
    Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

You must not use any built-in exponent function or operator.

For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.


Example 1:

Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.
Example 2:

Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.


Constraints:

0 <= x <= 231 - 1
     */
// 4    0  1 2     l=2, r=2  m = 1
    public static int mySqrt(int x) {
        int l = 0;
        int r = x;

        while (l<=r){
            int m = l + (r-l)/2;
            long square = (long) m * m;
            if(x==square){
                return m;
            } else if( x > square){
                l = m+1;
            } else {
                r = m-1;
            }
        }
        return r;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(6));
    }
}
