package JavaIntensive.Informatics;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Task258 {
    public static void main(String[] args) {
        /*
        Требуется определить, можно ли от шоколадки размером n × m долек отломить k долек, если разрешается сделать один разлом по прямой между дольками (то есть разломить шоколадку на два прямоугольника).

Входные данные
Вводятся 3 числа: n, m и k; k не равно n × m. Гарантируется, что количество долек в шоколадке не превосходит 30000.

Выходные данные
Программа должна вывести слово YES, если возможно отломить указанное число долек, в противном случае вывести слово NO.

Примеры
3 2 4 yes
3 2 1 no
         */
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int k = scanner.nextInt();

        if (k < (m*n) & (k%n==0 | k%m==0)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
