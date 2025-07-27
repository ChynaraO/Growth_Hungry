package LeetCode;

public class P_67_AddBinary {
    /*
    Given two binary strings a and b, return their sum as a binary string.

Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"
     */
        public static String addBinary(String s1, String s2) {
            // Trim any leading zeros (optional)
            s1 = trimLeadingZeros(s1);
            s2 = trimLeadingZeros(s2);
            // Make sure s1 is the longer string
            if (s1.length() < s2.length()) {
                return addBinary(s2, s1);
            }
//            int n = s1.length(), m = s2.length();
            int carry = 0;
            StringBuilder result = new StringBuilder();
            // Add from least significant bit to most
            for (int i = s1.length() - 1, j = s2.length() - 1; i >= 0; i--, j--) {
                int bit1 = s1.charAt(i) - '0';
                int sum = bit1 + carry;
                if (j >= 0) sum += (s2.charAt(j) - '0');
                result.append((char) ('0' + (sum % 2)));
                carry = sum / 2;
            }
            if (carry > 0) {
                result.append('1');
            }
            return result.reverse().toString();
        }

        private static String trimLeadingZeros(String s) {
            int idx = s.indexOf('1');
            return (idx == -1) ? "0" : s.substring(idx);
        }

    public static void main(String[] args) {
        System.out.println(addBinary("1010" , "1011"));
    }
}
