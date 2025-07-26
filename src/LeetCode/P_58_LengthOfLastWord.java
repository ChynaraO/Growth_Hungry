package LeetCode;

public class P_58_LengthOfLastWord {
    public static int lengthOfLastWord(String s){
        String[] strings = s.split(" ");
        return strings[strings.length-1].length();
    }

    public static void main(String[] args) {
        String s = "My mom is abroad  ";
        System.out.println(lengthOfLastWord(s));
    }
}
