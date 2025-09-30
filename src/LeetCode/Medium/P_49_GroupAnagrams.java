package LeetCode.Medium;

import java.util.*;

public class P_49_GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
       Map<String, List<String>> groupByChar = new HashMap<>();

       for(String word : strs){
           char[] chars = word.toCharArray();
           Arrays.sort(chars);
           String sortedC = new String(chars);
           if(!groupByChar.containsKey(sortedC)){
               groupByChar.put(sortedC, new ArrayList<>());
           }
           groupByChar.get(sortedC).add(word);
       }
       return new ArrayList<>(groupByChar.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println( groupAnagrams(strs)); // [["bat"],["nat","tan"],["ate","eat","tea"]]
    }
}
