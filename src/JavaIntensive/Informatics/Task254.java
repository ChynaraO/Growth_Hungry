package JavaIntensive.Informatics;

import java.util.Scanner;

public class Task254 {
    /*
    Требуется определить,
    бьет ли ладья,
    стоящая на клетке с указанными координатами
    (номер строки и номер столбца),
    фигуру, стоящую на другой указанной клетке.

Входные данные
Вводятся четыре числа:
координаты ладьи (два числа) и
координаты другой фигуры (два числа),
каждое число вводится в отдельной строке.
Координаты - целые числа в интервале от 1 до 8.

Выходные данные
Требуется вывести слово YES,
если ладья сможет побить фигуру за 1 ход и NO - в противном случае.
     */
    /*
     # # # # # # # #
     # # # # # # # #
     # # # # # # # #
     # # # # # # # #
     # # # # # # # #
     # # # # # # # #
     # # # # # # # #
     L # # # # # # #
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int LadyaX = scanner.nextInt();
        int LadyaY = scanner.nextInt();

        int ProtivnikX = scanner.nextInt();
        int ProtivnikY = scanner.nextInt();
        if(LadyaX == ProtivnikX | LadyaY == ProtivnikY){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }


}
