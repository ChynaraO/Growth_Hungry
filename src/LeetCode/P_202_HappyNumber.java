package LeetCode;

import java.util.HashSet;

public class P_202_HappyNumber {
    private static int sumOfMod(int n) {
        int total = 0;
        while(n>0){
            int mod = n%10;
            total += mod*mod;
            n /= 10;
        }
        return total;
    }
    public static boolean happyNumber(int n){
        HashSet<Integer> set = new HashSet<>();
        while(n!=1 && !set.contains(n)){
            set.add(n);
            n = sumOfMod(n);
        }
        return n==1;
    }

    public static void main(String[] args) {
        System.out.println(happyNumber(19));//true
        System.out.println(happyNumber(2));//true

    }
}
