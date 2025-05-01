

import java.util.Scanner;

public class Task260 {
    /*
    Решить в целых числах уравнение ax + b = 0.

Входные данные
Вводятся 2 целых числа: a и b.

Выходные данные
Необходимо вывести все решения, если их число конечно,
 “NO” (без кавычек), если решений нет,
  и “INF” (без кавычек), если решений бесконечно много.
  ax + b = 0
  6
  -2
  6x -2 =0
  6x = 2
  x = 2 /6
  x = 1/3
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a == 0 & b != 0){
            System.out.println("NO");
        }else if (a==0 & b==0){
            System.out.println("INF");
        } else {
            int x = -b / a;
            if (-b % a == 0) {
                System.out.println(x);
            } else {
                System.out.println("NO");
            }
        }
    }
}
