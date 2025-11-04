package LeetCode;

public class P_344_ReverSeStringRecursion {
    public static void reverseString(char[] s) {
        helper(s, s.length-1);
    }
    public static void helper(char [] chars, int index){
        if(index<0){
            return;
        }
        System.out.print(chars[index]);
        helper(chars, index-1);
    }

    public static void main(String[] args) {
        char [] s = {'a','b', 'c'};
        reverseString(s);
    }
}
