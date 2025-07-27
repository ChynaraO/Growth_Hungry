package LeetCode;

public class P_387_FirtsUniiwueCharacterInAString {
    /*
    Given a string s, find the first non-repeating character in it and return its index.
    If it does not exist, return -1.



Example 1:

Input: s = "leetcode"

Output: 0

Explanation:

The character 'l' at index 0 is the first character that does not occur at any other index.
     */

    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetlode"));
    }
    public static int firstUniqChar(String s){
        int [] letters = new int[26];
        for(int i = 0; i<s.length(); i++){
            letters[s.charAt(i)-'a']++;
        }
        for (int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(letters[c -'a']==1){
                return i;
            }
        } return -1;
    }
}
