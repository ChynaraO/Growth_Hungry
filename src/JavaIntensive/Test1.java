package JavaIntensive;

import java.util.Stack;

public class Test1 {
    public static boolean isValid(String s) {
    //  })]
        //String[] testStrings = {"()", "()[]{}", "(]", "([)]", "{[]}"};

        Stack<Character> stack = new Stack<>();
        char [] chars = s.toCharArray();
        for(char c : chars){
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                    if (stack.isEmpty()){
                        return false;
                    }
                    char popped = stack.pop();
                    if( c == ')' && popped != '(') {
                        return false;
                    } else if ( c== '}' && popped != '{'){
                        return false;
                    } else if (c == ']' && popped != '['){
                        return false;
                    }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        //{"()", "()[]{}", "(]", "([)]", "{[]}"}
        System.out.println(valid("([]}"));
    }
    public static boolean valid(String str){
    Stack<Character> stack = new Stack<>();
    char[] chars = str.toCharArray();

    for(int i = 0; i<chars.length; i++){
        char ch = chars[i];
        if(ch == '{' || ch =='[' || ch=='('){
            stack.push(ch);
        }else{
            if(stack.isEmpty()){
                return false;
            }
            char popped = stack.pop();
            if((ch == ')' && popped!='(') || (ch == '}' && popped!='{') || (ch == ']' && popped!='[')){
                return false;
            }
        }
    }return stack.isEmpty();
    }
}
