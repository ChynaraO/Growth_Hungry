

import java.util.Scanner;
/*Входные данные
Даны два целых числа, каждое число записано в отдельной строке.

        Выходные данные
Выведите наибольшее из данных чисел.*/
public class Task292 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int num1 = sc.nextInt(); //1
        int num2 = sc.nextInt();  //2

        int maxNum = Math.max(num1, num2);
        System.out.println(maxNum);
    }
}
