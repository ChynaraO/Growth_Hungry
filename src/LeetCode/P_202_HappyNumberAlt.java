package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class P_202_HappyNumberAlt {
    public static void main(String[] args) {
        System.out.println(happyNumber(19)); //true
        System.out.println(happyNumber(2)); //false
    }

    public static boolean happyNumber(int n) {
        Set<Integer> setOfSums = new HashSet<>();
        while (n != 1 && !setOfSums.contains(n)) {
            setOfSums.add(n);
            n = sumOfDigits(n);
        }
        return n == 1;
    }

    private static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n = n / 10;
        }
        return sum;
    }
}
