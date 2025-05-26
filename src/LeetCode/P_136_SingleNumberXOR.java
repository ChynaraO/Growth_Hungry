package LeetCode;

public class P_136_SingleNumberXOR {
    /*
    XOR operation - " exclusive or"
    Defined: if only one of them is true;
    the result is true; otherwise is false;
    0 ^ 0 = 0
    0 ^ 1 = 1
    1 ^ 0 = 1
    1 ^ 1 = 0

    XOR operation on two 32-bit integers
    //0000...0001100 a = 12
    //0000...0001010 b = 10
    //0000...0000110 a ^ b = 6
     this is XOR operation in C++ / Java
     1. A property of XOR operation is that
     a^a = 0, i.e XOR of two equal numbers gives us 0 result

     more properties:
     2. (a^b)^c = a^(b^c)
     3. a^b = b^a

     examples:
     1. 0^0 = 0
     2. 0^0^0 = 0
     3. 0^0^a = a
     4. 0^a = a
     5. a^a = 0
     6. a^a^b = (a^a)^b  = 0^b = b (example 2^2^1 = 1)
     7. a^b^a = a^a^b = b
     8. a^b^c^a = (a^b)^b^c = 0^b^c = b^c
     9. c^a^b^a^b = c^(a^a)^(b^b) = c^0^0 = c (emaple 4^1^2^1^2 = 4)
     10. a^b^c^a^b^c^d = (a^a)^(b^b)^(c^c)^d = 0^0^0^d =d
     11. a^b^c^a^b = c
     [1,2,3,1,2,4,3] => ans should be 4 because
                        => (1^1)^(2^2)^(3^3)^4
     Let ans = 0. Iterate over nums array like for(int x : nums)
     and compute ans = ans ^ x
     ans ^ x =new_ans
     1: 000 ^ 001 = 001     ans(0) ^ X(1) = new_ans (1)
     2: 001 ^ 010 = 011     ans(1) ^ X(2) = new_ans (3)
     3: 011 ^ 011 = 000     ans(3) ^ X(3) = new_ans (0)
     1: 000 ^ 001 = 001     ans(0) ^ X(1) = new_ans (1)
     2: 001 ^ 010 = 011     ans(1) ^ X(2) = new_ans (3)
     4: 011 ^ 100 = 111     ans(3) ^ X(4) = new_ans (7)
     3: 111 ^ 011 = 100     ans(7) ^ X(3) = new_ans (4)
     Finally, ans = 4 as expected

     */
    public static int singleNumber (int[] nums){
        int result = 0;
        for(int x : nums){
            result = result ^ x;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,4,3,1};
        System.out.println(singleNumber(nums));
    }
}
