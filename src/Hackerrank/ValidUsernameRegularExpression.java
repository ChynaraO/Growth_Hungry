package Hackerrank;

import java.util.Scanner;

public class ValidUsernameRegularExpression {
    public class UsernameValidator{
        public static final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
    }

    public static void main(String[] args) {
        Scanner scsnner = new Scanner(System.in);
        int n = Integer.parseInt(scsnner.nextLine());
        // 3 2 1
         while(n-- > 0){
             String username = scsnner.nextLine();
             if(username.matches(UsernameValidator.regularExpression)){
                 System.out.println("Valid");
             } else {
                 System.out.println("Invalid");
             }
         }
    }
}
