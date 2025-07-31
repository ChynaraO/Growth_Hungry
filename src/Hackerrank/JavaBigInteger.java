package Hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine().trim();
        String b = s.nextLine().trim();

        BigInteger biga = new BigInteger(a);
        BigInteger bigb = new BigInteger(b);
        BigInteger sum = biga.add(bigb);
        BigInteger product = biga.multiply(bigb);
        System.out.println(sum);
        System.out.println(product);

    }
}
