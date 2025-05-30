package LeetCode;

import java.util.Stack;

public class P_20_ValidParentheses {
    /*
    Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.


Example 1:

Input: s = "()"

Output: true

Example 2:

Input: s = "()[]{}"

Output: true

Example 3:

Input: s = "(]"

Output: false

Example 4:

Input: s = "([])"

Output: true


     */
    public static boolean isValid(String s){
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack();
        for(char c : chars){
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
            } else if (c == ')'|| c==']' || c =='}') {
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if(c == ')' && top!= '(' ||
                        c == ']' && top!= '[' ||
                        c == '}' && top!= '{'
                ) return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()()"));
        System.out.println(isValid("})()"));
    }
}
