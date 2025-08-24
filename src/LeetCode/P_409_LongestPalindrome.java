package LeetCode;

import java.util.HashSet;

public class P_409_LongestPalindrome {
    public static int longestPalindrome(String s) {
        if(s == null || s.length() == 0) return 0;

        HashSet<Character> setofChar = new HashSet<>();
        int count = 0;
        for(char c : s.toCharArray()){
            if(setofChar.contains(c)){
                count+=2;
                setofChar.remove(c);
            } else {
                setofChar.add(c);
            }
        }
        if(!setofChar.isEmpty()) count++;
        return count;

    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("abccccdd"));
    }
}
