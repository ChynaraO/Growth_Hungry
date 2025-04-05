package Java.week1;

import java.util.Arrays;
import java.util.Scanner;

public class Java_W2_Loops {
    public static void main(String[] args){
        String[] months = new String[12];
        String [] months1 = new String [] {
                "January",
        "February",
        "March",
        "April"};
        for (int i = months1.length - 1; i >= 0; i--){
            System.out.println(months1[i]);
        }
        System.out.println(Arrays.toString(months1));
        //triangle *
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
