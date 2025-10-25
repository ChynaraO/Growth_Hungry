package LeetCode;

public class P_383_RansomeNote {
    public static boolean canConstruct(String ransomNote, String magazine){
        int [] chars = new int[26];
        for(char c: magazine.toCharArray()){
            chars[c-'a']++;
        }
        for(char i : ransomNote.toCharArray()){
            chars[i-'a']--;
            if(chars[i-'a']<0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("al", "lai"));
    }
}
