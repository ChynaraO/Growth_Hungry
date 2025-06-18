package Hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaArrayList {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner = new Scanner(System.in);
        System.out.println("nubmerLine");
        int numberLine = scanner.nextInt();
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
        //{{41, 77, 74,22,44}, {12}, {37,34,36,52}, {}, {20,22,33}}

        for(int i = 0; i<numberLine; i++){
            System.out.println("numCount");

            int numCount = scanner.nextInt();
            ArrayList<Integer> innerArrayList = new ArrayList<>();
            for(int j = 0; j<numCount; j++){

                System.out.println("num");
                int num = scanner.nextInt();
                innerArrayList.add(num);
            } arrayList.add(innerArrayList);
        }
        System.out.println("q");

        int q = scanner.nextInt();
        for(int k= 0; k<q; k++){
            System.out.println("x");

            int x = scanner.nextInt();
            System.out.println("y");

            int y = scanner.nextInt();
            try { System.out.println(arrayList.get(x-1).get(y-1));}
            catch(IndexOutOfBoundsException e){
                System.out.println("ERROR!");
            }
        }
        scanner.close();
    }
}
