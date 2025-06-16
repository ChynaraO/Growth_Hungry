package Hackerrank;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class JavaPrimaryTest {

        public static void main(String[] args) throws IOException {
            Scanner scanner =new Scanner(System.in);
            //1  2  3  4  5  6
            //N. Y  Y  N  Y. N

            BigInteger bigInteger = scanner.nextBigInteger();
            scanner.close();

            if(bigInteger.isProbablePrime(10)){
                System.out.println("prime");
            }else{
                System.out.println("not prime");
            }
        }


}
