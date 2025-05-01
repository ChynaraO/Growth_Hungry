package JavaIntensive.Informatics;

import java.util.Scanner;

public class Task333 {
   /*
    Задача №333. Четные числа
    Входные данные
    Вводятся целые числа a и b. Гарантируется, что a не превосходит b
    Выходные данные
    Выведите (через пробел) все четные числа от a до b (включительно).
*/
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int a = scanner.nextInt();
       int b = scanner.nextInt();

       // 2 3 4 5 6     for
       // a % 2 == 0   %
       // System.out.print();

       for (int i = a; i <= b; i++){
           if (i%2==0){
               System.out.print(i + " ");
           }
       }

   }

}
