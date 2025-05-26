package LeetCode;

public class P_13_RomanToInteger_Recursion {

        public static int romanToInt(String s){
            if (s.isEmpty()) return 0;
            int firstValue = valueOf(s.charAt(0));
            //if next integer exists and is greater - subtract current value
            if (s.length() >=2 && valueOf(s.charAt(1)) > firstValue){
                return -firstValue + romanToInt(s.substring(1));
            } else{
                return firstValue + romanToInt(s.substring(1));
            }

        }

        // Same helper as before
        public static int valueOf(char c) {
            switch (c) {
                case 'I': return 1;
                case 'V': return 5;
                case 'X': return 10;
                case 'L': return 50;
                case 'C': return 100;
                case 'D': return 500;
                case 'M': return 1000;
                default: return 0;
            }
        }

        public static void main(String[] args) {
            System.out.println(romanToInt("III"));       // 3 1
            System.out.println(romanToInt("LVIII"));     // 58
            System.out.println(romanToInt("MCMXCIV"));   // 1994
        }


}
