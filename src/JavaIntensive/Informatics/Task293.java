package JavaIntensive.Informatics;

import java.util.Scanner;

public class Task293 {
    /*
Задача №293. Какое из чисел больше?
Входные данные
Даны два целых числа, каждое записано в отдельной строке.

Выходные данные
Программа должна вывести число 1,
 если первое число больше второго,
  число 2,
   если второе больше первого, или число 0, если они равны.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            System.out.println(1);
        } else if (a < b) {
            System.out.println(2);
        } else {
            System.out.println(0);
        }
    }
}
