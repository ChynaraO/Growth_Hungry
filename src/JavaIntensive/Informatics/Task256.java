package JavaIntensive.Informatics;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Task256 {
    /*
    Требуется определить, бьет ли ферзь, стоящий на клетке с указанными координатами (номер строки и номер столбца), фигуру, стоящую на другой указанной клетке.

Входные данные
Вводятся четыре числа: координаты ферзя и координаты другой фигуры. Координаты - целые числа в интервале от 1 до 8.

Выходные данные
Требуется вывести слово YES, если ферзь может побить фигуру за 1 ход, в противном случае вывести слово NO
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int QueenLine = scanner.nextInt();
        int QueenColumn = scanner.nextInt();

        int EnemnyLine = scanner.nextInt();
        int Enemycolumn = scanner.nextInt();
        if((abs(QueenLine - EnemnyLine) == abs(QueenColumn - Enemycolumn)) | (
                QueenLine == EnemnyLine | QueenColumn == Enemycolumn)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
