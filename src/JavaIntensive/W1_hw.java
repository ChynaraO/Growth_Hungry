package JavaIntensive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class W1_hw {

    //2
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        // /////////////////////////////////////////////////////////////////////////
        // If else statement
        /*Given an integer, , perform the following conditional actions:

        If  is odd, print Weird
        If  is even and in the inclusive range of  to , print Not Weird
        If  is even and in the inclusive range of  to , print Weird
        If  is even and greater than , print Not Weird
        Complete the stub code provided in your editor to print whether or not  is weird.
        */

        int N = scan.nextInt();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        boolean even = N % 2 ==0;
        if ((even & (2<=N && N<=5)) | (even & (N>20))){
            System.out.println("Not Weird");
        }else{
            System.out.println("Weird");
        }
//        scan.close();


        /*/// ////////////////////////////////////////////////
        There are three lines of output:

On the first line, print String: followed by the unaltered String read from stdin.
On the second line, print Double: followed by the unaltered double read from stdin.
On the third line, print Int: followed by the unaltered integer read from stdin.
To make the problem easier, a portion of the code is already provided in the editor.
         */
            System.out.println("Enter int:");
            int i = scan.nextInt();
            System.out.println("Enter double:");
            double d = scan.nextDouble();
            scan.nextLine();
            System.out.println("Enter String:");
            String s = scan.nextLine();


            // Write your code here.

            System.out.println("String: " + s);
            System.out.println("Double: " + d);
            System.out.println("Int: " + i);
/*// //////////////////////////////////////////////////////

 */

            System.out.println("================================");
            for(int k=0;k<3;k++){
                System.out.println("Print your word for formatted output");
                String s1 = scan.next();
                System.out.println("Print your num for formatted output");
                int x = scan.nextInt();
            System.out.printf("%-15s%03d",s1, x);
            System.out.println();
            }
            System.out.println("================================");


    // //////////////////////////////////////////////////////////////////////////////////////////////////
    // loop multiplication
    //bufferreader is to read large inputs or files
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int NBufferreader = Integer.parseInt(bufferedReader.readLine().trim());
        for (int l = 1; l<=10 ; l++){
        int multiples = NBufferreader * l;
        System.out.println(NBufferreader+" x "+l+" = "+multiples);
    }
//        bufferedReader.close();

        // //////////////////////////////////////////////////////////////////////////////////////////////
       // (a + 2^0 * b), (a + 2^0 * b + 2^1 * b) arithmetic series

        int t=scan.nextInt();
        for(int m=0;m<t;m++){
            int al = scan.nextInt();
            int bl = scan.nextInt();
            int nl = scan.nextInt();
            int sumValues = al;
            int cl = 1;
            for(int n = 1; n<=nl; n++){
                sumValues += cl* bl;
                System.out.print(sumValues+" ");
                cl*=2;
            }
            System.out.println();
        }

}


}
