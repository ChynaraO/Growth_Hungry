package DesignPatterns.Creational.Builder;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        User user = new User.Builder()
                .firstName("John")
                .lastName("Doe")
                .age(30)
                .email("john@example.com")
                .build();
        System.out.println(user);
//        User notPreferable = new User("John", "Doe", 31, "@mail");
//        System.out.println(notPreferable);
        int[] n = {1,2,3};
        System.out.println(Arrays.toString(plusOne(n)));
    }
    public static int[] plusOne(int[] digits) {
        int length = digits.length;
        for(int i = length-1; i>=0; i--){
            if(digits[i]!=9){
                digits[i]++;
                return digits;
            }else{
                digits[i] = 0;
                digits[i-1]++;
            }
        }
        int [] res = new int[length+1];
        res[0] = 1;
        return res;
    }
}
