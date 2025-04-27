package JavaIntensive.W3Class;

import java.util.Scanner;

public class Polindrome {

    public static String reverse (String s){
       String reversed = "";
        for(int i = s.length()-1;  i>= 0; --i){
            reversed += s.charAt(i);
        }
        if (s.equals(reversed)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not polindrome");
        }
       return reversed;
    }
    public static void main(String[] args) {
        //the same if we reverse it: level

        System.out.println();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String reversed = reverse(s);

        System.out.println(reversed);
    }
}
