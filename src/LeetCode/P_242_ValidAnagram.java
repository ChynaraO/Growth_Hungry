package LeetCode;

import java.util.Arrays;

public class P_242_ValidAnagram {
    public static boolean isAnagram (String s, String t) {
//        char[] sCharArray = s.toCharArray();
//        char[] tCharArray = t.toCharArray();
//        Arrays.sort(sCharArray);
//        Arrays.sort(tCharArray);
//        return Arrays.equals(sCharArray, tCharArray);
//
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) freq[s.charAt(i) - 'a']++;
        // freq[s.charAt(0) == c
        // c - 'a' = 99 - 97(ascii table) = 2
        // freq[2] freq at position 2 is 0 by default
        //freq[s.charAt(i) - 'a']++ == increase 0 by 1
       // [0,0,1,0..]

        for (int i = 0; i < t.length(); i++) freq[t.charAt(i) - 'a']--;
        for (int f : freq) if (f != 0) return false;
        return true;

    }



    public static void main(String[] args) {
        String a = "chynara";
        String b = "narach";
        System.out.println(isAnagram(a,b));
    }
}
