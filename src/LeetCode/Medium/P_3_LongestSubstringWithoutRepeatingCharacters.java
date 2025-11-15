package LeetCode.Medium;

import java.util.HashSet;
import java.util.Set;

public class P_3_LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int maxValue = 0;
        for(int start = 0; start < s.length(); start++){
            Set<Character> seenLetter = new HashSet<>();
            for(int end = start; end < s.length(); end++){
                char letter = s.charAt(end);

                if(seenLetter.contains(letter)){
                    break;
                }
                seenLetter.add(letter);
                int currentLength = end - start + 1;
                maxValue = Math.max(maxValue, currentLength);
            }
        }
        return maxValue;
    }
}
