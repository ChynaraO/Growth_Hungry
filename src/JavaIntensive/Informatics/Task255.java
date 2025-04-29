package JavaIntensive.Informatics;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Task255 {
    /*
    Требуется определить, бьет ли слон, стоящий на клетке с
    указанными координатами (номер строки и номер столбца), фигуру,
    стоящую на другой указанной клетке.

Входные данные
Вводятся четыре числа: координаты слона и координаты другой фигуры.
Координаты - целые числа в интервале от 1 до 8.

Выходные данные
Требуется вывести слово YES, если слон способен побить фигуру за 1 ход,
в противном случае вывести слово NO
     */
    /*
     # # E # # # # #
     # # # # # # # #
     # # # # # # # #
     # # # # # # # #
     # # # # # # # #
     # Q # # # # # #
     # # # # # # # #
     # # # # # # # #
     */
    // 1 1   8 1 Yes
    // 3 2   8 3 No

     // 2 3   4 5
    // 2 3    4 4
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int BishopLine = scanner.nextInt();
         int BishopColumn = scanner.nextInt();

         int EnemnyLine = scanner.nextInt();
         int Enemycolumn = scanner.nextInt();
         if(abs(BishopLine - EnemnyLine) == abs(BishopColumn - Enemycolumn)){
             System.out.println("YES");
         }else {
             System.out.println("NO");
         }

     }
}
