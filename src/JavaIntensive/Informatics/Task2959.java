package JavaIntensive.Informatics;

import java.util.Scanner;

public class Task2959 {
    /*
    В математике функция sign(x) (знак числа) определена так:
sign(x) = 1,   если x > 0,
sign(x) = -1, если x < 0,
sign(x) = 0,   если x = 0.

Для данного числа x выведите значение sign(x).
Входные данные
Вводится число x.

Выходные данные
Выведите ответ на задачу.
     */
    //
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a > 0){
            System.out.println(1);
        } else if  (a < 0){
            System.out.println(-1);
        } else {
            System.out.println(0);
        }
    }
}
