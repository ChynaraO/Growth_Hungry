package JavaIntensive.Informatics;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Task257 {
    /*
    Требуется определить, бьет ли конь, стоящий на клетке с указанными координатами (номер строки и номер столбца), фигуру, стоящую на другой указанной клетке.

Входные данные
Вводятся четыре числа: координаты коня и координаты другой фигуры. Все координаты - целые числа в интервале от 1 до 8.

Выходные данные
Программа должна вывести слово YES, если конь может побить фигуру за 1 ход, в противном случае вывести слово NO.
     */
    // 1 1  3 2 yes
    // 1 1  3 3  no
    // if the difference between lines 2 (a-b) & the difference between column 1
    // if the difference between lines 1 (a-b) & the difference between column 2

    /*
     # # # # # # # #
     # # # # # # # #
     # E # # # # # #
     # # # K # # # #
     # # # # # # # #
     # E E # # # # #
     # # # # # # # #
     K # # # # # # #
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int KightLine = scanner.nextInt();
        int KighColumn = scanner.nextInt();

        int EnemnyLine = scanner.nextInt();
        int Enemycolumn = scanner.nextInt();

        int LineDiff = abs(KightLine-EnemnyLine);
        int ColumnDiff = abs(KighColumn-Enemycolumn);
        if ((LineDiff == 1 & ColumnDiff == 2) | LineDiff == 2 & ColumnDiff ==1){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
