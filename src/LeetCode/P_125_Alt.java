package LeetCode;

public class P_125_Alt {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^0-9a-z]", "");
        return helper(s, 0, s.length()-1);
    }
    private static boolean helper(String s, int left, int right){
        String palindrome = s;
        char[] characters = s.toCharArray();
        while(left<right){
            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;
            left++;
            right--;
        }
        s = String.valueOf(characters);
        return palindrome.equals(s);
    }

    public static void main(String[] args) {
        String s = "Chynara";
        System.out.println(isPalindrome(s));
        System.out.println(isPalindrome("Anna"));

    }
}
