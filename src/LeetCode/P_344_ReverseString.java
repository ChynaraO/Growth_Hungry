package LeetCode;

public class P_344_ReverseString {
    public static String reversedString(char[] s){

        char [] t = new StringBuilder().append(s).reverse().toString().toCharArray();
        System.arraycopy(t, 0, s,0, s.length);
        System.out.println(s);
        return null;

    }

    public static void main(String[] args) {
        char[] s = {'a', 'r', 't'};
        System.out.println(reversedString(s));
    }
}
