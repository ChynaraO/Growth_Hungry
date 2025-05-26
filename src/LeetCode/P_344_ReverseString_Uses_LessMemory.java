package LeetCode;

public class P_344_ReverseString_Uses_LessMemory {
    public static String reversedString(char[] s){
        int i = 0;
        int j = s.length -1;
        while ( i < j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
        System.out.println(s);

        return null;

    }

    public static void main(String[] args) {
        char[] s = {'s', 'm', 'a', 'r', 't'};
        System.out.println(reversedString(s));
    }
}
