package LeetCode;


public class P_13_RomanToInteger_Switch {
    public static int romanToInteger(String s){
        int result = 0;
        for (int i = 0; i<s.length(); i++){
            int currentValue = valueOf(s.charAt(i));
            if(i + 1 < s.length() && valueOf(s.charAt(i+1))> currentValue){
                result = result - currentValue;
            }else {
                result += currentValue;
            }
        }
        return  result;
    }
    public static int valueOf(char c){
        switch(c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default:return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(romanToInteger("III"));
        System.out.println(romanToInteger("IV"));
        System.out.println(romanToInteger("MCMXCIV"));
    }
}
