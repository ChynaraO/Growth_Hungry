package Hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        List<Integer> nums = new ArrayList<>();

        while(num>0){
            nums.add(sc.nextInt());
            num--;
        }
        int numOfQ = sc.nextInt();

        while(numOfQ > 0){
            numOfQ--;
            String s = sc.next();
            if(s.equalsIgnoreCase("Insert")){
                int index = sc.nextInt();
                int incertedNum = sc.nextInt();
                nums.add(index, incertedNum);
            } else if(s.equalsIgnoreCase("Delete")){
                int index = sc.nextInt();
                nums.remove(index);
            }
        }

        sc.close();
        for (int v : nums) {
            System.out.print(v + " ");
        }

    }
}
