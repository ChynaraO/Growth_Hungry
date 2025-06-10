package Hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        // Write your code here.
        String[] strings = s.trim().split("[^A-Za-z]+");

        // An apple, banana + .
        if(s.trim().isEmpty()){
            System.out.println(0);
        }else{
            System.out.println(strings.length);
            for(String st : strings){
                System.out.println(st);
            }
        }
    }

}
