package LeetCode;

public class P_191_numberOf1Bits {
    public static int hammingWeight(int n) {
        int answer = 0;
        for (int i = 0; i<=30; i++){
            int bitmask = 1<<i;
            if((n & bitmask) > 0)
                answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight(11));
        //00000000000000000000000000001011
        //Numbers in Java are already binary in memory — you don’t see it, but it’s there.
        //And bitwise operators like &, |, ^, ~, <<, >> work directly on those bits.
        //
        //That’s why you can use & with bitmask to check whether a particular bit is 1 or 0.
        System.out.println(hammingWeight(128));        // 1
        System.out.println(hammingWeight(2147483645)); // 30
        //If we wanted to see the binary string version of n, we could print it like this:
        System.out.println(Integer.toBinaryString(11));
        System.out.println(Integer.toBinaryString(128));
// Output: "1011"

    }
}
