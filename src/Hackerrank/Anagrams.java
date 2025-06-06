package Hackerrank;

import java.util.Arrays;

public class Anagrams {
    /*
    Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies.
    For this challenge, the test is not case-sensitive.
    For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

Function Description

Complete the isAnagram function in the editor.

isAnagram has the following parameters:

string a: the first string
string b: the second string
Returns

boolean: If  and  are case-insensitive anagrams, return true. Otherwise, return false.
Input Format

The first line contains a string .
The second line contains a string .

Constraints

Strings  and  consist of English alphabetic characters.
The comparison should NOT be case sensitive.
     */
public  static boolean isAnagram(String a, String b) {

        if(a.length() != b.length()){
            return false;
        }
        a = a.toLowerCase();
        b = b.toLowerCase();

        int [] letters = new int[26];

        for(int i = 0; i<a.length(); i++){
            letters[a.charAt(i) - 'a']++;
        }
        for(int i = 0; i<a.length(); i++){
            letters[b.charAt(i) - 'a']--;
        }
    System.out.println(Arrays.toString(letters));
        for(int i : letters){
           if(i!=0){
               return false;
           }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("level", "level"));
    }
}
