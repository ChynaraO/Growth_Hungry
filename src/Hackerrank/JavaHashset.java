package Hackerrank;

import java.util.HashSet;
import java.util.Scanner;

public class JavaHashset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        HashSet<String> pairs = new HashSet<>();
        for(int i = 0; i<n; i++){
            String first = sc.next();
            String second = sc.next();
            String pair = first + " " + second;
            pairs.add(pair);
            System.out.println(pairs.size());
        }
        sc.close();
    }
}
