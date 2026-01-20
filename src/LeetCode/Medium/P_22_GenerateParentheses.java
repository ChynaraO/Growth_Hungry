package LeetCode.Medium;

import java.util.ArrayList;
import java.util.List;

public class P_22_GenerateParentheses {
    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, 0, 0, "", n);
        return result;
    }
    private static void backtrack(List<String> result, int open, int close, String s, int n){
        if(s.length() == 2*n){
            result.add(s);
        }
        if(open<n){
            backtrack(result, open+1, close, s+"(", n);
        }
        if(close<open){
            backtrack(result, open, close+1, s+")", n);
        }
            }

    public static void main(String[] args) {
        System.out.println(generateParenthesis(2));
    }
}
