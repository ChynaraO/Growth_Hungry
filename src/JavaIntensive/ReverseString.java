package JavaIntensive;

public class ReverseString {
    public static String reverse(String s){
        String result = "";
        char[] chars = s.toCharArray();
        for(int i=s.length()-1; i >=0; i--){
           result = result + s.charAt(i);
        }
        return result;
    }
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        while (n % 2 == 0) {
            n /= 2;
        }
        return n == 1;
    }
       public static void main(String[] args) {
           String str = "Gulnara";
           System.out.println(reverse(str));
       }
}
