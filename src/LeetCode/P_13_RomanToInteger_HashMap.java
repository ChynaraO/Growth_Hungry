package LeetCode;


import java.util.HashMap;
import java.util.Map;

public class P_13_RomanToInteger_HashMap {
    public static int romanToInteger(String s){
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C',100);
        roman.put('D', 500);
        roman.put('M', 1000);

        int result = 0;
        for (int i = 0; i<s.length(); i++){
            int currentValue = roman.get(s.charAt(i));

            if(i+1< s.length() && roman.get(s.charAt(i+1))> currentValue){
                result -= currentValue;
            }else {
                result+=currentValue;
            }
        }
    return result;


    }

    public static void main(String[] args) {
        System.out.println(romanToInteger("XIX"));
        System.out.println(romanToInteger("IV"));
        System.out.println(romanToInteger("MCMXCIV"));
    }
}
