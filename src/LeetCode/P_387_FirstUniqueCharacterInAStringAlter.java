package LeetCode;

public class P_387_FirstUniqueCharacterInAStringAlter {
    /*
    Given a string s, find the first non-repeating character in it and return its index.
     If it does not exist, return -1.

Example 1:
Input: s = "leetcode"
Output: 0

Explanation:
The character 'l' at index 0 is the first character that does not occur at any other index.

Example 2:
Input: s = "loveleetcode"
Output: 2
Example 3:
Input: s = "aabb"
Output: -1
     */
    public static int firstUniqChar(String s) {
        int bestIndex = 1000000;
        for(char c = 'a'; c<= 'z'; c++){
            int first = s.indexOf(c);
            int last = s.lastIndexOf(c);
            if(first!= -1 && first==last){
                bestIndex = Math.min(bestIndex, first);
            }
        }
        if (bestIndex == 1000000) return -1;
        return bestIndex;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("LebtLode"));
    }
}
