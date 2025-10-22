package LeetCode.Medium;

public class P_204_CountPrime {
    public static int countPrimes(int n) {
        int count = 0;
        for(int i = 2; i<n; i++){
            if(isPrime(i)) count++;
        }
        return count;
    }
    private static boolean isPrime(int num){//3
        if(num<2) return false;

        for(int i = 2; i < num; i++){
            // 3  %  3 == 0
            if(num % i == 0) return false;
        }
        return true;
    }

    // 2,3,5,7,11
}
