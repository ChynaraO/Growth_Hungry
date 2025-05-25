package LeetCode;

public class P_2_PalindromeNum {
    public static boolean isPalindrome(int x){
        if((x<0) || x>0 && x%10==0){
            return false;
        }
        int reversedHalf = 0;
        while(x>reversedHalf){
            int digit = x%10;
            reversedHalf = reversedHalf *10 + digit;
            x=x/10;
        }
        return (x==reversedHalf || reversedHalf/10 == x);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(122));
        System.out.println(isPalindrome(4114));
    }
}
